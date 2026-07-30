import java.util.*;

public class Problem349 {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> resultList = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num)) {
                resultList.add(num);
                map.remove(num);
            }
        }

 
        int[] result = new int[resultList.size()];

        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] ans = intersection(nums1, nums2);

        System.out.println("Intersection:");

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}

/*
---------------------------------------------------------
LeetCode 349 - Intersection of Two Arrays
---------------------------------------------------------

Problem:
Given two integer arrays nums1 and nums2,
return an array of their intersection.

Each element in the result must be unique,
and the result can be returned in any order.

---------------------------------------------------------
Approach: HashMap + ArrayList
---------------------------------------------------------

Step 1:
Create a HashMap and store every element of nums1.

Example:

nums1 = [1,2,2,1]

Map:

1 -> 2
2 -> 2

---------------------------------------------------------

Step 2:
Traverse nums2.

If the current number exists in the map:

1. Add it to resultList.
2. Remove it from the map.

Why remove?

Because the answer should contain only UNIQUE elements.

Example:

nums2 = [2,2]

First 2:
Map contains 2
Add to answer
Remove 2

Second 2:
Map no longer contains 2
Ignore

Answer:
[2]

---------------------------------------------------------

Step 3:
Convert the ArrayList into an int[] array.

---------------------------------------------------------
Example

nums1 = [4,9,5]
nums2 = [9,4,9,8,4]

Map:
4 -> 1
9 -> 1
5 -> 1

Traverse nums2

9 -> Present -> Add -> Remove
4 -> Present -> Add -> Remove
9 -> Not Present
8 -> Not Present
4 -> Not Present

Answer:
[9,4]

---------------------------------------------------------
Time Complexity

Building HashMap  : O(n)
Traversing nums2  : O(m)

Overall:
O(n + m)

---------------------------------------------------------
Space Complexity

HashMap   : O(n)
ArrayList : O(min(n,m))

Overall:
O(n)

---------------------------------------------------------
Key Methods Used

map.put(key, value)
Adds or updates a key.

map.getOrDefault(key, defaultValue)
Returns the value if present,
otherwise returns defaultValue.

map.containsKey(key)
Checks whether a key exists.

map.remove(key)
Deletes the key from the map.

resultList.add(value)
Adds an element to the ArrayList.

resultList.get(index)
Returns the element at the given index.

---------------------------------------------------------
*/