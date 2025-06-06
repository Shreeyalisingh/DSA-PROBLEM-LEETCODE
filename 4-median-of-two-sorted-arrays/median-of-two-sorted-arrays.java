class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
if (nums1.length > nums2.length) return findMedianSortedArrays(nums2, nums1);

        int m = nums1.length, n = nums2.length;
        int l = 0, h = m;

        while (l <= h) {
            int i = (l + h) / 2;
            int j = (m + n + 1) / 2 - i;

            int a1 = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int a2 = (i == m) ? Integer.MAX_VALUE : nums1[i];
            int b1 = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int b2 = (j == n) ? Integer.MAX_VALUE : nums2[j];

            if (a1 <= b2 && b1 <= a2) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(a1, b1) + Math.min(a2, b2)) / 2.0;
                } else {
                    return Math.max(a1, b1);
                }
            } else if (a1 > b2) {
                h = i - 1;
            } else {
                l = i + 1;
            }
        }

        return 0.0;
        
    }
}