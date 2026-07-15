/*
Problem: 66. Plus One

Difficulty: Easy

Approach:
- Traverse the array from the last digit because addition starts from the least significant digit.
- If the current digit is less than 9, simply increment it and return the array.
- If the current digit is 9, change it to 0 and continue to the previous digit (carry).
- If every digit is 9, create a new array with one extra digit.
- Set the first element to 1. The remaining elements are automatically initialized to 0.

Example:
Input : [1,2,3]
Output: [1,2,4]

Input : [1,2,9]
Output: [1,3,0]

Input : [9,9,9]
Output: [1,0,0,0]

Time Complexity: O(n)
Space Complexity: O(1)
(Uses O(n) space only when all digits are 9 and a new array is created.)
*/

public class Problem66 {

    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;

        return newDigits;
    }

    public static void main(String[] args) {

        Problem66 solution = new Problem66();

        int[] digits = {9, 9, 9};

        int[] result = solution.plusOne(digits);

        System.out.print("Output: ");

        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}