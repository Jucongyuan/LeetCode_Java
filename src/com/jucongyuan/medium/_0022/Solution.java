package com.jucongyuan.medium._0022;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        if (n == 0)
            return ret;
        generateParenthesis(ret, "", n, n);
        return ret;
    }

    private void generateParenthesis(List<String> ret, String s, int l, int r) {
        if (l > r)
            return;
        if (l == r && l == 0) {
            ret.add(s);
            return;
        }
        if (l > 0)
            generateParenthesis(ret, s + "(", l - 1, r);
        if (r > 0)
            generateParenthesis(ret, s + ")", l, r - 1);
    }

}
