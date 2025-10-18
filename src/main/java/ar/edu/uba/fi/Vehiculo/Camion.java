package ar.edu.uba.fi.Vehiculo;

public class Camion extends Vehiculo {

    public Camion(String nombre, String patente) {
        super(nombre, patente);
    }

    @Override
    public double calcularPrecio(int dia) {
        return 30000;
    }
}
