

    /*
     * Problem: Find Missing Elements
     *
     * Approach:
     * 1. Sort the array.
     * 2. Start with the first element as 'cur'.
     * 3. Traverse the sorted array.
     * 4. If cur < nums[i], then cur is missing.
     * 5. Add cur to the result.
     * 6. Use i-- so that the same nums[i] is checked again.
     * 7. Increase cur after every check.
     *
     * Example:
     * Input:  [1, 4]
     * Output: [2, 3]
     *
     * Time Complexity: O(n log n)
     * Space Complexity: O(n)
     */


import java.util.*;

public class Problem3731 {
    public static List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        int cur = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (cur < nums[i]) {
                res.add(cur);

                i--;
            }

            // Move to the next number
            cur++;
        }

        return res;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Enter array elements
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call the method
        List<Integer> result = findMissingElements(nums);

        // Print result
        System.out.println("Missing elements: " + result);

        sc.close();
    }
}

