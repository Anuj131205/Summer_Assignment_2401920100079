/*
Problem:
Remove duplicates from a sorted array in-place and return
the number of unique elements.

Approach:
This solution uses the Two Pointer technique.

The pointer 'rd' tracks the position of the last unique element.
As we iterate through the array, whenever a new unique element
is found, we move 'rd' forward and place that element there.

This ensures all unique elements remain at the beginning
of the array without using extra space.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int rd = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[rd]!=nums[i]){
                rd++;
                nums[rd]=nums[i];
            }
        }
        return rd+1;
    }
}
