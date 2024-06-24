class Solution {
    public int findMin(int[] nums) {

        // Q : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
        // Sol. link : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/solutions/5363464/find-minimum-in-rotated-sorted-array-ii-eazy-understandable-simple-solution-java

        Arrays.sort(nums);
        return nums[0];
        
    }
}