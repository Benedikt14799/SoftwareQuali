import org.junit.Test;
import static org.junit.Assert.*;


public class CalculatorTest {

    @Test
    public void testAdd() {
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.add(1, 2);
        assertEquals(3, result);
    }

    @Test
    public void testSubtract() {
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.subtract(1, 2);
        assertEquals(-1, result);
    }

    @Test
    public void testMultiply() {
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.multiply(1, 2);
        assertEquals(2, result);
    }

    @Test
    public void testDivide() {
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.divide(2, 1);
        assertEquals(2, result);
    }

    @Test
    public void testDivideByZero() {

        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.divide(2, 0);
        assertEquals(0, result);
    }


    @Test
    public void testOverflow() {
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.add(Integer.MAX_VALUE, 1);
        assertEquals(Integer.MIN_VALUE, result);
    }

}
