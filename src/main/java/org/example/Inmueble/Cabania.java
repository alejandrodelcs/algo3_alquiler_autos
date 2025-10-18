package org.example.Inmueble;

public class Cabania extends Inmueble {

    private int inquilino;

    public Cabania(String direccion, int inquilino) {
        super(direccion);
        this.inquilino = inquilino;
    }

    @Override
    public double calcularPrecio(int dias) {
        return  dias*Math.pow(inquilino, 2);
    }
}
