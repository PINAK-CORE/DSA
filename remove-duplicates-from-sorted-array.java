class Solution {
    public int removeDuplicates(int[] nums) {
        
        // Q : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
        // Sol : https://leetcode.com/problems/remove-duplicates-from-sorted-array/solutions/5318939/title-remove-duplicates-from-sorted-array-eazy-understandable-simple-solution-java/
        int j = 1; // Tracks the index to insert unique elements
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // Check if current element is different from previous
                nums[j] = nums[i]; // If unique, copy to the next unique slot
                j++; // Increment the index for the next unique element
            }
        }
        return j; // Return the number of unique elements (length of the modified array)
    }
}