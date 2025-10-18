package ar.edu.uba.fi.Blindaje;

public class SinBlindar implements Blindaje {
    @Override
    public double aplicarRecargo(double precio) {
        return precio;
    }
}
