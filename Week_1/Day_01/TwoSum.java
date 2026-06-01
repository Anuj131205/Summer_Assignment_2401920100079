/*
Problem:
Given an array of integers nums and an integer target,
return the indices of the two numbers such that they add up to the target.

Approach:
A HashMap is used to store array elements and their indices.

For each element, we calculate the complement
(target - current element) and check whether it already exists
in the HashMap.

If the complement is found, we return the pair of indices.
Otherwise, we store the current element and its index for future lookups.

This allows us to find the solution in a single pass through the array.

Time Complexity: O(n)
Space Complexity: O(n)
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
