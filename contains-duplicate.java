class Solution {
    public boolean containsDuplicate(int[] nums) {

        // Q : https://leetcode.com/problems/contains-duplicate/
        //Sol. Link : https://leetcode.com/problems/contains-duplicate/solutions/5363529/contains-duplicate-eazy-understandable-simple-solution-java


        Arrays.sort(nums);

        for(int i = 1; i <= nums.length-1 ; i++)
        {
           if(nums[i-1] == nums[i])
           {
            return  true;
           } 
        }
        return false;

    }
}