import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.*;
import java.util.*;

public class ListenerBasico extends gramaticaParserBaseListener {

    private String nombreFichero, nombreFicheroHTML, nombrePrograma = "", funcionPrincipal;
	private HTML html = new HTML();
	private Dot dotFuncion = new Dot();
	private Dot dotPrograma = new Dot();
	private long sumLines, sum = 0;

	private Stack<String> pila = new Stack<String>();
	private ArrayList<String> imprimir = new ArrayList<String>();

	private Tabla tabla = new Tabla();
	private String name = "", nombreFuncion;
	private String parametros = "";
	private HashMap<String, ArrayList<Integer>> lineasLlamadas = new HashMap<String, ArrayList<Integer>>();

	private boolean funcionNueva = false, esLlamadaFuncion = false, esDeclaracion = false, tieneParametros = false;
	private int contadorLineas = 0, contadorParametros = 0;

    private ArrayList<Long> listaPuntosBucleBifurcacion = new ArrayList<Long>();
    
    private ArrayList<Integer> lineasCabecerasBucles = new ArrayList<Integer>();
	private ArrayList<Bucle> listaBucles = new ArrayList<Bucle>();
	private ArrayList<Bucle> listaBuclesFuncion = new ArrayList<Bucle>();
	private ArrayList<String> dotBucles = new ArrayList<String>();

	public ListenerBasico() {}

    // METODOS PARA LA PILA //

	@Override
	public void enterEveryRule(final ParserRuleContext ctx) {
		pila.push(gramaticaParser.ruleNames[ctx.getRuleIndex()]);
		for (int i = 0; i < pila.size(); i++) {
			imprimir.add('/' + pila.get(i));
		}
		imprimir.add("\n");
		// Provisional awa System.out.println(listaPuntosBucleBifurcacion);
	}

	@Override
	public void exitEveryRule(final ParserRuleContext ctx) {
		pila.pop();
	}

	@Override
	public void visitTerminal(final TerminalNode node) {
		pila.push((node.getSymbol().getType()) + ":" + node.getText());
		for (int i = 0; i < pila.size(); i++) {
			imprimir.add('/' + pila.get(i));
		}
		imprimir.add("\n");
		pila.pop();
	}

	@Override
	public void visitErrorNode(final ErrorNode node) {
    }
    
    // METODOS DE LA TABLA //

	@Override
	public void enterProg(gramaticaParser.ProgContext ctx) {
		System.out.println("estoy en enterProg");
		stringToDotPrograma("digraph {\n");
	}

	@Override 
	public void enterDefinicion(gramaticaParser.DefinicionContext ctx) {
		System.out.println("estoy en enterDefinicion");
		if (!listaPuntosBucleBifurcacion.isEmpty()) {
			sumValorBucleBifurcacion();
		} else {
			if (!funcionNueva) {
				Funcion temp = tabla.getTablaFunciones().get(name);
				temp.setNumberVariables(temp.getNumberVariables() + 1);
				temp.setVariablePoints(temp.getVariablePoints() + 1);
				tabla.setFunction(name, temp);
			}
		}
		if (esLlamadaFuncion) {
			esDeclaracion = true;
			Funcion temp = tabla.getTablaFunciones().get(name);
			temp.setFunctionCallsPoints(temp.getFunctionCallsPoints() + 1);
			tabla.setFunction(name, temp);
		}
    }

	@Override 
	public void exitDefinicion(gramaticaParser.DefinicionContext ctx) {
		System.out.println("estoy en exitDefinicion");
		if (esLlamadaFuncion) {
			esDeclaracion = false;
		}
	}

	@Override 
	public void enterFuncion(gramaticaParser.FuncionContext ctx) { 
		System.out.println("estoy en enterFunction");
		funcionNueva = true;
		int contador = tabla.countKeys();
		stringToDotPrograma("    subgraph cluster_" + contador + " {\n");
		stringToDotFuncion("digraph {\n    subgraph cluster {\n");
    }
    
