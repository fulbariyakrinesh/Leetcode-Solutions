/*
    LeetCode 3014 - Minimum Number of Pushes to Type Word I

    Approach:
    There are 8 keys on the keypad.

    To minimize pushes:
    - First 8 letters  -> 1 push each
    - Next 8 letters   -> 2 pushes each
    - Next 8 letters   -> 3 pushes each
    - Next 8 letters   -> 4 pushes each

    Example:
    word = "abcdefghijklmnopqr"
    n = 18

    First 8 letters  -> 8 * 1 = 8
    Next 8 letters   -> 8 * 2 = 16
    Remaining 2      -> 2 * 3 = 6

    Total = 8 + 16 + 6 = 30

    Time Complexity: O(1)
    Space Complexity: O(1)
*/

public class Problem3014 {

    public static int minimumPushes(String word) {

        int n = word.length();

        int ans = 0;
        int pushes = 1;
        for (int i = 0; i < n / 8; i++) {
            ans += pushes * 8;
            pushes++;
        }

        ans += pushes * (n % 8);

        return ans;
    }

    public static void main(String[] args) {

        String word = "abcdefghijklmnopqr";

        int result = minimumPushes(word);

        System.out.println("Minimum pushes: " + result);
    }
}