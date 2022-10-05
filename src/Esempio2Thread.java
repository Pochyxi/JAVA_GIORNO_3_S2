public class Esempio2Thread {

    public static void main( String[] args ) {

        ThreadBox t1 = new ThreadBox("Thread_a");
        ThreadBox t2 = new ThreadBox("Thread_b");

        t1.start();
        t2.start();

        for ( int i = 0; i < 10; i++ ) {
            System.out.println("id: " + Thread.currentThread().getId() + " | name: " + Thread.currentThread().getName() + " " + i);
        }

    }
}

class ThreadBox extends Thread {

    public ThreadBox(String name) {
        this.setName( name );
    }

    @Override
    public void run() {
        for ( int i = 0; i < 10; i++ ) {
            System.out.println("id: " + Thread.currentThread().getId() + " | name: " + Thread.currentThread().getName() + " " + i);
        }
    }
}
