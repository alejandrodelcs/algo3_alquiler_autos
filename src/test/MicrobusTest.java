
import org.example.Vehiculo.Microbus;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MicrobusTest {

    @Test
    public void test01UnClienteAlquilaUnAutoElValorEsElEsperado() {
        Microbus microbus = new Microbus(1500, "CherryMM", "def123");
        double valorEsperado = microbus.calcularPrecio(2);
        assertEquals(6500.0, valorEsperado);

    }
}
