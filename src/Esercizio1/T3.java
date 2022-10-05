package Esercizio1;

public class T3 implements Runnable {

    @Override
    public void run() {
        Rettangolo r1 = new Rettangolo(12, 15);
        r1.stampaArea();
        System.out.println(Thread.currentThread().getName());
    }
}
