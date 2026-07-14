/*
Problem: 16. 3Sum Closest

Difficulty: Medium

Approach:
1. Sort the array so that we can use the Two Pointer technique.
2. Assume the sum of the first three elements is the closest answer initially.
3. Fix one element using a loop (curr = i).
4. Use two pointers:
   - left starts from the next element (i + 1).
   - right starts from the last element.
5. Calculate the sum of the three elements.
6. If the current sum is closer to the target than the previous closest sum,
   update the closest answer.
7. If:
   - sum == target  -> return target immediately (exact match found).
   - sum < target   -> move left pointer right to increase the sum.
   - sum > target   -> move right pointer left to decrease the sum.
8. Continue until all possible triplets are checked.
9. Return the closest sum.

Time Complexity: O(n²)
- Sorting takes O(n log n).
- The outer loop runs O(n) times.
- The two pointers together traverse the array once for each i.

Space Complexity: O(1)
- Only a few extra variables are used.
*/

import java.util.Arrays;

public class Problem16 {

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        
        int closest = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {

            int curr = i;
            int left = i + 1;
            int right = nums.length - 1;

            
            while (left < right) {

                int sum = nums[curr] + nums[left] + nums[right];

           
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

              
                if (sum == target) {
                    return target;
                }

         
                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closest;
    }

    public static void main(String[] args) {

        int[] nums = {-1, 2, 1, -4};
        int target = 1;

        int answer = threeSumClosest(nums, target);

        System.out.println("Closest Sum = " + answer);
    }
}