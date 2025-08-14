package lesson2_7;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TriangleAreaCalculatorTest {

    private static final double DELTA = 0.001;

    @Test
    public void testCalculateAreaByBaseAndHeight() {
        assertEquals(TriangleAreaCalculator.calculateArea(10, 5), 25.0, DELTA);
        assertEquals(TriangleAreaCalculator.calculateArea(4, 3), 6.0, DELTA);
        assertEquals(TriangleAreaCalculator.calculateArea(1, 1), 0.5, DELTA);
    }

    @Test
    public void testCalculateAreaBySides() {
        assertEquals(TriangleAreaCalculator.calculateAreaBySides(3, 4, 5), 6.0, DELTA);

        double expected = Math.sqrt(3); // Площадь = sqrt(3)
        assertEquals(TriangleAreaCalculator.calculateAreaBySides(2, 2, 2), expected, DELTA);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Основание и высота должны быть положительными")
    public void testCalculateAreaWithNegativeBase() {
        TriangleAreaCalculator.calculateArea(-1, 5);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Основание и высота должны быть положительными")
    public void testCalculateAreaWithZeroHeight() {
        TriangleAreaCalculator.calculateArea(10, 0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Невозможно построить треугольник с такими сторонами")
    public void testCalculateAreaBySidesInvalidTriangle() {
        TriangleAreaCalculator.calculateAreaBySides(1, 1, 5);
    }
}
