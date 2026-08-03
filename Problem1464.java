/*\
* LeetCode 1464 - Maximum Product of Two Elements in an Array
     *
     * Problem:
     * We have an integer array nums.
     * We need to choose two different elements nums[i] and nums[j]
     * and return:
     *
     * (nums[i] - 1) * (nums[j] - 1)
     *
     * Approach:
     * The maximum product will always come from the two largest
     * elements in the array.
     *
     * So, we find:
     * 1. The largest element -> first
     * 2. The second largest element -> second
     *
     * Then calculate:
     *
     * (first - 1) * (second - 1)
     *
     * Example:
     * nums = [3, 4, 5, 2]
     *
     * Largest = 5
     * Second largest = 4
     *
     * Answer = (5 - 1) * (4 - 1)
     *        = 4 * 3
     *        = 12
     *
     * Time Complexity: O(n)
     * We traverse the array only once.
     *
     * Space Complexity: O(1)
     * We use only two variables.
*/

public class Problem1464 {

    public static int maxProduct(int[] nums) {

        int first = 0;
        int second = 0;
       
        for (int num : nums) {

            if (num > first) {
                second = first;
                first = num;
            } 
            else if (num > second) {
                second = num;
            }
        }
        return (first - 1) * (second - 1);
    }

    public static void main(String[] args) {

        int[] nums = {3, 4, 5, 2};

        int result = maxProduct(nums);

        System.out.println("Maximum Product: " + result);
    }
}