	@Override 
	public void exitFuncion(gramaticaParser.FuncionContext ctx) { 
		System.out.println("estoy en exitFunction");
		tabla.getTablaFunciones().get(name).setUltimaLinea(contadorLineas - 1);
		if (dotFuncion.getTextDot().get(dotFuncion.getTextDot().size() - 1)
				.substring(dotFuncion.getTextDot().get(dotFuncion.getTextDot().size() - 1).length() - 4)
				.equals(" -> ")) {
			ArrayList<String> temporal = dotFuncion.getTextDot();
			temporal.add(dotFuncion.getTextDot().get(dotFuncion.getTextDot().size() - 1).substring(0,
					dotFuncion.getTextDot().get(dotFuncion.getTextDot().size() - 1).length() - 4));
			temporal.remove(temporal.size() - 2);
			dotFuncion.setTextDot(temporal);
		}
		if (dotPrograma.getTextDot().get(dotPrograma.getTextDot().size() - 1)
				.substring(dotPrograma.getTextDot().get(dotPrograma.getTextDot().size() - 1).length() - 4)
				.equals(" -> ")) {
			ArrayList<String> temporal = dotPrograma.getTextDot();
			temporal.add(dotPrograma.getTextDot().get(dotPrograma.getTextDot().size() - 1).substring(0,
					dotPrograma.getTextDot().get(dotPrograma.getTextDot().size() - 1).length() - 4));
			temporal.remove(temporal.size() - 2);
			dotPrograma.setTextDot(temporal);
		}
		stringToDotPrograma(";\n    }\n");
        stringToDotFuncion(";\n    }\n");
        
		int actual, reservado = 0;
		ArrayList<Integer> reservados = new ArrayList<Integer>();
		for(int i = listaBuclesFuncion.size() - 1; i > -1; i--) {
			actual = listaBuclesFuncion.get(i).getLineaBucleArriba();
			if (!reservados.contains(actual) && actual != -1) {
				dotBucles.add(listaBuclesFuncion.get(i).inicioToArriba());
				reservados.add(listaBuclesFuncion.get(i).getLineaBucleArriba());
			}
		}
		listaBuclesFuncion = new ArrayList<Bucle>();

		Set<String> temp = new HashSet<>();
		temp.addAll(dotBucles);
		for(String cadena : temp) {
			stringToDotFuncion(cadena);
			stringToDotPrograma(cadena);
		}
        dotBucles.clear();
        
		stringToDotFuncion("    start -> linea" + tabla.getTablaFunciones().get(name).getPrimeraLinea()
				+ ";\n    linea" + tabla.getTablaFunciones().get(name).getUltimaLinea()
				+ " -> end;\n    start [style=filled, color=red];\n    end [style=filled, color=blue];\n}");

		dotFuncion.escribirFicheroDot(tabla.getTablaFunciones().get(name).getNombreFuncion());
		convertDotToSvg(tabla.getTablaFunciones().get(name).getNombreFuncion());
		dotFuncion.setTextDot(new ArrayList<String>());
    }

	@Override 
	public void enterDev_funcion(gramaticaParser.Dev_funcionContext ctx) { 
		System.out.println("estoy en enterDev_funcion");
		if (ctx.equals("")) {
			name += ctx.var().identificador().getText();  
		}
	}

	@Override 
	public void enterNombre_funcion(gramaticaParser.Nombre_funcionContext ctx) { 
		System.out.println("estoy en enterNombre_funcion");
		if (funcionNueva) { 
			name += ctx.identificador().getText();
			nombreFuncion = ctx.identificador().getText();
			System.out.println(name);
			stringToDotFuncion("        label = \"" + name + "\";\n");
			stringToDotPrograma("        label = \"" + name + "\";\n");
		}
	}

