package com.github.Jungmin228.programmers.java.lv0;

public class 자릿수더하기 {
    class Solution {
        public int solution(int n) {
            int result = 0;

            while (n > 9) {
                result += n % 10;
                n /= 10;
            }

            return result += n;
        }
    }
}
