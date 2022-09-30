package com.github.Jungmin228.programmers.java;

public class 나머지가1이되는수찾기 {
    class Solution {
        public int solution(int n) {
            for (int i = 1; i < n; i++) {
                if (n % i == 1) {
                    return i;
                }
            }
            return 0;
        }
    }
}
