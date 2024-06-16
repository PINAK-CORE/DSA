class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        

        // Q : https://leetcode.com/problems/median-of-two-sorted-arrays/
        // Sol : https://leetcode.com/problems/median-of-two-sorted-arrays/solutions/5318896/median-of-two-sorted-arrays-simple-solution-java-eazy-understandable
        
        int n = nums1.length;
        int m = nums2.length;
        
        int[] merged = new int[n + m]; // Create an array to hold the merged elements
        int k = 0;
        for (int i = 0; i < n; i++) {
            merged[k++] = nums1[i]; // Copy elements from nums1 to merged
        }
        for (int i = 0; i < m; i++) {
            merged[k++] = nums2[i]; // Copy elements from nums2 to merged
        }

        Arrays.sort(merged); // Sort the merged array

        int total = n + m; // Get the total number of elements

        if (total % 2 == 1) { // If total elements are odd
            return (double) merged[total / 2]; // Median is the middle element
        } else { // If total elements are even
            int middle1 = merged[total / 2 - 1]; // Get element before middle
            int middle2 = merged[total / 2];     // Get element at middle
            return ((double) middle1 + (double) middle2) / 2.0; // Median is average of middle elements
        }
    }
}