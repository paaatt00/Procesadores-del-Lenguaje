import java.util.*;

public class Tabla {

    private HashMap<String, Funcion> funciones = new HashMap<String, Funcion>();

    public Tabla() {}
    
    public Tabla(HashMap<String, Funcion> funciones ) {
        this.funciones = funciones;
    }

    public HashMap<String, Funcion> getTablaFunciones() {
        return funciones;
    }

    public void setTablaFunciones(HashMap<String, Funcion> tabla_funciones) {
        this.funciones = tabla_funciones;
    }

    public void addFunction(String name, Funcion function) {
        funciones.put(name, function);
    }

    public void setFunction(String name, Funcion function) {
        funciones.put(name, function);
    }

    public int countKeys() {
        int contador = 0;
        for (String str: funciones.keySet()) {
            contador++;
        }
        return contador;
    }


    public void print() {
        System.out.println();
        funciones.forEach((k, v) -> System.out.print("Funcion " + k + ":\n    - Complejidad ciclomatica V(G): " + "\n    - Puntos funcion: "
                + v.getTotalPoints() + "\n    - Resumen: " + "\n        - Numero de variables declaradas: "
                + v.getNumberVariables() + "\n        - Numero de llamadas a funciones: " + v.getNumberFunctionCalls()
                + "\n        - Numero de lineas de codigo efectivas: " + v.getNumberLinesOfCode()
                + "\n        - Numero de parametros esperados: " + v.getNumberParameters() + "\n"
                + "\n        - Puntos de declaraciones: " + v.getVariablePoints() + "\n        - Puntos de parametros: "
                + v.getParemeterCallsPoints() + "\n        - Puntos de llamada de funciones: "
                + v.getFunctionCallsPoints() + "\n        - Puntos de operacion simple: " + v.getOperationPoints()
                + "\n        - Puntos de bucle/bifurcacion: " + v.getLoopPoints() + "\n    - Grafico de complejidad ciclomatica: " + "\n\n"));
    }
}