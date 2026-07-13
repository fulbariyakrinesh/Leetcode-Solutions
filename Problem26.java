/*
 * Problem: 26. Remove Duplicates from Sorted Array
 *
 * Difficulty: Easy
 *
 * Approach:
 * - Since the array is already sorted, all duplicate elements are adjacent.
 * - Use the Two Pointer technique:
 *      1. Pointer 'k' keeps track of the index of the last unique element.
 *      2. Pointer 'i' scans the array from left to right.
 *      3. Whenever nums[i] is different from nums[k],
 *         it means a new unique element is found.
 *      4. Increment 'k' and copy nums[i] to nums[k].
 * - After the loop, the first (k + 1) elements of the array
 *   contain all unique values in sorted order.
 *
 * Example:
 * Input:  [1,1,2,2,3]
 * Output: k = 3
 * Array:  [1,2,3,...]
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class Problem26 {

    public int removeDuplicates(int[] nums) {

        // Pointer to the last unique element
        int k = 0;

        // Traverse the array
        for (int i = 1; i < nums.length; i++) {

            // If a new unique element is found
            if (nums[k] != nums[i]) {

                // Move to the next position
                k++;

                // Store the unique element
                nums[k] = nums[i];
            }
        }

        // Number of unique elements
        return k + 1;
    }

    // Driver Code (For VS Code Testing)
    public static void main(String[] args) {

        Problem26 solution = new Problem26();

        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};

        int k = solution.removeDuplicates(nums);

        System.out.println("Number of Unique Elements: " + k);

        System.out.print("Updated Array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
