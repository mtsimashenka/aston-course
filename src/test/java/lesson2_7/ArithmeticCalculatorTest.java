package lesson2_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArithmeticCalculatorTest {

    private static final double DELTA = 0.001;

    @Test
    public void testAddition() {
        assertEquals(5, ArithmeticCalculator.add(2, 3));
        assertEquals(-1, ArithmeticCalculator.add(2, -3));
        assertEquals(0, ArithmeticCalculator.add(-5, 5));
        assertEquals(100, ArithmeticCalculator.add(50, 50));
    }

    @Test
    public void testSubtraction() {
        assertEquals(-1, ArithmeticCalculator.subtract(2, 3));
        assertEquals(5, ArithmeticCalculator.subtract(2, -3));
        assertEquals(0, ArithmeticCalculator.subtract(5, 5));
        assertEquals(25, ArithmeticCalculator.subtract(50, 25));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, ArithmeticCalculator.multiply(2, 3));
        assertEquals(-6, ArithmeticCalculator.multiply(2, -3));
        assertEquals(0, ArithmeticCalculator.multiply(0, 5));
        assertEquals(25, ArithmeticCalculator.multiply(-5, -5));
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, ArithmeticCalculator.divide(6, 3), DELTA);
        assertEquals(-2.0, ArithmeticCalculator.divide(6, -3), DELTA);
        assertEquals(0.5, ArithmeticCalculator.divide(1, 2), DELTA);
        assertEquals(3.333, ArithmeticCalculator.divide(10, 3), 0.001);
    }

    @Test
    public void testDivisionByZero() {
        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> ArithmeticCalculator.divide(10, 0)
        );
        assertEquals("Деление на ноль невозможно", exception.getMessage());
    }

    @Test
    public void testDivisionWithNegativeNumbers() {
        assertEquals(-2.0, ArithmeticCalculator.divide(-6, 3), DELTA);
        assertEquals(2.0, ArithmeticCalculator.divide(-6, -3), DELTA);
    }
}