	@Override 
	public void enterParametros_funcion(gramaticaParser.Parametros_funcionContext ctx) {
		System.out.println("estoy en enterParametrosFuncion");
		if (funcionNueva) {
			contadorParametros++;
			parametros += ctx.getText() + ", ";
			tieneParametros = true;
		}
	}

	@Override 
	public void enterCabecera_funcion(gramaticaParser.Cabecera_funcionContext ctx) {
		System.out.println("estoy en enterCabecera");
	}

	@Override 
	public void exitCabecera_funcion(gramaticaParser.Cabecera_funcionContext ctx) {
		System.out.println("estoy en exitCabecera");
		if (tieneParametros) {
			parametros = parametros.substring(0, parametros.length() - 2);
			name += "(" + parametros + ")"; 
		} else {
			name += "()";
		}
		funcionNueva = false;
		if (!listaPuntosBucleBifurcacion.isEmpty()) {
			if (esLlamadaFuncion) {
				sumValorBucleBifurcacion();
			}
		} else {
			if (esLlamadaFuncion && !esDeclaracion) {
				Funcion temp = tabla.getTablaFunciones().get(name);
				temp.setFunctionCallsPoints(temp.getFunctionCallsPoints() + 1);
				tabla.setFunction(name, temp);
			}
		}

		Funcion temp2 = new Funcion();
		temp2.setNumberVariables(temp2.getNumberVariables() + contadorParametros);
		temp2.setVariablePoints(temp2.getVariablePoints() + contadorParametros);
		temp2.setParameterCallsPoints(temp2.getParemeterCallsPoints() + (contadorParametros * 2));
		temp2.setNumberParameters(temp2.getNumberParameters() + contadorParametros);
		temp2.setNombreFuncion(nombreFuncion);
		tabla.addFunction(name, temp2);

		parametros = "";
		contadorParametros = 0;
		tabla.getTablaFunciones().get(name).setPrimeraLinea(contadorLineas);
		if (tieneParametros) {
			sumarPuntoLineaEfectiva();
			tieneParametros = false;
			crearLineaGrafo();
		}
	}

	@Override 
	public void enterLinea(gramaticaParser.LineaContext ctx) {
		System.out.println("estoy en enterLinea");
		sumarPuntoLineaEfectiva();
		crearLineaGrafo();
	}

	@Override 
	public void exitLinea(gramaticaParser.LineaContext ctx) { 
		System.out.println("estoy en exitLinea");
		/*
		 * sumarPuntoLineaEfectiva();
		 * 
		 * stringToDotFuncion("        linea" + contadorLineas + " -> ");
		 * stringToDotPrograma("        linea" + contadorLineas + " -> ");
		 * contadorLineas++; stringToDotFuncion("linea" + contadorLineas + ";\n");
		 * stringToDotPrograma("linea" + contadorLineas + ";\n");
		 */
	}
	
	// SI //

	@Override 
	public void enterPr_si(gramaticaParser.Pr_siContext ctx) {
		System.out.println("estoy en enterPr_si");
		addValorBucleBifurcacion();
	}

	@Override 
	public void exitCabecera_si(gramaticaParser.Cabecera_siContext ctx) { 
		System.out.println("estoy en exitCabecera_si");
		sumarPuntoLineaEfectiva();
		crearLineaGrafo();
	}

	@Override 
	public void exitCuerpo_si(gramaticaParser.Cuerpo_siContext ctx) { 
		System.out.println("estoy en exitCuerpo_si");
		terminarBucleBifurcacion();
	}

	// MIENTRAS //

	@Override
	public void enterPr_mientras(gramaticaParser.Pr_mientrasContext ctx) { 
		System.out.println("estoy en enterPr_mientras");
		addValorBucleBifurcacion();
	}

