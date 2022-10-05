import org.apache.commons.io.FileUtils;
import org.w3c.dom.Text;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Apache {
    public static void main( String[] args ) throws IOException {

        // creiamo un wrapper per il file idnciato

        String f1Name = "docs/f1.txt";
        File f1 = new File( f1Name );

        // codifica il file
        String encoding = "UTF-8";

        Scanner in = new Scanner( System.in );

        // se il file esiste
        if( f1.exists() ) {

            // compi operazioni sul wrapper del file
            System.out.println("il file " + f1Name + "esiste!");

            try {
                // creo il file
                String f1Content = FileUtils.readFileToString( f1, encoding );
                System.out.println("il contenuto del file è " + f1Content);

            } catch( IOException e ) {
                System.out.println("Error");
            }
        } else {
            String text = "Ho appena scritto un file!";
            System.out.println("il file " + f1Name + " non esiste!");
            FileUtils.writeStringToFile( f1, text, encoding );
        }
    }
}
