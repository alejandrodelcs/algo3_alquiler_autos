package ar.edu.uba.fi.Vehiculo;

import ar.edu.uba.fi.Alquilable;

abstract public class Vehiculo implements Alquilable {

    protected String nombre;
    protected String patente;

    public Vehiculo(String nombre, String patente) {
        this.nombre = nombre;
        this.patente = patente;
    }

    public boolean esIgual(Vehiculo vehiculoNuevo) {
        return vehiculoNuevo.patente.equals(patente);
    }
}