	@Override 
	public void exitCabecera_mientras(gramaticaParser.Cabecera_mientrasContext ctx) {
		System.out.println("estoy en exitCabecera_mientras");
		sumarPuntoLineaEfectiva();
		Bucle temp = new Bucle();
		if (!lineasCabecerasBucles.isEmpty()) {
			temp.setLineaBucleArriba(lineasCabecerasBucles.get(lineasCabecerasBucles.size() - 1));
		}
		temp.setlineaInicio(contadorLineas);
		listaBucles.add(temp);
		listaBuclesFuncion.add(temp);
		lineasCabecerasBucles.add(contadorLineas);
		crearLineaGrafo();
	}

	@Override 
	public void exitBucle_mientras(gramaticaParser.Bucle_mientrasContext ctx) {
		System.out.println("estoy en exitBucle_mientras");
		Bucle temp = listaBucles.get(listaBucles.size() - 1);
		Bucle temp2 = listaBuclesFuncion.get(listaBuclesFuncion.size() - 1);
		temp.setLineaFinal(contadorLineas - 1);
		temp2.setLineaFinal(contadorLineas - 1);

		listaBucles.set(listaBucles.size() - 1, temp);
		listaBuclesFuncion.set(listaBuclesFuncion.size() - 1, temp2);
		dotBucles.add(listaBucles.get(listaBucles.size() - 1).finalToInicio());
		dotBucles.add(listaBucles.get(listaBucles.size() - 1).noEntraBucle());
		listaBucles.remove(listaBucles.size() - 1);

		lineasCabecerasBucles.remove(lineasCabecerasBucles.size() - 1);

		terminarBucleBifurcacion();
	}

	// FOR //

	@Override 
	public void enterPr_para(gramaticaParser.Pr_paraContext ctx) {
		System.out.println("estoy en enterPr_para");
		addValorBucleBifurcacion();
	}

	@Override 
	public void exitCabecera_para(gramaticaParser.Cabecera_paraContext ctx) { 
		System.out.println("estoy en exitCabecera_para");
		sumarPuntoLineaEfectiva();
		sumarPuntosOperacionSimple();
		sumarPuntosOperacionSimple();

		Bucle temp2 = new Bucle();
		if(!lineasCabecerasBucles.isEmpty()) {
			temp2.setLineaBucleArriba(lineasCabecerasBucles.get(lineasCabecerasBucles.size() - 1));
		}
		temp2.setlineaInicio(contadorLineas);
		listaBucles.add(temp2);
		listaBuclesFuncion.add(temp2);

		lineasCabecerasBucles.add(contadorLineas);

		crearLineaGrafo();
	}

	@Override 
	public void exitBucle_para(gramaticaParser.Bucle_paraContext ctx) {
		System.out.println("estoy en exitBucle_para");
		Bucle temp = listaBucles.get(listaBucles.size() - 1);
		Bucle temp2 = listaBuclesFuncion.get(listaBuclesFuncion.size() - 1);
		temp.setLineaFinal(contadorLineas - 1);
		temp2.setLineaFinal(contadorLineas - 1);

		listaBucles.set(listaBucles.size() - 1, temp);
		listaBuclesFuncion.set(listaBuclesFuncion.size() - 1, temp2);
		dotBucles.add(listaBucles.get(listaBucles.size() - 1).finalToInicio());
		dotBucles.add(listaBucles.get(listaBucles.size() - 1).noEntraBucle());
		listaBucles.remove(listaBucles.size() - 1);

		lineasCabecerasBucles.remove(lineasCabecerasBucles.size() - 1);

		terminarBucleBifurcacion();
	}

	// SEGUN //

	@Override 
	public void enterPr_segun(gramaticaParser.Pr_segunContext ctx) {
		System.out.println("estoy en enterPr_segun");
		addValorBucleBifurcacion();
	}

	@Override 
	public void exitCabecera_segun(gramaticaParser.Cabecera_segunContext ctx) {
		System.out.println("estoy en exitCabecera_segun");
		sumarPuntoLineaEfectiva();
		crearLineaGrafo();
	}

	@Override 
	public void exitCuerpo_segun(gramaticaParser.Cuerpo_segunContext ctx) {
		System.out.println("estoy en exitCuerpo_segun");
		terminarBucleBifurcacion();
	}

