package lesson2_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TriangleAreaCalculatorTest {

    private static final double DELTA = 0.001;

    @Test
    public void testCalculateAreaByBaseAndHeight() {
        assertEquals(25.0, TriangleAreaCalculator.calculateArea(10, 5), DELTA);
        assertEquals(6.0, TriangleAreaCalculator.calculateArea(4, 3), DELTA);
        assertEquals(0.5, TriangleAreaCalculator.calculateArea(1, 1), DELTA);
    }

    @Test
    public void testCalculateAreaBySides() {
        assertEquals(6.0, TriangleAreaCalculator.calculateAreaBySides(3, 4, 5), DELTA);
        double expected = Math.sqrt(3);
        assertEquals(expected, TriangleAreaCalculator.calculateAreaBySides(2, 2, 2), DELTA);
    }

    @Test
    public void testCalculateAreaWithNegativeValues() {
        IllegalArgumentException exception1 = assertThrows(
                IllegalArgumentException.class,
                () -> TriangleAreaCalculator.calculateArea(-1, 5)
        );

        IllegalArgumentException exception2 = assertThrows(
                IllegalArgumentException.class,
                () -> TriangleAreaCalculator.calculateArea(10, -2)
        );

        assertEquals("Основание и высота должны быть положительными", exception1.getMessage());
    }

    @Test
    public void testCalculateAreaWithZeroValues() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> TriangleAreaCalculator.calculateArea(0, 5)
        );
        assertEquals("Основание и высота должны быть положительными", exception.getMessage());
    }

    @Test
    public void testCalculateAreaBySidesInvalidTriangle() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> TriangleAreaCalculator.calculateAreaBySides(1, 1, 5)
        );
        assertEquals("Невозможно построить треугольник с такими сторонами", exception.getMessage());
    }
}
