package com.jucongyuan.medium._0031;

class Solution {
    public void nextPermutation(int[] nums) {
        if (nums.length == 0) {
            return;
        }

        int r = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                r = i - 1;
                break;
            }
        }

        if (r >= 0) {
            for (int i = nums.length - 1; i > r; i--) {
                if (nums[i] > nums[r]) {
                    int temp = nums[i];
                    nums[i] = nums[r];
                    nums[r] = temp;
                    break;
                }
            }
        }

        int end = nums.length - 1;
        r++;
        while (r < end) {
            int temp = nums[end];
            nums[end] = nums[r];
            nums[r] = temp;
            r++;
            end--;
        }
    }
}
