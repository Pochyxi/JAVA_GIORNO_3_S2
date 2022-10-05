package Esercizio1;

public abstract class Forma {

    public abstract void stampaArea();
}

class Rettangolo extends Forma {
    double base;
    double altezza;

    public Rettangolo( double base, double altezza ) {
        this.base = base;
        this.altezza = altezza;
    }


    @Override
    public void stampaArea() {
        System.out.println( "L'area del rettangolo è: " + (base * altezza) );
    }
}
