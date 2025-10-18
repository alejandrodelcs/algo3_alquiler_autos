import org.example.Inmueble.Depto;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DepartamentoTest {

    @Test
    public void esUnDepartamentoSeEsperaElSiguienteResultado(){
        // m^2 por la cantidad de días.

        //Arrange
        Depto depto = new Depto("av libertador 1234",5);
        double valorEsperado = 50;
        //Act

        double valorObtenido = depto.calcularPrecio(2);

        //Assert

        assertEquals(valorEsperado,valorObtenido,0.01);


    }
}
