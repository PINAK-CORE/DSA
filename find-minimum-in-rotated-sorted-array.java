class Solution {
    public int findMin(int[] nums) {
        
        //  Q   : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
        // Sol. : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/solutions/5335383/find-minimum-in-rotated-sorted-array-eazy-understandable-simple-solution-java
        int left = 0;
        int right = nums.length - 1;
        while(right>left){
            int mid = left+(right-left)/2;
            if(nums[mid]>nums[right]){
                
                left=mid+1;
            }else{
                
                right=mid;
            }
        }
        return nums[left];
    }
}