package com.jucongyuan.medium._0008;

public class Solution {
    public int myAtoi(String str) {
        if (str == null || str.length() == 0)
            return 0;
        str = str.trim();

        char flag = '+';
        int index = 0;

        if (str.charAt(0) == '+')
            index++;
        else if (str.charAt(0) == '-') {
            flag = '-';
            index++;
        }

        double result = 0;

        while (index < str.length() && str.charAt(index) >= '0' && str.charAt(index) <= '9') {
            result = result * 10 + (str.charAt(index) - '0');
            index++;
        }

        if (flag == '-')
            result = -result;

        if (result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        else if (result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;


        return (int) result;

    }
}