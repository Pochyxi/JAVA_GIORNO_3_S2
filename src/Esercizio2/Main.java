package Esercizio2;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );

        String f1Name = "docs/esercizio.txt";
        File f1 = new File( f1Name );
        String encoding = "UTF-8";

        try {
            FileUtils.writeStringToFile( f1, "", encoding );
        } catch( IOException e ) {
            throw new RuntimeException( e );
        }

        for( int i = 0 ; i <= 5 ; i++ ) {
            System.out.println( " " + i + " Inserisci un numero" );
            try {
                int numero = Integer.parseInt( scanner.nextLine() );
                FileUtils.writeStringToFile( f1, numero + ((i < 4) ? "-" : ""), encoding, true );
            } catch( NumberFormatException e ) {
                System.out.println( "Errore durante l'inserci un numero: " + e.getMessage() );
                i--;
            } catch( IOException e ) {
                System.out.println( "Errore durante l'inserci un numero: ");
                i--;
            }
        }


        FileText.leggi();


        scanner.close();
    }

}

class FileText {


    static void leggi() {
        String f1Name = "docs/esercizio.txt";
        File f1 = new File( f1Name );
        String encoding = "UTF-8";

        if ( f1.exists()) {
            try {
                String contenuto = FileUtils.readFileToString( f1, encoding );

                if (!contenuto.equals( "" )) {
                    System.out.println(" il contenuto è " + Arrays.toString( contenuto.split( "-" ) ) );
                }
            } catch( IOException e ) {
                throw new RuntimeException( e );
            }

        }
    }
}
