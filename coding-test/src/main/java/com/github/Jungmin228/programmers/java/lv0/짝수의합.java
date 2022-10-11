package com.github.Jungmin228.programmers.java.lv0;

public class 짝수의합 {
    class Solution {
        public int solution(int n) {
            int result = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    result += i;
                }
            }
            return result;
        }
    }
}
