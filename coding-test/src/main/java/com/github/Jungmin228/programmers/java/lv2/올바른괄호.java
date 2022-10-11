package com.github.Jungmin228.programmers.java.lv2;

public class 올바른괄호 {
    class Solution {
        boolean solution(String s) {
            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    count++;
                } else {
                    count--;
                }
                if (count < 0) {
                    return false;
                }
            }

            return count == 0;
        }
    }
}
