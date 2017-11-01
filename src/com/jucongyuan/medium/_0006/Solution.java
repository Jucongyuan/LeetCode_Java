package com.jucongyuan.medium._0006;

public class Solution {
    public String convert(String s, int numRows) {
        if (s == null || s.length() == 0 || numRows == 0)
            return "";
        if (numRows == 1 || s.length() == 1)
            return s;
        StringBuilder stringBuilder = new StringBuilder();
        int maxSpace = 2 * numRows - 2;
        int currentSpace = maxSpace;
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += maxSpace) {
                stringBuilder.append(s.charAt(j));
                if (i > 0 && i < numRows - 1) {
                    if (j + currentSpace < s.length())
                        stringBuilder.append(s.charAt(j + currentSpace));
                }
            }
            currentSpace -= 2;
        }
        return stringBuilder.toString();
    }
}
