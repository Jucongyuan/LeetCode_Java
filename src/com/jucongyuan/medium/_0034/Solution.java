package com.jucongyuan.medium._0034;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ret = {-1, -1};
        if (nums.length == 0) {
            return ret;
        }
        int start = 0;
        int end = nums.length - 1;
        int mid = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                start = mid;
                while (start >= 0 && nums[start] == target) {
                    ret[0] = start;
                    start--;
                }
                end = mid;
                while (end < nums.length && nums[end] == target) {
                    ret[1] = end;
                    end++;
                }
                return ret;
            }
            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ret;
    }
}
