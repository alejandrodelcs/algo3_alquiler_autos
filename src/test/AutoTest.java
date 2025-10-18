import org.example.Vehiculo.Auto;
import org.example.Blindaje.Blindado;
import org.example.Categoria.Basico;
import org.example.Categoria.Premium;
import org.example.Blindaje.SinBlindar;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class AutoTest {
    @Test
    public void test01UnClienteAlquilaUnAutoBasicoSinBlindarElValorEsElEsperado() {
        Basico categoria = new Basico();
        SinBlindar blindaje = new SinBlindar();
        Auto cherry = new Auto(500, "CherryQQ", "abc123", 4, categoria, blindaje);
        double valorEsperado = cherry.calcularPrecio(2);
        assertEquals(1208, valorEsperado,0.01);

    }

    @Test
    public void test02ElAutoEsPremiumSinBlindarSeEsperaElValorEsperado(){
        Premium categoria = new Premium();
        SinBlindar blindaje = new SinBlindar();
        Auto cherry = new Auto(500, "CherryQQ", "abc123", 4, categoria, blindaje);
        double valorEsperado = cherry.calcularPrecio(2);
        assertEquals(1308, valorEsperado,0.01);
    }

    @Test
    public void test03ElAutoEsBasicoYBlindadoSeEsperaElValorEsperado(){
        Basico categoria = new Basico();
        Blindado blindaje = new Blindado();
        Auto cherry = new Auto(500, "CherryQQ", "abc123", 4, categoria, blindaje);
        double valorEsperado = cherry.calcularPrecio(2);
        assertEquals(1389.2, valorEsperado,0.01);

    }

    @Test
    public void test04ElAutoEsPremiumYBlindadoSeEsperaElValorEsperado(){
        Premium categoria = new Premium();
        Blindado blindaje = new Blindado();
        Auto cherry = new Auto(500, "CherryQQ", "abc123", 4, categoria, blindaje);
        double valorEsperado = cherry.calcularPrecio(2);
        assertEquals(1504.2,  valorEsperado,0.01);

    }

}
