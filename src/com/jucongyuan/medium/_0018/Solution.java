package com.jucongyuan.medium._0018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4)
            return result;
        Arrays.sort(nums);
        int s, e;
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = nums.length - 1; j > i + 2; j--) {
                if (j < nums.length - 1 && nums[j] == nums[j + 1])
                    continue;
                s = i + 1;
                e = j - 1;
                while (s < e) {
                    int sum = nums[i] + nums[j] + nums[s] + nums[e];
                    if (sum == target) {
                        List<Integer> list = new ArrayList<>(4);
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[s]);
                        list.add(nums[e]);
                        result.add(list);
                        while (s < e && nums[s] == nums[s + 1])
                            s++;
                        while (s < e && nums[e] == nums[e - 1])
                            e--;
                        s++;
                        e--;
                    } else if (sum < target)
                        s++;
                    else
                        e--;
                }
            }
        }
        return result;
    }
}
