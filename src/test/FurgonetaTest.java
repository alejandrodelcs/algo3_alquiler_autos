import org.example.Categoria.Furgoneta;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FurgonetaTest {

    @Test
    public void test01ElClienteAlquilaUnaForgonetaDeCargaSeEsperaElSiguienteResultado(){
        Furgoneta furgoneta = new Furgoneta(500, "CherryMM", "def123", 200);
        double valorEsperado = furgoneta.calcularPrecio(2);
        assertEquals(61000.0, valorEsperado);

    }
}
