package com.github.Jungmin228.programmers.java.lv0;

public class 세균증식 {
    class Solution {
        public int solution(int n, int t) {
            int result = n;

            for (int i = 0; i < t; i++) {
                result *= 2;
            }

            return result;
        }
    }
}
