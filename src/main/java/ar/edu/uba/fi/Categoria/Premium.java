package ar.edu.uba.fi.Categoria;

public class Premium implements Categoria{
    @Override
    public double calcularRecargoPlaza(double precio){
        return precio+150;
    }
}
