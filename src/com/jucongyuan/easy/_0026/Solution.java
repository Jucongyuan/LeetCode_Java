package com.jucongyuan.easy._0026;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2)
            return nums.length;
        int c = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) continue;
            else {
                nums[c] = nums[i];
                c++;
            }
        }
        return c;
    }
}
