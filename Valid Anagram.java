import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        
        
        // Q : https://leetcode.com/problems/valid-anagram/
        // Solution : https://leetcode.com/problems/valid-anagram/solutions/5095223/valid-anagram-simple-solution-java-eazy-understandable
        
        
        char[] sch= s.toCharArray();
        char[] tch = t.toCharArray();

        Arrays.sort(sch);
        Arrays.sort(tch);

        if(Arrays.equals(sch,tch))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}