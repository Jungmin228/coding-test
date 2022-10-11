package com.github.Jungmin228.programmers.java.lv1;

public class 두정수사이의합 {
    class Solution {
        public long solution(int a, int b) {
            long result = 0;

            if (a == b) {
                return a;
            }

            if (absEqual(a, b)) {
                return 0;
            }

            if (b - a < 0) {
                for (int i = b; i <= a; i++) {
                    result += i;
                }
            }

            if (b - a > 0) {
                for (int i = a; i <= b; i++) {
                    result += i;
                }
            }

            return result;
        }

        private boolean absEqual(int a, int b) {
            return Math.abs(a) == Math.abs(b);
        }
    }

    class Solution2 {
        public long solution(int a, int b) {
            int max = Math.max(a, b);
            int min = Math.min(a, b);

            return (long) (max - min + 1) * (min + max) / 2;
        }
    }
}
