/*
 * LeetCode 6: Zigzag Conversion
 *
 * Approach:
 * - Traverse the string row by row instead of building a 2D matrix.
 * - For each row, calculate the next character's position using jump values.
 * - The first and last rows use a single fixed jump.
 * - The middle rows alternate between two jumps:
 *      1. south = downward jump
 *      2. north = upward diagonal jump
 * - Append each visited character directly to the answer.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1) (excluding the output StringBuilder)
 */

public class Problem6 {

    public static String convert(String s, int numRows) {

        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numRows; i++) {

            int index = i;
            int south = 2 * (numRows - i - 1);
            int north = 2 * i;
            boolean going = true;

            while (index < s.length()) {

                sb.append(s.charAt(index));

                if (i == 0) {
                    index += south;
                } else if (i == numRows - 1) {
                    index += north;
                } else {

                    if (going) {
                        index += south;
                    } else {
                        index += north;
                    }

                    going = !going;
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String s = "PAYPALISHIRING";
        int numRows = 4;

        System.out.println("Input  : " + s);
        System.out.println("Rows   : " + numRows);
        System.out.println("Output : " + convert(s, numRows));
    }
}
