package ar.edu.uba.fi;


public class Alquiler {

    private Alquilable alquilable;

    private int dias;


    public Alquiler(Alquilable alquilable, int dias) {
        this.alquilable = alquilable;
        this.dias = dias;
    }


    public double obtenerPrecio() {
        return  this.alquilable.calcularPrecio(dias);
    }


}
