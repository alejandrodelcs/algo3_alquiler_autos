package ar.edu.uba.fi.Vehiculo;

import ar.edu.uba.fi.Blindaje.Blindaje;
import ar.edu.uba.fi.Categoria.Categoria;

public class Auto extends Vehiculo {

    private final double base;
    private final int plaza;
    private final Categoria categoria;
    private final Blindaje blindaje;


    public Auto(int base, String nombre, String patente, int plaza, Categoria categoria, Blindaje blindaje) {
        super(nombre, patente);
        this.base = base;
        this.plaza = plaza;
        this.categoria = categoria;
        this.blindaje = blindaje;
    }


    @Override
    public double calcularPrecio(int dia) {
        double precioBase = this.base * dia;
        double recargoPlazas = categoria.calcularRecargoPlaza(this.plaza) * dia;
        double total = precioBase + recargoPlazas;
        return this.blindaje.aplicarRecargo(total);
    }
}
