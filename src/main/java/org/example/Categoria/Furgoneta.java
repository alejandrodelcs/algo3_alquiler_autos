package org.example.Categoria;

public class Furgoneta {
    private final int base;
    private String nombre;
    private String patente;
    private final int pma;
    public static final double EXTRA = 300.0;


    public Furgoneta(int base, String nombre, String patente, int pma) {
        this.base = base;
        this.nombre = nombre;
        this.patente = patente;
        this.pma = pma;
    }


    public double calcularPrecio(int dia) {
        double precioBase = this.base * dia;
        double recargoPMA = EXTRA * this.pma;
        return precioBase + recargoPMA;
    }

}
