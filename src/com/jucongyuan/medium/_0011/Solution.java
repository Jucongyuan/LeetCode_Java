package com.jucongyuan.medium._0011;

public class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        while (l < r) {
            int left = height[l];
            int right = height[r];
            max = Math.max(max, ((r - l) * Math.min(height[l], height[r])));
            if (left < right) while (height[l] <= left && l++ < height.length - 1) ;
            else while (height[r] <= right && r-- > 0) ;
        }
        return max;
    }
}
