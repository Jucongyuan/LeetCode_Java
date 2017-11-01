package com.jucongyuan.medium._0016;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ret = Integer.MAX_VALUE / 2;
        if (nums.length < 3)
            return ret;
        Arrays.sort(nums);
        int l;
        int r;
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            l = i + 1;
            r = nums.length - 1;
            while (l < r) {
                int t = nums[i] + nums[l] + nums[r];
                if (t == target)
                    return t;
                if (Math.abs(t - target) < Math.abs(ret - target))
                    ret = t;
                if (t < target) l++;
                else r--;
            }
        }
        return ret;
    }
}


