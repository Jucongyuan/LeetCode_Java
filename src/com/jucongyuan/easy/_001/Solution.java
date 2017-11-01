package com.jucongyuan.easy._001;

import java.util.HashMap;
import java.util.Map;


public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        if(nums.length < 2)
            return ret;
        int d = 0;
        Map<Integer, Integer> m = new HashMap();
        for(int i= 0; i < nums.length; i++){
            d = target - nums[i];
            if(m.get(d) != null){
                ret[0] = m.get(d);
                ret[1] = i;
                break;
            }else {
                m.put(nums[i], i);
            }
        }
        return ret;
    }
}
