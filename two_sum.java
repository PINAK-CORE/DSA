class Solution {
    public int[] two_sum(int[] nums, int target) {
        
        
        // Q: https://leetcode.com/problems/two-sum/
        // Solution: https://leetcode.com/problems/two-sum/solutions/5081558/two-sum-solution-eazy-java-simple-and-understandable-approach

        for (int i = 1; i < nums.length; i++) {

            for(int j = i-1 ; j >= 0 ; j--)
            {
                if(target == nums[i]+ nums[j])
                {
                    
                    return new int[]{i,j};
                }
            }
            
            
        }
        return new int[]{};
    }
}