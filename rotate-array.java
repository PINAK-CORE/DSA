class Solution {
    public void rotate(int[] nums, int k) {
        
        // Q : https://leetcode.com/problems/rotate-array/
        //Sol. link : https://leetcode.com/problems/rotate-array/solutions/5363519/rotate-array-eazy-understandable-simple-solution-java

         int n=nums.length;
        int num[] = new int[n];
        int x=0;
        for(int i=0;i<n;i++)
        {
            num[(i+k)%n]=nums[i];
        }
        for(int i=0;i<n;i++)
        {
            nums[i]=num[i];        
            
        }            
              
        
        
    }
}