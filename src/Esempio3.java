import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Esempio3 {
    private static  final Logger logger = LoggerFactory.getLogger( Dog.class );

    public static void main( String[] args ) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.run();
        dog2.run();
        dog3.run();

    }
}

interface Jumpable {
    void jump();
}

class Animal {
    public void verso() {
        System.out.println("Verso");
    }
}

class Dog extends Animal implements Jumpable, Runnable {
    private static  final Logger logger = LoggerFactory.getLogger( Dog.class );

    @Override
    public void verso() {
        System.out.println("bau bau");
    }

    public void jump() {
        System.out.println("Jump");
    }

    @Override
    public void run() {
        for ( int i = 0; i < 10; i++ ) {
            logger.debug("Messaggio dalla classe Dog");
            System.out.println("id: " + Thread.currentThread().getId() + " | name: " + Thread.currentThread().getName() + " " + i);
        }
    }
}

