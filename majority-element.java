class Solution {
    public int majorityElement(int[] nums) {

        // Q : https://leetcode.com/problems/majority-element/
        // Sol. link : https://leetcode.com/problems/majority-element/solutions/5363493/majority-element-eazy-understandable-simple-solution-java

       Arrays.sort(nums);

       int n = nums.length;

       return nums[n/2];
    }
}