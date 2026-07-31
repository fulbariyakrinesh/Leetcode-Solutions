 /*
     * Check if Binary String Has at Most One Segment of Ones
     *
     * APPROACH 1:
     * We scan the string from left to right.
     *
     * Whenever we find '1' after a '0', a new segment of 1s starts.
     *
     * Example:
     * "110011"
     *
     * First segment  -> "11"
     * Second segment -> "11"
     *
     * Since there are 2 segments, return false.
     *
     * If there is only 1 segment of 1s, return true.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */


public class Problem1784 {

    public static boolean checkOnesSegment(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1' &&
                (i == 0 || s.charAt(i - 1) == '0')) {

                count++;
            }
            if (count > 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "110011";

        System.out.println(checkOnesSegment(s));
    }
}