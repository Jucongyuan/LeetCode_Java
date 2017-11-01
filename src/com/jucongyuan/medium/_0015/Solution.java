package com.jucongyuan.medium._0015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        if (nums.length < 3)
            return ret;
        Arrays.sort(nums);
        int l;
        int r;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            l = i + 1;
            r = nums.length - 1;
            while (l < r) {
                int t = nums[i] + nums[l] + nums[r];
                if (t == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    ret.add(list);
                    while (l < r && nums[l] == nums[l + 1])
                        l++;
                    while (l < r && nums[r] == nums[r - 1])
                        r--;
                    l++;
                    r--;
                } else if (t > 0) {
                    while (l < r && nums[r] == nums[r - 1])
                        r--;
                    r--;
                } else {
                    while (l < r && nums[l] == nums[l + 1])
                        l++;
                    l++;
                }
            }
        }
        return ret;
    }
}
