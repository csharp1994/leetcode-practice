package practice;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for RotateMatrix.
 */
public class RotateArrayTest {

    RotateArray rotator;

    @Before
    public void setUp() {
        rotator = new RotateArray();
    }

    @Test
    public void rotateTenSteps() {

        int[] testArr = { 7, 1, 2, 3, 4, 5, 6 };
        rotator.rotate(testArr, 10);
        int[] expected = { 4, 5, 6, 7, 1, 2, 3 };
        assertArrayEquals(expected, testArr);
    }

    @Test
    public void rotateTenThousandSteps() {

        int[] testArr = { 7, 1, 2, 3, 4, 5, 6 };
        rotator.rotate(testArr, 10000);
        int[] expected = { 3, 4, 5, 6, 7, 1, 2 };
        assertArrayEquals(expected, testArr);
    }

    @Test
    public void rotateZeroSteps() {

        int[] testArr = { 7, 1, 2, 3, 4, 5, 6 };
        rotator.rotate(testArr, 0);
        int[] expected = { 7, 1, 2, 3, 4, 5, 6 };
        assertArrayEquals(expected, testArr);
    }
}
