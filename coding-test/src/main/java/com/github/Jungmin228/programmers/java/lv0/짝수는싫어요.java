package com.github.Jungmin228.programmers.java.lv0;

public class 짝수는싫어요 {
    class Solution {
        public int[] solution(int n) {
            int[] result = (n % 2 == 0) ? new int[n / 2] : new int[n / 2 + 1];

            for (int i = 0; i < result.length; i++) {
                result[i] = 2 * i + 1;
            }

            return result;
        }
    }
}
