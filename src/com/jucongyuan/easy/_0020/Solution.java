package com.jucongyuan.easy._0020;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        char[] cs = s.toCharArray();
        for (char c : cs) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (!isMatch((char) stack.pop(), c)) {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }


    private boolean isMatch(char left, char right) {
        if (left == '(') {
            if (right == ')') {
                return true;
            } else {
                return false;
            }
        } else if (left == '[') {
            if (right == ']') {
                return true;
            } else {
                return false;
            }
        } else if (left == '{') {
            if (right == '}') {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }


}
