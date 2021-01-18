import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {

        String inputFile = null, funcionPrincipal = null, nombreFicheroHTML = null;
        try {
            inputFile = args[0];
            funcionPrincipal = args[1];
            nombreFicheroHTML = args[2];

            InputStream is = System.in;
            if (inputFile != null) {
                is = new FileInputStream(inputFile);
            }

            CharStream input = CharStreams.fromStream(is);
            gramaticaLexer lexer = new gramaticaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            gramaticaParser parser = new gramaticaParser(tokens);
            parser.setBuildParseTree(true);
            ParseTree tree = parser.prog();

            // CONFIGURAMOS EL LISTENER
            ListenerBasico TB = new ListenerBasico();
            ParseTreeWalker walker = new ParseTreeWalker();

            TB.setNombreFichero(inputFile);
            TB.setNombreFicheroHTML(nombreFicheroHTML);
            TB.setFuncionPrincipal(funcionPrincipal);

            // RECORREMOS EL ARBOL
            walker.walk(TB, tree);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}