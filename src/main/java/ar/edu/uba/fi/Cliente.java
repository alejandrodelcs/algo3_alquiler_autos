package ar.edu.uba.fi;


import java.util.ArrayList;

public class Cliente {

    private static int contadorId = 1;
    private final int id;
    private final ArrayList<Alquiler> alquileres;
    public Cliente() {
        this.id = contadorId++;
        this.alquileres = new ArrayList<>();
    }



    public Alquiler alquilar(Alquilable alquilable, int dias) {
        Alquiler alquiler = new Alquiler(alquilable, dias);
        alquileres.add(alquiler);
        return alquiler;
    }




    public int getID() {
        return id;
    }

    public ArrayList<Alquiler> getAlquileres() {
        return alquileres;
    }


}
