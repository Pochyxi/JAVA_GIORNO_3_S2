public class ThreadJoin {

    public static void main( String[] args ) throws InterruptedException {
        Counter counter = new Counter();

        ThreadBox3 t1 = new ThreadBox3("Thread_a ", counter);
        ThreadBox3 t2 = new ThreadBox3("Thread_b ", counter);

        t1.start();

        t2.start();

    }
}

class Counter {
    private static int count = 1;

    synchronized public void increaseCount( String tn) {
        for ( int i = 0; i < 10; i++ ) {
            System.out.println( count + " " + tn);
            count++;
        }
    }
}

class ThreadBox3 extends Thread {

    Counter counter;

    public ThreadBox3(String nome, Counter counter ) {
        this.setName( nome );
        this.counter = counter;
    }

    @Override
    public void run() {
        this.counter.increaseCount(this.getName());
    }
}

class Counter2 {
    private static int count = 1;

    synchronized static public void increaseCount( String tn) {
        for ( int i = 0; i < 10; i++ ) {
            System.out.println( count + " " + tn);
            count++;
        }
    }
}



class ThreadBox4 extends Thread {


    public ThreadBox4(String nome, Counter counter ) {
        this.setName( nome );
    }

    @Override
    public void run() {
        Counter2.increaseCount(this.getName());
    }
}