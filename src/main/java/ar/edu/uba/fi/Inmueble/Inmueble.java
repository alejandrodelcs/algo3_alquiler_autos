package ar.edu.uba.fi.Inmueble;

import ar.edu.uba.fi.Alquilable;

public abstract class Inmueble implements Alquilable {

    private String direccion;

    public Inmueble(String direccion){
        this.direccion = direccion;
    }

    public boolean esIgual(Inmueble inmuebleNuevo){
        return inmuebleNuevo.direccion.equals(this.direccion);
    }

}
