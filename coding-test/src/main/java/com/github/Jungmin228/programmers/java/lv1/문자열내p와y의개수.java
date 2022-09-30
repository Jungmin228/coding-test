package com.github.Jungmin228.programmers.java.lv1;

public class 문자열내p와y의개수 {
    class Solution {
        boolean solution(String s) {
            s = s.toLowerCase();
            long p = s.chars().filter(c -> c == 'p').count();
            long y = s.chars().filter(c -> c == 'y').count();

            if (p == y) {
                return true;
            }

            return false;
        }
    }
}
