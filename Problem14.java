/*
------------------------------------------------------------
LeetCode 14 - Longest Common Prefix
Difficulty : Easy
Language   : Java
------------------------------------------------------------

Approach:
1. Sort the array.
2. Compare the first and last strings.
3. The common prefix between them is the answer because
   all other strings lie between them after sorting.
4. Stop at the first mismatch.

Time Complexity : O(n log n + m)
Space Complexity: O(1)
 */
import java.util.Arrays;

public class Problem14 {

    public String longestCommonPrefix(String[] strs) {

        StringBuilder result = new StringBuilder();

        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        for (int i = 0; i < first.length && i < last.length; i++) {

            if (first[i] != last[i]) {
                break;
            }

            result.append(first[i]);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Problem14 obj = new Problem14();

        String[] strs = {"flower", "flow", "flight"};

        String ans = obj.longestCommonPrefix(strs);

        System.out.println("Longest Common Prefix: " + ans);
    }
}
