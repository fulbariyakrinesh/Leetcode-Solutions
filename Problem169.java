/*
 * LeetCode 169 - Majority Element
 *
 * Problem:
 * Given an integer array nums of size n, return the majority element.
 * The majority element is the element that appears more than n/2 times.
 * It is guaranteed that the majority element always exists.
 *
 * Example:
 * Input : [2,2,1,1,1,2,2]
 * Output: 2
 *
 * Approach:
 * Boyer-Moore Voting Algorithm
 *
 * Idea:
 * - Maintain a candidate and a count.
 * - If count becomes 0, select the current element as the new candidate.
 * - If the current element equals the candidate, increase the count.
 * - Otherwise, decrease the count.
 * - Since the majority element appears more than n/2 times,
 *   it cannot be completely canceled out by other elements.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

public class Problem169 {

    public static int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            }
            else {
                count--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("Majority Element: " + majorityElement(nums));
    }
}