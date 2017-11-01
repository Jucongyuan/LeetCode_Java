package com.jucongyuan.hard._0004;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = nums1.length + nums2.length;
        if (l % 2 == 1) {
            return findKthMax(nums1, nums2, l / 2 + 1, 0, 0);
        } else {
            return (findKthMax(nums1, nums2, l / 2, 0, 0) + findKthMax(nums1, nums2, l / 2 + 1, 0, 0)) / 2.0;
        }
    }

    private int findKthMax(int[] nums1, int[] nums2, int k, int nums1Start, int nums2Start) {
        if (nums1Start >= nums1.length) {
            return nums2[nums2Start + k - 1];
        }

        if (nums2Start >= nums2.length) {
            return nums1[nums1Start + k - 1];
        }

        if (k == 1) {
            return Math.min(nums1[nums1Start], nums2[nums2Start]);
        }

        int nums1_v = (nums1Start + k / 2 - 1) < nums1.length ? nums1[nums1Start + k / 2 - 1] : Integer.MAX_VALUE;

        int nums2_v = (nums2Start + k / 2 - 1) < nums2.length ? nums2[nums2Start + k / 2 - 1] : Integer.MAX_VALUE;


        if (nums1_v < nums2_v) {
            return findKthMax(nums1, nums2, k - k / 2, nums1Start + k / 2, nums2Start);
        } else {
            return findKthMax(nums1, nums2, k - k / 2, nums1Start, nums2Start + k / 2);
        }

    }

}
