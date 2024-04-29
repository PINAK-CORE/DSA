class Solution {
    public int lengthOfLastWord(String s) {

        // Q : https://leetcode.com/problems/length-of-last-word/
        // Solution : https://leetcode.com/problems/length-of-last-word/solutions/5086125/length-of-last-word-simple-solution-java-eazy-understandable
        
        String[] a = s.split(" ");
        String x = a[a.length-1];
        return x.length();

    }
}