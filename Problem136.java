/*
    LeetCode Problem: 136. Single Number

    Approach: Bit Manipulation (XOR)

    Idea:
    - Every number appears twice except one.
    - XOR (^) has two important properties:
        1. a ^ a = 0
           (A number XOR with itself becomes 0)

        2. a ^ 0 = a
           (A number XOR with 0 remains unchanged)

    Algorithm:
    1. Initialize result = 0.
    2. Traverse every number in the array.
    3. XOR the current number with result.
    4. Duplicate numbers cancel each other out.
    5. The remaining value is the single number.

    Example:
    nums = [2, 1, 4, 5, 2, 4, 1]

    result = 0
    result = 0 ^ 2 = 2
    result = 2 ^ 1 = 3
    result = 3 ^ 4 = 7
    result = 7 ^ 5 = 2
    result = 2 ^ 2 = 0
    result = 0 ^ 4 = 4
    result = 4 ^ 1 = 5

    Final Answer = 5

    Time Complexity: O(n)
    Space Complexity: O(1)
*/

public class Problem136 {

    public static int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {2, 1, 4, 5, 2, 4, 1};

        int answer = singleNumber(nums);

        System.out.println("Single Number: " + answer);
    }
}