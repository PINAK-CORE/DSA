class Solution {
    public int firstMissingPositive(int[] nums) {
        
        // Q   : https://leetcode.com/problems/first-missing-positive/
        // Sol : https://leetcode.com/problems/first-missing-positive/solutions/5323907/first-missing-positive-eazy-understandable-simple-solution-java
        
        Arrays.sort(nums);

        int start = 1;

        for(int i  = 0 ; i < nums.length;i++)
        {
            if(nums[i] == start)
            {
                start ++;
            }
        }
        return start;
    }
}