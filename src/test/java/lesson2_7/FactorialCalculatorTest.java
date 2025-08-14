package lesson2_7;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FactorialCalculatorTest {

    @Test
    public void testFactorialOfZero() {
        assertEquals(FactorialCalculator.factorial(0), 1);
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(FactorialCalculator.factorial(1), 1);
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(FactorialCalculator.factorial(5), 120);
        assertEquals(FactorialCalculator.factorial(1), 1);
        assertEquals(FactorialCalculator.factorial(2), 2);
        assertEquals(FactorialCalculator.factorial(3), 6);
        assertEquals(FactorialCalculator.factorial(4), 24);
    }

    @Test
    public void testFactorialOfLargeNumber() {
        assertEquals(FactorialCalculator.factorial(10), 3628800L);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Факториал определен только для неотрицательных чисел")
    public void testFactorialOfNegativeNumber() {
        FactorialCalculator.factorial(-1);
    }
}
