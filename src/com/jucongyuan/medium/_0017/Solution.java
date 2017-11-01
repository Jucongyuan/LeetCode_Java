package com.jucongyuan.medium._0017;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ret = new ArrayList<>();
        if (digits == null || digits.length() == 0)
            return ret;
        Map<Character, char[]> map = new HashMap<>();
        map.put('2', new char[]{'a', 'b', 'c'});
        map.put('3', new char[]{'d', 'e', 'f'});
        map.put('4', new char[]{'g', 'h', 'i'});
        map.put('5', new char[]{'j', 'k', 'l'});
        map.put('6', new char[]{'m', 'n', 'o'});
        map.put('7', new char[]{'p', 'q', 'r', 's'});
        map.put('8', new char[]{'t', 'u', 'v'});
        map.put('9', new char[]{'w', 'x', 'y', 'z'});
        letterCombinations(new StringBuilder(), 0, ret, digits, map);
        return ret;
    }

    private void letterCombinations(StringBuilder sb, int index, List<String> ret, String digits, Map<Character, char[]> map) {
        if (index == digits.length()) {
            ret.add(sb.toString());
            return;
        }
        char c = digits.charAt(index);
        char[] chars = map.get(c);
        for (int i = 0; i < chars.length; i++) {
            sb.append(chars[i]);
            letterCombinations(sb, index + 1, ret, digits, map);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

}
