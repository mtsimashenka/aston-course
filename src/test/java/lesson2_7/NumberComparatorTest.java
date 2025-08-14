package lesson2_7;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberComparatorTest {

    @Test
    public void testCompare() {
        assertEquals(NumberComparator.compare(5, 3), 1);  // первое больше
        assertEquals(NumberComparator.compare(3, 5), -1); // первое меньше
        assertEquals(NumberComparator.compare(5, 5), 0);  // равны
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
        assertEquals(NumberComparator.compare(-3, -5), 1);
        assertEquals(NumberComparator.compare(-5, -3), -1);
        assertEquals(NumberComparator.compare(-5, -5), 0);
    }
}
