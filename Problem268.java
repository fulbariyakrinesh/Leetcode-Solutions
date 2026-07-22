/*
 * LeetCode 268 - Missing Number
 *
 * Problem:
 * Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number that is missing from the array.
 *
 * Approach: Sum Formula
 *
 * Formula:
 * Sum of first n natural numbers (including 0) = n * (n + 1) / 2
 *
 * Steps:
 * 1. Calculate the expected sum of numbers from 0 to n.
 * 2. Calculate the actual sum of all elements in the array.
 * 3. The difference between the expected sum and actual sum is the missing number.
 *
 * Example:
 * nums = [3, 0, 1]
 *
 * n = 3
 * Expected Sum = 3 * (3 + 1) / 2 = 6
 * Actual Sum = 3 + 0 + 1 = 4
 * Missing Number = 6 - 4 = 2
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class Problem268 {

    public static int missingNumber(int[] nums) {

        // Length of the array
        int n = nums.length;

        // Calculate the expected sum of numbers from 0 to n
        int expectedSum = n * (n + 1) / 2;

        // Calculate the actual sum of array elements
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        // Return the missing number
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        int[] nums = {3, 0, 1};

        int result = missingNumber(nums);

        System.out.println("Missing Number: " + result);
    }
}