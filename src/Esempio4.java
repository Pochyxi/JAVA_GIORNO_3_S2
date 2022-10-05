public class Esempio4 {

    public static void main( String[] args ) throws InterruptedException {
//        for ( int i = 0; i <= 10; i++ ) {
//            System.out.println( i );
//            Thread.sleep( 2000 ); // interazione della i ogni 2 secondi
//        }

        ThreadBox2 t1 = new ThreadBox2( "java" );
        t1.start();

        t1.join();

        ThreadBox2 t2 = new ThreadBox2( "python" );
        t2.start();
    }
}

class ThreadBox2 extends Thread {
    private String phrase;
    ThreadBox2( String phrase ) {
        this.phrase = phrase;
    }

    @Override
    public void run() {
        char[] phrase = this.phrase.toCharArray();

        for ( int i = 0; i < phrase.length; i++ ) {
            System.out.println( phrase[i] );
            try {
                Thread.sleep( 2000 );
            } catch( InterruptedException e ) {
                throw new RuntimeException( e );
            }
        }
    }
}
