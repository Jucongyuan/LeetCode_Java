package com.jucongyuan.easy._0014;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        if (strs.length == 1)
            return strs[0];
        int minLength = Math.min(strs[0].length(), strs[1].length());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < minLength; i++) {
            if (strs[0].charAt(i) == strs[1].charAt(i)) {
                result.append(strs[0].charAt(i));
                continue;
            }
            break;
        }
        for (int i = 2; i < strs.length; i++) {
            if (strs[i] == null || strs[i].length() == 0)
                return "";
            if (strs[i].startsWith(result.toString()))
                continue;
            if (strs[i].length() < result.length()) {
                result.replace(strs[i].length(), result.length(), "");
            }
            minLength = result.length();
            for (int j = 0; j < minLength; j++) {
                if (result.charAt(j) != strs[i].charAt(j)) {
                    result.replace(j, result.length(), "");
                    break;
                }
            }
        }
        return result.toString();
    }
}
