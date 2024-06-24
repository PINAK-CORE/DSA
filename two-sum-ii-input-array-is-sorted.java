class Solution {
    public int[] twoSum(int[] numbers, int target) {

        // Q :  https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
    // Sol link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/solutions/5363482/two-sum-ii-input-array-is-sorted-eazy-understandable-simple-solution-java
        for (int i = 1; i < numbers.length; i++) {

            for(int j = i-1 ; j >= 0 ; j--)
            {
                if(target == numbers[i]+ numbers[j])
                {
                    
                    return new int[]{j+1,i+1};
                }
            }
            
            
        }
        return new int[]{};
    }
}