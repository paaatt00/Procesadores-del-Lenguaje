/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PL1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author patri
 */
public class AFD {

    private ArrayList<Character> alfabeto = new ArrayList<Character>();
    private ArrayList<Integer> estados = new ArrayList<Integer>();
    private Integer estadoInicial = 0;
    private ArrayList<Integer> estadosFinales = new ArrayList<Integer>();
    private HashMap<Integer, HashMap<Character, Integer>> matriz = new HashMap<Integer, HashMap<Character, Integer>>();

    public AFD() {
        
    }

    public Integer getEstadoInicial() {
        return estadoInicial;
    }

    public ArrayList<Character> getAlfabeto() {
        return alfabeto;
    }
    
    public HashMap<Integer, HashMap<Character, Integer>> getMatriz() {
        return matriz;
    }
    
    public void cargarAlfabeto(char a) {
        alfabeto.add(a);
    }

    public void cargarEstados(Integer estado) {
        estados.add(estado);
    }

    public void establecerQi(Integer estado) {
        estadoInicial = estado;
    }

    public void establecerQf(Integer estado) {
        estadosFinales.add(estado);
    }

    public void inicializarMatriz() {
        //generar un hashmap vacío para cada estado
        for (int i = 0; i < estados.size(); i++) {
            matriz.put(estados.get(i), new HashMap<>());
        }
    }

    public void cargarMatriz(Integer estado, char caracter, Integer estadoSalto) {
        matriz.get(estado).put(caracter, estadoSalto);
    }
    
    public Integer getSiguienteEstado(Integer estado, Character caracter) {
        return matriz.get(estado).get(caracter);
    }
    
    public boolean isFinal(Integer estado) {
        return estadosFinales.contains(estado);
    }
    
    
            
            
}
