class Solution {
    public boolean isPalindrome(String s) {
        
        // Q : https://leetcode.com/problems/valid-palindrome/
        // Solution : https://leetcode.com/problems/valid-palindrome/solutions/5095458/valid-palindrome-simple-solution-beats-42-28-java-eazy-and-understandable
        
        s.trim();
        s = s.toLowerCase();
        s = s.replace(" ","" );
        s = s.replaceAll("[^a-z0-9]", "");

        int i = 0;
        int j = s.length()-1;

        while (i < j) {
            if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
            
            i++;
            j--;
        }
        return true;


    }
}