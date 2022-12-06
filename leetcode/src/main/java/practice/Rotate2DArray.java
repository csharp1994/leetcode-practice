package practice;

/**
 * Given an 'n x n' 2D matrix representing an image, rotate the image by 90
 * degrees clockwise.
 *
 * The rotation occurs in-place, a second 2D array is not created.
 *
 * Example:
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[7,4,1],[8,5,2],[9,6,3]]
 *
 * | 1 | 2 | 3 |
 * | 4 | 5 | 6 |
 * | 7 | 8 | 9 |
 *
 * Rotate 90 degrees clockwise:
 *
 * | 7 | 4 | 1 |
 * | 8 | 5 | 2 |
 * | 9 | 6 | 3 |
 * 
 * Constraints:
 * n == matrix.length == matrix[i].length
 * 1 <= n <= 20
 * -1000 <= matrix[i][j] <= 1000
 */
public class Rotate2DArray {

    /**
     * The input array object will rotated.
     *
     * @param matrix A 2D array of ints
     */
    public void rotate(int[][] matrix) {
        int n = matrix[0].length;

        for (int layer = 0; layer < n / 2; layer++) {
            for (int i = layer; i < n - layer - 1; i++) {
                int temp = matrix[layer][i];

                matrix[layer][i] = matrix[n - i - 1][layer]; // top left
                matrix[n - i - 1][layer] = matrix[n - 1 - layer][n - i - 1]; // bottom left
                matrix[n - 1 - layer][n - i - 1] = matrix[i][n - 1 - layer]; // bottom right
                matrix[i][n - 1 - layer] = temp; // top right
            }
        }
    }
}