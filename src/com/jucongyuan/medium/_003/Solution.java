package com.jucongyuan.medium._003;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null)
            return 0;
        int start = 0;
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c) && map.get(c) >= start)
                start = map.get(c) + 1;
            else
                maxLength = Math.max(maxLength, i - start + 1);
            map.put(c, i);
        }
        return maxLength;
    }
}
