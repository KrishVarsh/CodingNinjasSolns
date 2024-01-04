import java.util.*;

public class Solution {

    public static int[] spiralMatrix(int[][] MATRIX) {

        int row = MATRIX.length;
        int column = MATRIX[0].length;
        int arr[] = new int[row * column];
        int k = 0;
        int top = 0, bottom = row - 1, left = 0, right = column - 1;

        if (MATRIX == null || MATRIX.length == 0 || MATRIX[0].length == 0) {
            return new int[0];
        }

        while (top <= bottom && left <= right) {

            // Traverse top row
            for (int i = left; i <= right; i++) {
                arr[k++] = MATRIX[top][i];
            }
            top++;

            // Traverse right column
            for (int i = top; i <= bottom; i++) {
                arr[k++] = MATRIX[i][right];
            }
            right--;

            if (top <= bottom) {
                // Traverse bottom row
                for (int i = right; i >= left; i--) {
                    arr[k++] = MATRIX[bottom][i];
                }
                bottom--;
            }

            if (left <= right) {
                // Traverse left column
                for (int i = bottom; i >= top; i--) {
                    arr[k++] = MATRIX[i][left];
                }
                left++;
            }
        }

        return arr;
    }
}
