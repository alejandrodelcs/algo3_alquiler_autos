package org.example.Inmueble;

public class Depto extends Inmueble {

    private int metrosCuadrados;

    public Depto(String direccion, int metrosCuadrados) {
        super(direccion);
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public double calcularPrecio(int dias) {
        return dias*Math.pow(metrosCuadrados, 2);
    }
}
