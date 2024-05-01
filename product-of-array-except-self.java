
import java.util.Arrays;


class Solution {
    public int[] productExceptSelf(int[] nums) {
       
       // Q :  https://leetcode.com/problems/product-of-array-except-self/
       // Sol. : https://leetcode.com/problems/product-of-array-except-self/solutions/5095358/simple-solution-beats-79-91-java-eazy-understandable
    
   int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for(int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;


    }
}