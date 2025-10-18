package org.example.Vehiculo;

import org.example.Alquilable;

abstract public class Vehiculo implements Alquilable {

    protected String nombre;
    protected String patente;

    public Vehiculo(String nombre, String patente) {
        this.nombre = nombre;
        this.patente = patente;
    }

    public String getPatente() {
        return  patente;
    }
}
