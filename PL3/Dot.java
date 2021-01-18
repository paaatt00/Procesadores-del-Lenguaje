import java.util.*;
import java.io.*;

public class Dot {

    private FileWriter archivo = null;
    private ArrayList<String> textDot = new ArrayList<String>();
    
    public Dot() {}

    public ArrayList<String> getTextDot() {
        return textDot;
    }

    public void setTextDot(ArrayList<String> textDot) {
        this.textDot = textDot;
    }

    public void escribirFicheroDot(String nombreFichero) {
        try {
			archivo = new FileWriter(System.getProperty("user.dir") + "\\" + nombreFichero + ".dot");

			for (String str: textDot) {
				archivo.write(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != archivo)
					archivo.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
    }
}