	// LLAMADAS //

	@Override 
	public void enterLlamada_funcion(gramaticaParser.Llamada_funcionContext ctx) {
		System.out.println("estoy en enterLlamada_funcion");
		if (!listaPuntosBucleBifurcacion.isEmpty()) {
			sum2ValorBucleBifurcacion();
			Funcion temp = tabla.getTablaFunciones().get(name);
			temp.setNumberFunctionCalls(temp.getNumberFunctionCalls() + 1);
			tabla.setFunction(name, temp);
			esLlamadaFuncion = true;
		} else {
			Funcion temp = tabla.getTablaFunciones().get(name);
			temp.setNumberFunctionCalls(temp.getNumberFunctionCalls() + 1);
			temp.setFunctionCallsPoints(temp.getFunctionCallsPoints() + 2);
			tabla.setFunction(name, temp);
			esLlamadaFuncion = true;
		}
		if (lineasLlamadas.containsKey(ctx.getText().split("\\(")[0])) {
			ArrayList<Integer> temp = lineasLlamadas.get(ctx.getText().split("\\(")[0]);
			temp.add(contadorLineas - 1);
			lineasLlamadas.put(ctx.getText().split("\\(")[0], temp);
		} else {
			lineasLlamadas.put(ctx.getText().split("\\(")[0], new ArrayList<Integer>(Arrays.asList(contadorLineas - 1)));
		}
	}

	@Override 
	public void exitLlamada_funcion(gramaticaParser.Llamada_funcionContext ctx) {
		System.out.println("estoy en exitLlamada_funcion");
		esLlamadaFuncion = false;
	}

	// LINEAS EFECTIVAS //

	@Override 
	public void enterComparacion(gramaticaParser.ComparacionContext ctx) {
		System.out.println("estoy en enterComparacion");
		sumarPuntosOperacionSimple();
	}

	@Override 
	public void enterOperador_matematico(gramaticaParser.Operador_matematicoContext ctx) {
		System.out.println("estoy en enterOperador_matematico");
		sumarPuntosOperacionSimple();
	}

	@Override 
	public void enterOp_asignacion(gramaticaParser.Op_asignacionContext ctx) {
		System.out.println("estoy en enterOp_asignacion");
		sumarPuntosOperacionSimple();
	}

	@Override 
	public void enterEscritura(gramaticaParser.EscrituraContext ctx) { 
		System.out.println("estoy en enterEscritura");
		sumarPuntosOperacionSimple();
	}

	@Override public void enterLectura(gramaticaParser.LecturaContext ctx) { 
		System.out.println("estoy en enterLectura");
		sumarPuntosOperacionSimple();
	}

	// FUNCIONES AUXILIARES //

	private void terminarBucleBifurcacion() {
		if (listaPuntosBucleBifurcacion.size() != 1) {
			System.out.println(listaPuntosBucleBifurcacion.size());
			long temp = (long) Math.pow(listaPuntosBucleBifurcacion.get(listaPuntosBucleBifurcacion.size() - 1), 2);
			long temp2 = listaPuntosBucleBifurcacion.get(listaPuntosBucleBifurcacion.size() - 2);
			listaPuntosBucleBifurcacion.set(listaPuntosBucleBifurcacion.size() - 2, temp + temp2);
			listaPuntosBucleBifurcacion.remove(listaPuntosBucleBifurcacion.size() - 1);
		} else {
			long aux = (long) Math.pow(listaPuntosBucleBifurcacion.get(0), 2);
			Funcion temp = tabla.getTablaFunciones().get(name);
			temp.setLoopPoints(temp.getLoopPoints() + aux);
			listaPuntosBucleBifurcacion.remove(0);
			tabla.setFunction(name, temp);
		}
	} 

