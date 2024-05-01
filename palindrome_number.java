class Solution {
    public boolean isPalindrome(int x) {
        
        // Q : https://leetcode.com/problems/palindrome-number/
        // Solution : https://leetcode.com/problems/palindrome-number/solutions/5084181/palindrome-number-simple-solution-java-eazy-and-understandable-approach

        String s = String.valueOf(x);
        int start = 0;
        int end = s.length()-1;
        
        while (start <= end) {

            if (s.charAt(start) == s.charAt(end)) {
                start+=1;
                end-=1;
            }
            else
            {
               return false; 
                
            }
            
            
        }
        return true;

        
        
    }
}
