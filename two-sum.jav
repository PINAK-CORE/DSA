class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // https://leetcode.com/problems/two-sum/

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