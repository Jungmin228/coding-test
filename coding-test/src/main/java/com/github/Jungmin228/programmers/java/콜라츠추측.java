package com.github.Jungmin228.programmers.java;

public class 콜라츠추측 {
    class Solution {
        public int solution(int num) {
            int count = 0;
            long n = num;

            if (n == 1) {
                return count;
            }

            while (count < 500) {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = n * 3 + 1;
                }
                count++;

                if (n == 1) {
                    return count;
                }
            }

            return -1;
        }
    }
}
