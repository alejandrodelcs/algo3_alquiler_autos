import org.example.Inmueble.Cabania;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CabaniaTest {


    @Test
    public void EsUnaCabaniayElResultadoEsElEsperado(){
        //Cantidad de días por (cantidad de inquilinos al cuadradado)
        //Arrange 
        Cabania cabania = new Cabania("av libertador 123", 5);
        double valorEsperado = 50;

        //Act

        double valorObtenido = cabania.calcularPrecio(2);

        //Assertion

        assertEquals(valorEsperado, valorObtenido,0.01);


    }
}
