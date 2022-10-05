package Esercizio1;

public class T1 extends Thread {
    int x;
    int y;

    public T1(String name, int x, int y) {
        this.x = x;
        this.y = y;
        this.setName( name );
    }

    public void run() {
        for (int i = x; i <= y; i++) {
            System.out.println( getName() + " " + i);
        }
    }

}
