import ar.edu.uba.fi.Inmueble.Hotel;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


public class HotelTest {

    @Test
    public void esUnHotelSeEsperaElSiguienteResultado() {

        // cantidad de camas por (cantidad de dias + $500).

        //Arrange
        Hotel hotel = new Hotel("av libertador 4321", 5);
        double valorEsperado = 2510;

        //Act

        double valorObtenido = hotel.calcularPrecio(2);

        //Assert

        assertEquals(valorEsperado, valorObtenido, 0.01);


    }
}
