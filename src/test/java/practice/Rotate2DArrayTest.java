package practice;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for Rotate2DArray.
 */
public class Rotate2DArrayTest {

    Rotate2DArray rotator;

    @Before
    public void setUp() {
        rotator = new Rotate2DArray();
    }

    @Test
    public void testRotate() {

        int[][] input = new int[][] {
                { 5, 0, 0, 0, 6 },
                { 2, 2, 0, 0, 2 },
                { 0, 0, 5, 0, 0 },
                { 3, 1, 0, 0, 0 },
                { 0, 0, 1, 0, 5 }
        };
        rotator.rotate(input);
        int[][] expected = new int[][] {
                { 0, 3, 0, 2, 5 },
                { 0, 1, 0, 2, 0 },
                { 1, 0, 5, 0, 0 },
                { 0, 0, 0, 0, 0 },
                { 5, 0, 0, 2, 6 }
        };
        assertArrayEquals(expected, input);
    }
}
