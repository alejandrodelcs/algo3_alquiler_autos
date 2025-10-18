package org.example.Categoria;

public class Premium implements Categoria{
    @Override
    public double calcularRecargoPlaza(double precio){
        return precio+150;
    }
}