	private void sumValorBucleBifurcacion() {
		if (!listaPuntosBucleBifurcacion.isEmpty()) {
			listaPuntosBucleBifurcacion.set(listaPuntosBucleBifurcacion.size() - 1,
					(listaPuntosBucleBifurcacion.get(listaPuntosBucleBifurcacion.size() - 1)) + 1);
		}
	}

	private void sum2ValorBucleBifurcacion() {
		if (!listaPuntosBucleBifurcacion.isEmpty()) {
			listaPuntosBucleBifurcacion.set(listaPuntosBucleBifurcacion.size() - 1,
					(listaPuntosBucleBifurcacion.get(listaPuntosBucleBifurcacion.size() - 1)) + 2);
		}
	}

	private void addValorBucleBifurcacion() {
		listaPuntosBucleBifurcacion.add(0L);
	}

	private void sumarPuntoLineaEfectiva() {
		System.out.println("sumo punto a linea efectiva");
		Funcion temp = tabla.getTablaFunciones().get(name);
		temp.setNumberLinesOfCode(temp.getNumberLinesOfCode() + 1); 
		tabla.setFunction(name, temp);
	}

	private void sumarPuntosOperacionSimple() {
		if (!listaPuntosBucleBifurcacion.isEmpty()) {
			sumValorBucleBifurcacion();
		} else {
			Funcion temp = tabla.getTablaFunciones().get(name);
			temp.setOperationPoints(temp.getOperationPoints() + 1);
			tabla.setFunction(name, temp);
		}
	}
	private long sumarPuntosFunciones(){
		HashMap<String, Funcion> funciones = tabla.getTablaFunciones();
		funciones.forEach((k, v) ->
		sum+=v.getTotalPoints());
		return sum;
	}
	private long sumarPuntosEfectivas(){
		HashMap<String, Funcion> funciones = tabla.getTablaFunciones();
		funciones.forEach((k, v) ->
		sumLines+=v.getNumberLinesOfCode());
		return sumLines;
	}

	private void crearLineaGrafo() {
		if (contadorLineas == tabla.getTablaFunciones().get(name).getPrimeraLinea()) {
			stringToDotFuncion("        linea" + contadorLineas + " -> ");
			stringToDotPrograma("        linea" + contadorLineas + " -> ");
		} else {
			stringToDotFuncion("linea" + contadorLineas + " -> ");
			stringToDotPrograma("linea" + contadorLineas + " -> ");
		}
		contadorLineas++;
	}

	private void stringToDotFuncion(String cadena) {
		ArrayList<String> dotText = dotFuncion.getTextDot();
		dotText.add(cadena);
		dotFuncion.setTextDot(dotText);
	}

	private void stringToDotPrograma(String cadena) {
		ArrayList<String> dotText = dotPrograma.getTextDot();
		dotText.add(cadena);
		dotPrograma.setTextDot(dotText);
	}


	// HTML //

	public void setNombreFicheroHTML(String nombreFicheroHTML) {
		this.nombreFicheroHTML = nombreFicheroHTML;
	}

	public void setNombreFichero(String nombreFichero) {
		this.nombreFichero = nombreFichero;
		String[] temp = nombreFichero.split("\\.");
		if (temp.length == 1) {
			nombrePrograma = nombreFichero;
		} else {
			for (int i = 0; i < temp.length - 1; i++) {
				nombrePrograma += temp[i];
			}
		}
	}
	public void setFuncionPrincipal(String funcionPrincipal) {
		this.funcionPrincipal = funcionPrincipal;
	}

