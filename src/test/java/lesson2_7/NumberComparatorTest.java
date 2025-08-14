package lesson2_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberComparatorTest {

    @Test
    public void testCompare() {
        assertEquals(1, NumberComparator.compare(5, 3));
        assertEquals(-1, NumberComparator.compare(3, 5));
        assertEquals(0, NumberComparator.compare(5, 5));
    }

    @Test
    public void testIsEqual() {
        assertTrue(NumberComparator.isEqual(5, 5));
        assertFalse(NumberComparator.isEqual(5, 3));
        assertFalse(NumberComparator.isEqual(3, 5));
        assertTrue(NumberComparator.isEqual(-5, -5));
    }

    @Test
    public void testIsGreater() {
        assertTrue(NumberComparator.isGreater(5, 3));
        assertFalse(NumberComparator.isGreater(3, 5));
        assertFalse(NumberComparator.isGreater(5, 5));
        assertTrue(NumberComparator.isGreater(0, -5));
    }

    @Test
    public void testIsLess() {
        assertFalse(NumberComparator.isLess(5, 3));
        assertTrue(NumberComparator.isLess(3, 5));
        assertFalse(NumberComparator.isLess(5, 5));
        assertTrue(NumberComparator.isLess(-5, 0));
    }

    @Test
    public void testCompareNegativeNumbers() {
        assertEquals(1, NumberComparator.compare(-3, -5));  // -3 > -5
        assertEquals(-1, NumberComparator.compare(-5, -3)); // -5 < -3
        assertEquals(0, NumberComparator.compare(-5, -5));  // равны
    }
}
