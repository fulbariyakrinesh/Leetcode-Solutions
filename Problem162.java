/*
Problem: 162. Find Peak Element

Difficulty: Medium

Approach:
- Use Binary Search to efficiently find a peak element.
- A peak element is greater than its adjacent elements.
- Compare the middle element with the next element.
- If nums[mid] > nums[mid + 1], then the peak lies on the left side
  (including mid), so move the right pointer to mid.
- Otherwise, the peak lies on the right side, so move the left pointer
  to mid + 1.
- Continue until left and right meet.
- The meeting index is the peak element.

Example 1:
Input : [1, 2, 3, 1]
Output: 2

Example 2:
Input : [1, 2, 1, 3, 5, 6, 4]
Output: 5 (or 1)

Time Complexity: O(log n)
Space Complexity: O(1)
 */

public class Problem162 {

    public int findPeakElement(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = (left + right) / 2;

            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {

        Problem162 solution = new Problem162();
        int[] nums = {1, 2, 3, 1};

        int peakIndex = solution.findPeakElement(nums);

        System.out.println("Peak Element Index : " + peakIndex);
        System.out.println("Peak Element Value : " + nums[peakIndex]);
    }
}
