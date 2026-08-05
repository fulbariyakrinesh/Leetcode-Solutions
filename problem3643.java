/*
    LeetCode 3643 - Reverse Submatrix

    Problem:
    You are given a 2D matrix (grid) and three integers:
    - x : Starting row of the submatrix
    - y : Starting column of the submatrix
    - k : Size of the square submatrix

    Reverse the selected k × k submatrix vertically.
    This means:
    - Swap the first row of the submatrix with the last row.
    - Swap the second row with the second last row.
    - Continue until all rows are reversed.

    Approach:
    1. Set two pointers:
       - top = x (first row of the submatrix)
       - bottom = x + k - 1 (last row of the submatrix)
    2. While top < bottom:
       - Traverse each column of the submatrix.
       - Swap the elements of the top row with the corresponding
         elements of the bottom row.
    3. Move:
       - top++
       - bottom--
    4. Return the modified grid.

    Example:

    Grid:
    1  2  3  4
    5  6  7  8
    9 10 11 12
    13 14 15 16

    x = 1, y = 1, k = 2

    Selected Submatrix:
    6  7
    10 11

    After Reversing:
    10 11
    6  7

    Final Grid:
    1  2  3  4
    5 10 11  8
    9  6  7 12
    13 14 15 16

    Time Complexity: O(k²)
    - We visit each element of the k × k submatrix at most once.

    Space Complexity: O(1)
    - No extra space is used except a temporary variable.
*/

import java.util.Arrays;

public class problem3643 {

    public static int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {

        int top = x;
        int bottom = x + k - 1;

        while (top < bottom) {

            // Swap corresponding elements of the top and bottom rows
            for (int j = y; j < y + k; j++) {

                int temp = grid[top][j];
                grid[top][j] = grid[bottom][j];
                grid[bottom][j] = temp;
            }

            top++;
            bottom--;
        }

        return grid;
    }

    public static void main(String[] args) {

        int[][] grid = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int x = 1;
        int y = 1;
        int k = 2;

        int[][] result = reverseSubmatrix(grid, x, y, k);

        System.out.println("Grid after reversing the submatrix:");

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}