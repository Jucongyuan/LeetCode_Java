package com.jucongyuan.easy._0009;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        if (x < 10)
            return true;

        int base = 1;
        while (x / base >= 10)
            base *= 10;
        while (x > 0) {
            int left = x / base;
            int right = x % 10;

            if (left != right)
                return false;

            x = (x % base) / 10;
            base /= 100;
        }
        return true;
    }
}