	private void obtenerHTML() {
		ArrayList<String> text = html.getTextHTML();
		HashMap<String, Funcion> funciones = tabla.getTablaFunciones();
		long puntosTotales=sumarPuntosFunciones();
		long puntosLineas= sumarPuntosEfectivas();
		text.add("<html>\n<head>\n<title>" + nombreFichero + "</title>\n</head>\n<body>\n<h1>Resumen del programa "
				+ nombreFichero + "</h1>\n");
		funciones.forEach((k, v) -> text.add("<h2>Funcion " + k
				+ "</h2>\n<ul>\n    <li>Complejidad ciclomatica V(G): <strong>"
				+ "</strong></li>\n    <li>Puntos funcion: <strong>" + v.getTotalPoints()
				+ "</strong></li>\n    <li>Resumen: "
				+ "\n        <ul>\n        <li>Numero de variables declaradas: <strong>" + v.getNumberVariables()
				+ "</strong></li>\n        <li>Numero de llamadas a funciones: <strong>" + v.getNumberFunctionCalls()
				+ "</strong></li>\n        <li>Numero de lineas de codigo efectivas: <strong>"
				+ v.getNumberLinesOfCode() + "</strong></li>\n        <li>Numero de parametros esperados: <strong>"
				+ v.getNumberParameters() + "</strong></li>\n<br>\n        <li>Puntos de declaraciones: <strong>"
				+ v.getVariablePoints() + "</strong></li>\n        <li>Puntos de parametros: <strong>"
				+ v.getParemeterCallsPoints() + "</strong></li>\n        <li>Puntos de llamada de funciones: <strong>"
				+ v.getFunctionCallsPoints() + "</strong></li>\n        <li>Puntos de operacion simple: <strong>"
				+ v.getOperationPoints() + "</strong></li>\n        <li>Puntos de bucle/bifurcacion: <strong>"
				+ v.getLoopPoints()
				+ "</strong></li>\n</ul>\n    <li>Grafico de complejidad ciclomatica: <br><img src=\""
				+ v.getNombreFuncion() + ".svg\" width=\"10%\"></li>\n</ul>\n<hr>\n"));

		text.add("<h2>Programa " + nombreFichero + "</h2>\n<ul>\n<li>Complejidad ciclomatica total: <strong>"
				+ "</strong></li>\n<li>Suma de puntos de funciones: <strong>" + puntosTotales
				+ "</strong></li>\n<li>Suma de lineas de codigo efectivas: <strong>"+ puntosLineas
				+ "</strong></li>\n<li>Grafico del programa: <br><img src=\"" + nombrePrograma
				+ ".svg\" width=\"10%\"></li>\n</ul>");
		text.add("\n</body>\n</html>");
		html.setTextHTML(text);
	}

	private void convertDotToSvg(String nombre) {
		try {
			String[] cmd = new String[5];
			cmd[0] = "dot.exe";
			cmd[1] = "-Tsvg";
			cmd[2] = "-o";
			cmd[3] = System.getProperty("user.dir") + "\\" + nombre + ".svg";
			cmd[4] = System.getProperty("user.dir") + "\\" + nombre + ".dot";

			Runtime rt = Runtime.getRuntime();
			rt.exec(cmd);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}	
	
	@Override
	public void exitProg(final gramaticaParser.ProgContext ctx) {
		for (String llamada : lineasLlamadas.keySet()) {
			for (Funcion function : tabla.getTablaFunciones().values()) {
				if (llamada.equals(function.getNombreFuncion())) {
					for (int numLinea : lineasLlamadas.get(llamada)) {
						stringToDotPrograma("    linea" + numLinea + " -> linea" + function.getPrimeraLinea() + ";\n");
						stringToDotPrograma("    linea" + function.getUltimaLinea() + " -> linea" + numLinea + ";\n");
					}
				}
			}
		}

		for (Funcion funcion : tabla.getTablaFunciones().values()) {
			if (funcion.getNombreFuncion().equals(funcionPrincipal)) {
				stringToDotPrograma("    start -> linea" + funcion.getPrimeraLinea()
						+ ";\n    linea" + funcion.getUltimaLinea() + " -> end;\n    start [style=filled, color=red];\n    end [style=filled, color=blue];\n}");
			}
		}

		dotPrograma.escribirFicheroDot(nombrePrograma);
		convertDotToSvg(nombrePrograma);

		obtenerHTML();

		html.escribirFicheroHTML(nombreFicheroHTML);
	}
}