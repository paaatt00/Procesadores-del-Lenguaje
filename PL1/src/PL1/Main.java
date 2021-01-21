/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PL1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author patri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        AFD automata = new AFD();
        MaquinaDeEstados maquina = new MaquinaDeEstados(automata);
        ArrayList<String> cadenasValidas = new ArrayList<String>();
        FileWriter archivo = new FileWriter("archivo.txt");
        BufferedWriter bw = new BufferedWriter(archivo);

        maquina.importarMatriz();
        System.out.println("ER: a(a+!)*(b(c)*(m+n+ñ+o+p+q))((b(c)*(m+n+ñ+o+p+q))*+!)");
        bw.write("a*b?c");
        System.out.println("");
        bw.write("\n");

        String cad1 = "abmbo";
        System.out.print("Cadena 1: " + cad1 + " --> ");
        bw.write("Cadena 1:" + cad1 + "--> ");
        if (maquina.compruebaCadena(cad1)) {
            System.out.println("Es válida.");
            bw.write("Es válida.\n");
        } else {
            System.out.println("No es válida.");
            bw.write("No es válida.\n");
        }
        
        String cad2 = "aabcccmbqccp";
        System.out.print("Cadena 2: " + cad2 + " --> ");
        bw.write("Cadena 2:" + cad2 + "--> ");
        if (maquina.compruebaCadena(cad2)) {
            System.out.println("Es válida.");
            bw.write("Es válida.\n");
        } else {
            System.out.println("No es válida.");
            bw.write("No es válida.\n");
        }

        System.out.println("");
        bw.write("\n");
        System.out.println("100 cadenas que cumplen la ER: ");
        bw.write("100 cadenas que cumplen la ER: \n");
        for (int i = 0; i < 100; i++) {
            String cad = maquina.generaCadena();
            if (!cadenasValidas.contains(cad) && cad != "" && maquina.compruebaCadena(cad)) {
                System.out.print("  " + (i + 1) + ". ");
                bw.write("  " + (i + 1) + ". ");
                cadenasValidas.add(cad);
                System.out.println(cadenasValidas.get(i));
                bw.write(cadenasValidas.get(i) + "\n");
            } else {
                i--;
            }
        }
        bw.close();

    }

}
