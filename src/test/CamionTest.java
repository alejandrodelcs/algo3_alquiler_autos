import ar.edu.uba.fi.Vehiculo.Camion;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CamionTest {
    @Test
    public void test01ElClienteAlquilaUnCamionSeEsperaElSiguienteResultado(){
        Camion camion = new Camion("CherryMM", "def123");
        double valorEsperado = camion.calcularPrecio(2);
        assertEquals(30000.0, valorEsperado);
    }
}
