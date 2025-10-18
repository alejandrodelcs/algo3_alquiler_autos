package org.example.Blindaje;

public class Blindado implements Blindaje{
    @Override
    public double aplicarRecargo(double precio) {
        return precio * 1.15;
    }
}
