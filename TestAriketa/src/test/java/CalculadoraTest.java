import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void testSumaAcierta() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.suma(2, 3));    
    }

   @Test
    public void testSumaFalla() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.suma(2, 2));    
    }
}