/*
    LeetCode 1876 - Substrings of Size Three with Distinct Characters

    Problem:
    Given a string s, return the number of substrings of length 3
    that contain all distinct characters.

    Approach (Fixed Sliding Window):
    1. Use two pointers:
       - i -> Left pointer of the window.
       - j -> Right pointer of the window.
    2. Expand the window by moving j.
    3. When the window size becomes exactly 3:
       - Check if all three characters are distinct.
       - If they are, increment the count.
    4. Move the left pointer (i++) to slide the window by one position.
    5. Continue until the end of the string.

    Example:
    Input: "xyzzaz"

    Windows:
    [xyz] -> Good (count = 1)
    [yzz] -> Not Good
    [zza] -> Not Good
    [zaz] -> Not Good

    Output:
    1

    Time Complexity: O(n)
    - Each character is visited once by the right pointer.

    Space Complexity: O(1)
    - No extra data structures are used.
*/

public class Problem1876 {

    public static int countGoodSubstrings(String s) {

        int i = 0;
        int j = 0;
        int count = 0;

        while (j < s.length()) {

            // Check when the window size becomes exactly 3
            if (j - i + 1 == 3) {

                // Check whether all three characters are distinct
                if (s.charAt(i) != s.charAt(i + 1)
                        && s.charAt(i + 1) != s.charAt(i + 2)
                        && s.charAt(i + 2) != s.charAt(i)) {

                    count++;
                }

                // Slide the window
                i++;
            }

            // Expand the window
            j++;
        }

        return count;
    }

    public static void main(String[] args) {

        String s = "aababcabc";

        int result = countGoodSubstrings(s);

        System.out.println("Number of good substrings: " + result);
    }
}