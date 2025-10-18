import ar.edu.uba.fi.Alquiler;
import ar.edu.uba.fi.Blindaje.Blindado;
import ar.edu.uba.fi.Blindaje.SinBlindar;
import ar.edu.uba.fi.Categoria.Basico;
import ar.edu.uba.fi.Categoria.Premium;
import ar.edu.uba.fi.Cliente;
import ar.edu.uba.fi.Inmueble.Cabania;
import ar.edu.uba.fi.Inmueble.Depto;
import ar.edu.uba.fi.Inmueble.Hotel;
import ar.edu.uba.fi.Vehiculo.Auto;
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
    public void teste04ElClienteQuiereAlquilarUnaCabaniaSeEsperaElSiquienteResultado(){

        Cliente  cliente = new Cliente();

        Cabania cabania = new Cabania("Av Libertador 1234", 5);

        Alquiler alquiler = cliente.alquilar(cabania,2);

        double precioObtenido = alquiler.obtenerPrecio();

        double precioEsperado = 50;

        assertEquals(precioEsperado, precioObtenido,0.01);


    }

    @Test
    public void teste05ElClienteQuiereAlquilarUnHotelSeEsperaElSiquienteResultado(){

        Cliente  cliente = new Cliente();

        Hotel hotel = new Hotel("Av Libertador 1234", 5);

        Alquiler alquiler = cliente.alquilar(hotel,2);

        double precioObtenido = alquiler.obtenerPrecio();

        double precioEsperado = 2510;

        assertEquals(precioEsperado, precioObtenido,0.01);


    }

    @Test
    public void teste06ElClienteQuiereAlquilarUnDeptoSeEsperaElSiquienteResultado(){

        Cliente  cliente = new Cliente();

        Depto depto = new Depto("Av Libertador 1234", 5);

        Alquiler alquiler = cliente.alquilar(depto,2);

        double precioObtenido = alquiler.obtenerPrecio();

        double precioEsperado = 50;

        assertEquals(precioEsperado, precioObtenido,0.01);


    }


}
