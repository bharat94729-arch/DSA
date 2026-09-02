class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, count = 0;
        int prev = -1, curr = -1;

        int n = nums1.length + nums2.length;

        while( count <= n/2){
            prev = curr;

            if(i < nums1.length && (j >= nums2.length || nums1[i] <= nums2[j])){
                curr = nums1[i];
                i++;
            }else{
                curr = nums2[j];
                j++;
            }
            count++;

        }
        if(n % 2 == 1){
            return curr;
        }else{
            return (prev + curr) / 2.0;
        }
    }
}