package lesson2_7;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArithmeticCalculatorTest {

    private static final double DELTA = 0.001;

    @Test
    public void testAddition() {
        assertEquals(ArithmeticCalculator.add(2, 3), 5);
        assertEquals(ArithmeticCalculator.add(2, -3), -1);
        assertEquals(ArithmeticCalculator.add(-5, 5), 0);
        assertEquals(ArithmeticCalculator.add(50, 50), 100);
    }

    @Test
    public void testSubtraction() {
        assertEquals(ArithmeticCalculator.subtract(2, 3), -1);
        assertEquals(ArithmeticCalculator.subtract(2, -3), 5);
        assertEquals(ArithmeticCalculator.subtract(5, 5), 0);
        assertEquals(ArithmeticCalculator.subtract(50, 25), 25);
    }

    @Test
    public void testMultiplication() {
        assertEquals(ArithmeticCalculator.multiply(2, 3), 6);
        assertEquals(ArithmeticCalculator.multiply(2, -3), -6);
        assertEquals(ArithmeticCalculator.multiply(0, 5), 0);
        assertEquals(ArithmeticCalculator.multiply(-5, -5), 25);
    }

    @Test
    public void testDivision() {
        assertEquals(ArithmeticCalculator.divide(6, 3), 2.0, DELTA);
        assertEquals(ArithmeticCalculator.divide(6, -3), -2.0, DELTA);
        assertEquals(ArithmeticCalculator.divide(1, 2), 0.5, DELTA);
        assertEquals(ArithmeticCalculator.divide(10, 3), 3.333, 0.001);
    }

    @Test(expectedExceptions = ArithmeticException.class,
            expectedExceptionsMessageRegExp = "Деление на ноль невозможно")
    public void testDivisionByZero() {
        ArithmeticCalculator.divide(10, 0);
    }

    @Test
    public void testDivisionWithNegativeNumbers() {
        assertEquals(ArithmeticCalculator.divide(-6, 3), -2.0, DELTA);
        assertEquals(ArithmeticCalculator.divide(-6, -3), 2.0, DELTA);
    }
}
