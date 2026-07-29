public class Problem125 {

    public static boolean isPalindrome(String s) {

        // Convert all characters to lowercase
        // and remove everything except letters (a-z) and digits (0-9)
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";

        System.out.println(isPalindrome(s1)); // true
        System.out.println(isPalindrome(s2)); // false
        System.out.println(isPalindrome(s3)); // true
    }
}

/*
----------------------------------------------------
Explanation of this line:

s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

1. toLowerCase()
   Converts all uppercase letters to lowercase.

   Example:
   "HeLLo123" -> "hello123"

2. replaceAll("[^a-z0-9]", "")

   replaceAll(regex, replacement)

   Regex Breakdown:

   []       -> Character set
   a-z      -> Lowercase letters
   0-9      -> Digits
   ^        -> NOT (inside [])

   Therefore,

   [^a-z0-9]

   means:
   Match every character that is NOT
   - a lowercase letter (a-z)
   - a digit (0-9)

   Replace them with ""
   (empty string), which removes them.

Example:

Input:
"A man, a plan, a canal: Panama"

After toLowerCase():
"a man, a plan, a canal: panama"

After replaceAll():
"amanaplanacanalpanama"

This preprocessing makes it easy to check whether
the string is a palindrome using two pointers.

Time Complexity : O(n)
Space Complexity: O(n)
----------------------------------------------------
*/