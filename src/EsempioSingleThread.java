import static java.awt.PageAttributes.MediaType.C2;

public class EsempioSingleThread {

    public static void main( String[] args ) {
        C1 c1 = new C1();
        C1 c2 = new C1();

        c1.start();
        c2.start();

        System.out.println( Thread.currentThread().getName() );
    }
}

class C1 {
    public void start() {
        for( int i = 0 ; i < 10 ; i++ ) {
            System.out.println( i );
        }
    }
}
