class Solution {
    public int[] plusOne(int[] digits) {
    
    // Q    : https://leetcode.com/problems/plus-one/
    // Sol. : https://leetcode.com/problems/plus-one/solutions/5325530/plus-one-eazy-understandable-simple-solution-java 
    for(int i=digits.length-1; i>=0; i--) {
        if(digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        
        digits[i] = 0;
    }
    
    int[] newNumber = new int [digits.length+1];
    newNumber[0] = 1;
    
    return newNumber;
    }
}