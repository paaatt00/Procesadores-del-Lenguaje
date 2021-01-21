/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PL1;

import java.io.File;
import java.util.Set;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;

/**
 *
 * @author patri
 */
public class MaquinaDeEstados {

    private Integer estadoActual;
    private AFD automata;

    public MaquinaDeEstados(AFD automata) {
        this.estadoActual = estadoActual;
        this.automata = automata;
    }

    public void inicializar() {
        estadoActual = automata.getEstadoInicial();
    }

    public boolean esFinal() {
        return automata.isFinal(estadoActual);
    }
    
    public boolean compruebaCadena(String cadena) {
        char[] array = cadena.toCharArray();
        int estado = automata.getEstadoInicial();
        for (int i = 0; i < array.length; i++) {
            if (!(automata.getAlfabeto().contains(array[i]))) {
                return false;
            }
            if (automata.getMatriz().get(estado).keySet().contains(array[i])) {
                estado = automata.getMatriz().get(estado).get(array[i]);
            } else {
                return false;
            }
        }
        return automata.isFinal(estado);
    }

public String generaCadena() {
        String a = "";
        int estado = automata.getEstadoInicial();
        boolean acabada = false;
        char[] posibilidades;
        char siguienteChar;
        while (!acabada) {
            if (a.length() == 15){
                acabada = true;
            } else {
                Set<Character> aux = automata.getMatriz().get(estado).keySet();
                if (aux.size() != 0) {
                    posibilidades = new char[aux.size()];
                    posibilidades = setToArray(aux);
                    siguienteChar = posibilidades[(int) (Math.random() * posibilidades.length)];
                    estado = automata.getMatriz().get(estado).get(siguienteChar);
                    a = a.concat(String.valueOf(siguienteChar));
                } else {
                    acabada = true;
                }
            }
        }
        return a;
    }

    public char[] setToArray(Set a) {
        int i = 0;
        char[] array = new char[a.size()];
        for (var x : a) {
            array[i++] = (char) x;
        }
        return array;
    }

    public void importarMatriz() {
        try {
            File inputFile = new File("D:/Universidad/3º/1º cuatrimestre/Procesadores del Lenguaje/PL1/ejemploEjercicio.jff");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            NodeList estados = doc.getElementsByTagName("state");
            NodeList transiciones = doc.getElementsByTagName("transition");
            
            for (int i = 0; i < estados.getLength(); i++) {
                Node nNode = estados.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) nNode;
                    automata.cargarEstados(Integer.valueOf(e.getAttribute("id")));
                }
            }
            automata.inicializarMatriz();
            for (int i = 0; i < transiciones.getLength(); i++) {
                int estadoBase = 0;
                int estadoFin = 0;
                char charAux = ' ';
                Node nNode = transiciones.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) nNode;
                    estadoBase = Integer.valueOf(e.getElementsByTagName("from").item(0).getTextContent());
                    estadoFin = Integer.valueOf(e.getElementsByTagName("to").item(0).getTextContent());
                    charAux = e.getElementsByTagName("read").item(0).getTextContent().charAt(0);
                    automata.cargarMatriz(estadoBase, charAux, estadoFin);
                    automata.cargarAlfabeto(charAux);
                }
            }
            automata.establecerQi(0);
            automata.establecerQf(3);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
