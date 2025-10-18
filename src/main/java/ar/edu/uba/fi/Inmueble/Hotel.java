package ar.edu.uba.fi.Inmueble;

public class Hotel extends Inmueble {

    private int camas;
    
    public Hotel(String direccion, int camas) {
        super(direccion);
        this.camas = camas;
    }

    @Override
    public double calcularPrecio(int dias) {
        return camas * (dias + 500);
    }
}
