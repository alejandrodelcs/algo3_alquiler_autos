package ar.edu.uba.fi.Vehiculo;

public class Microbus extends Vehiculo{
    private final double base;
    public static final double EXTRA = 500.0;
    public Microbus(int base, String nombre, String patente) {
        super(nombre, patente);
        this.base = base;

    }

    @Override
    public double calcularPrecio(int dia) {
        double precioBase = this.base * dia;
        double precioExtra = precioBase + EXTRA;
        return precioBase + precioExtra;
    }
}
