package com.jucongyuan.medium._0012;

public class Solution {
    public String intToRoman(int num) {
        int r;
        StringBuilder stringBuilder = new StringBuilder();
        int i = 1;
        while (num > 0) {
            r = num % 10;
            num = num / 10;
            stringBuilder.insert(0, makeStr(r, i));
            i++;
        }
        return stringBuilder.toString();
    }

    private String makeStr(int n, int which) {

        if (n == 0) {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();

        String s1 = "";
        String s2 = "";
        String s3 = "";

        switch (which) {
            case 1:
                s1 = "I";
                s2 = "V";
                s3 = "X";
                break;
            case 2:
                s1 = "X";
                s2 = "L";
                s3 = "C";
                break;
            case 3:
                s1 = "C";
                s2 = "D";
                s3 = "M";
                break;
            case 4:
                s1 = "M";
                break;
        }
        if (n <= 3) {
            while (n > 0) {
                stringBuilder.append(s1);
                n--;
            }
        } else if (n == 4) {
            stringBuilder.append(s1).append(s2);
        } else if (n <= 8) {
            stringBuilder.append(s2);
            while (n > 5) {
                stringBuilder.append(s1);
                n--;
            }
        } else if (n == 9) {
            stringBuilder.append(s1).append(s3);
        }
        return stringBuilder.toString();

    }

}
