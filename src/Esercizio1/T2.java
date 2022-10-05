package Esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class T2 extends Thread {
    private static final Logger logger = LoggerFactory.getLogger( T2.class );

    String parola;

    public T2(String nome, String parola) {
        this.parola = parola;
        this.setName( nome );
    }

    @Override
    public void run() {
        try {
            char[] arr = parola.toCharArray();

            for( int i = arr.length - 1; i >= 0; i-- ) {
                logger.info(getName() + ": " + arr[i]);
                Thread.sleep(2000);
            }

        } catch( InterruptedException e ) {
            logger.error("qualcosa è andato storto");
        }
    }
}
