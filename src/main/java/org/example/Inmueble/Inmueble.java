package org.example.Inmueble;

import org.example.Alquilable;

public abstract class Inmueble implements Alquilable {

    private String direccion;

    public Inmueble(String direccion){
        this.direccion = direccion;
    }


}
