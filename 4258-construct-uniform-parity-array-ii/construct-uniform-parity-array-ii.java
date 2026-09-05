class Solution {
    public boolean uniformArray(int[] nums1) {
        int minVal = Integer.MAX_VALUE;
        boolean hasOdd = false;

        for (int x : nums1) {
            if (x < minVal) {
                minVal = x;
            }
            if ((x & 1) == 1) {
                hasOdd = true;
            }
        }

        // If the minimum element is odd, or if there are no odd elements at all
        return (minVal % 2 != 0) || !hasOdd;
    }
}