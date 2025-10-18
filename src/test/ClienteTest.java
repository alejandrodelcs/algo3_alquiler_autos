import org.example.Alquiler;
import org.example.Blindaje.Blindado;
import org.example.Blindaje.SinBlindar;
import org.example.Categoria.Basico;
import org.example.Categoria.Premium;
import org.example.Cliente;
import org.example.Inmueble.Cabania;
import org.example.Vehiculo.Auto;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ClienteTest {
    @Test
    public void test01ElClienteQuiereAlquilarUnAutoBasicoNoBlindadoSeEsperaElSiguienteResultado() {

        Basico categoria = new Basico();
        SinBlindar blindaje = new SinBlindar();
        Auto auto = new Auto(500, "CherryQQ", "abc123", 4, categoria, blindaje);

        Cliente cliente = new Cliente();

        Alquiler alquiler = cliente.alquilar(auto, 2);

        double precioObtenido = alquiler.obtenerPrecio();

        double precioEsperado = 1208.0;

        assertEquals(precioEsperado, precioObtenido,0.01);

    }

    @Test
    public void test02ElClienteQuiereAlquilarUnAutoPremiumNoBlindadoSeEsperaElSiguienteResultado() {
        Premium categoria = new Premium();
        SinBlindar blindaje = new SinBlindar();
        Auto auto = new Auto(500, "CherryQQ", "abc123", 4, categoria, blindaje);

        Cliente cliente = new Cliente();

        Alquiler alquiler = cliente.alquilar(auto, 2);

        double precioObtenido = alquiler.obtenerPrecio();

        double precioEsperado = 1308;

        assertEquals(precioEsperado, precioObtenido,0.01);


    }

    @Test
    public void test03ElClienteQuiereAlquilarUnAutoBasicoBlindadoSeEsperaElSiguienteResultado() {
        Basico categoria = new Basico();
        Blindado blindaje = new Blindado();
        Auto auto = new Auto(500, "CherryQQ", "abc123", 4, categoria, blindaje);

        Cliente cliente = new Cliente();

        Alquiler alquiler = cliente.alquilar(auto, 2);

        double precioObtenido = alquiler.obtenerPrecio();

        double precioEsperado = 1389.2;

        assertEquals(precioEsperado, precioObtenido,0.01);

    }

    @Test
    public void test03ElClienteQuiereAlquilarUnAutoPremiumBlindadoSeEsperaElSiguienteResultado() {
        Premium categoria = new Premium();
        Blindado blindaje = new Blindado();
        Auto auto = new Auto(500, "CherryQQ", "abc123", 4, categoria, blindaje);

        Cliente cliente = new Cliente();

        Alquiler alquiler = cliente.alquilar(auto, 2);

        double precioObtenido = alquiler.obtenerPrecio();

        double precioEsperado = 1504.2;

        assertEquals(precioEsperado, precioObtenido,0.01);


    }

    @Test
    public void teste04ElClienteQuiereAlquilarUnaCabañaSeEsperaElSiquienteResultado(){

        Cliente  cliente = new Cliente();

        Cabania cabania = new Cabania("Av Libertador 1234", 5);

        Alquiler alquiler = cliente.alquilar(cabania,2);

        double precioObtenido = alquiler.obtenerPrecio();

        double precioEsperado = 50;

        assertEquals(precioEsperado, precioObtenido,0.01);



    }


}
