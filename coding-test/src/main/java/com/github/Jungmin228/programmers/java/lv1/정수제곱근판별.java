package com.github.Jungmin228.programmers.java.lv1;

public class 정수제곱근판별 {
    class Solution {
        public long solution(long n) {
            Double sqrt = Math.sqrt(n);

            if (sqrt == sqrt.intValue()) {
                return (long) Math.pow(sqrt + 1, 2);
            } else
                return -1;
        }
    }
}
