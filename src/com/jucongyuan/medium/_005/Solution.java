package com.jucongyuan.medium._005;

class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        StringBuilder sb = new StringBuilder("$");
        for (char c : s.toCharArray()) {
            sb.append("#").append(c);
        }
        sb.append("#");
        char[] ss = sb.toString().toCharArray();
        int[] p = new int[ss.length];
        int id = 0;
        int idMax = 0;
        int retIndex = 0;
        int retMax = 0;
        for (int i = 1; i < ss.length; i++) {
            int j = 2 * id - i;
            p[i] = 1;
            if (i < idMax) {
                if (p[j] < idMax - i) {
                    p[i] = p[j];
                } else {
                    p[i] = idMax - i;
                }
            }
            while (i + p[i] < ss.length && ss[p[i] + i] == ss[i - p[i]]) {
                p[i]++;
            }
            if (i + p[i] > idMax) {
                idMax = i + p[i];
                id = i;
            }
            if (p[i] > retMax) {
                retMax = p[i];
                retIndex = i;
            }
        }
        return s.substring((retIndex - retMax) / 2, (retIndex + retMax) / 2 - 1);
    }
}
