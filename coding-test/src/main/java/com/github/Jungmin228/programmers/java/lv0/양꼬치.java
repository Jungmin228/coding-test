package com.github.Jungmin228.programmers.java.lv0;

public class 양꼬치 {
    class Solution {
        public int solution(int n, int k) {
            int result = n * 12000 + k * 2000;

            if (n / 10 > 0) {
                return result - (n / 10) * 2000;
            }

            return result;
        }
    }
    class Solution2 {
        public int solution(int n, int k) {
            int result = n * 12000 + k * 2000;

            return result - (n / 10) * 2000;
        }
    }
}
