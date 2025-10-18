import ar.edu.uba.fi.Agencia;
import ar.edu.uba.fi.Alquiler;
import ar.edu.uba.fi.Blindaje.SinBlindar;
import ar.edu.uba.fi.Categoria.Basico;
import ar.edu.uba.fi.Cliente;
import ar.edu.uba.fi.Inmueble.Depto;
import ar.edu.uba.fi.PatenteDuplicadaError;
import ar.edu.uba.fi.Vehiculo.Auto;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertThrows;

public class AgenciaTest {
    @Test
    public void test01LaAgenciaPuedeRegistrarUnVehiculo(){
        Agencia agencia = new Agencia();
        Basico categoria = new Basico();
        SinBlindar blindaje = new SinBlindar();
        Auto auto = new Auto(500, "CherryQQ", "abc123", 4, categoria, blindaje);
        agencia.registrarVehiculo(auto);

        assertTrue(agencia.existeVehiculo(auto));
    }

    @Test
    public void test02LaAgenciaQuiereRegistrarUnVehiculoPeroLaPatenteEsDuplicadoDeberiaLanzarUnaExcepcion(){
        Agencia agencia = new Agencia();
        Basico categoria = new Basico();
        SinBlindar blindaje = new SinBlindar();
        Auto auto = new Auto(500, "CherryQQ", "abc123", 4, categoria, blindaje);
        agencia.registrarVehiculo(auto);

        Auto auto2 = new Auto(500, "CherryZZ", "abc123", 6, categoria, blindaje);


        assertThrows(PatenteDuplicadaError.class, ()-> agencia.registrarVehiculo(auto2));
    }

    @Test
    public void test03LaAgenciaQuiereRegistrarClientesSeEsperaQueElNumerodeIDSeaElCorrecto(){
        Agencia agencia = new Agencia();
        Cliente cliente = new Cliente();

        agencia.registrarCliente(cliente);

        int valorIDEsperado = 1;
        assertEquals(valorIDEsperado, cliente.getID());


    }

    @Test
    public void test04LaAgenciaAsignaAUnClienteElAlquilerDeUnVehiculoEnTantosDiasDeberiaDevolverElValorDelAlquiler(){
        Agencia agencia = new Agencia();
        Cliente cliente = new Cliente();
        Basico categoria = new Basico();
        SinBlindar blindaje = new SinBlindar();
        Auto auto = new Auto(500, "CherryQQ", "abc123", 4, categoria, blindaje);

        agencia.registrarVehiculo(auto);
        agencia.registrarCliente(cliente);

        int dias = 2;
        Alquiler alquiler = agencia.asignarAlquiler(auto,cliente,dias);
        double valorObtenido = alquiler.obtenerPrecio();
        double valorEsperado = 1208;
        assertEquals(valorEsperado, valorObtenido);

    }

    @Test
    public void test05LaAgenciaDeseaConocerTodosLosAlquileresDeUnCliente(){
        Agencia agencia = new Agencia();
        Cliente cliente = new Cliente();
        Basico categoria = new Basico();
        SinBlindar blindaje = new SinBlindar();
        Auto auto = new Auto(500, "CherryQQ", "abc123", 4, categoria, blindaje);

        agencia.registrarVehiculo(auto);
        agencia.registrarCliente(cliente);

        agencia.asignarAlquiler(auto,cliente,2);
        agencia.asignarAlquiler(auto,cliente,5);

        double precioTotal = agencia.obtenerPrecioTotalClienteAlquileres(cliente);

        assertEquals(4228, precioTotal,0.01);

    }


    @Test
    public void test06LaAgenciaDeseaConocerTodosSusAlquileresDeAutos(){
        Agencia agencia = new Agencia();
        Cliente cliente = new Cliente();
        Basico categoria = new Basico();
        SinBlindar blindaje = new SinBlindar();
        Auto auto = new Auto(500, "CherryQQ", "abc123", 4, categoria, blindaje);

        agencia.registrarVehiculo(auto);
        agencia.registrarCliente(cliente);

        agencia.asignarAlquiler(auto,cliente,2);
        agencia.asignarAlquiler(auto,cliente,5);

        double precioTotal = agencia.obtenenerPrecioTotalAgenciaAlquileres();

        assertEquals(4228, precioTotal,0.01);

    }


    @Test
    public void test06LaAgenciaDeseaConocerTodosSusAlquileresDeInmuebles(){
        Agencia agencia = new Agencia();
        Cliente cliente = new Cliente();
        Depto depto = new Depto("Av Libertador 1234", 5);

        agencia.registrarInmueble(depto);
        agencia.registrarCliente(cliente);

        agencia.asignarAlquiler(depto, cliente, 2);
        agencia.asignarAlquiler(depto, cliente, 5);

        double precioTotal = agencia.obtenenerPrecioTotalAgenciaAlquileres();

        assertEquals(175, precioTotal, 0.01);

    }
}

