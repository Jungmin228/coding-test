package com.github.Jungmin228.programmers.java.lv1;

public class 하샤드수 {
    class Solution {
        public boolean solution(int x) {
            String s = String.valueOf(x);

            int sum = s.chars().sum() - s.length() * '0';

            if (x % sum == 0)
                return true;

            return false;
        }
    }
}
