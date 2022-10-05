package Esercizio1;

import java.util.Scanner;

public class EsercizioSuiThread {

    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        boolean loop1 = false;
        T1 test1 = null;
        T2 test2 = null;
        T3 test3 = null;

        do {
            loop1 = false;
            try {
                System.out.println("dammi il primo numero");
                int primoNum = scanner.nextInt();
                System.out.println("dammi il secondo numero");
                int secondoNum = scanner.nextInt();

                test1 = new T1("Test 1", primoNum, secondoNum );


            } catch( Exception e ) {
                System.out.println(e.getMessage());
                loop1 = true;
                scanner.nextLine();
            }

        } while( loop1 );

        boolean loop2 = false;

        do {
            loop2 = false;
            try {
                System.out.println("dammi una parola");
                String primaParola = scanner.next();

                test2 = new T2("Test 2", primaParola );


            } catch( Exception e ) {
                System.out.println(e.getMessage());
                loop2 = true;
                scanner.nextLine();
            }

        } while( loop2 );

        if(test1 != null && test2 != null) {
            test1.start();
            test2.start();
        }

        test3 = new T3();
        Thread thread = new Thread( test3, "tre" );
        thread.start();


        scanner.close();
    }
}
