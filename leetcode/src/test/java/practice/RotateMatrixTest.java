package practice;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for RotateMatrix.
 */
public class RotateMatrixTest {

    RotateMatrix rotator;

    @Before
    public void setUp() {
        rotator = new RotateMatrix();
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
}
