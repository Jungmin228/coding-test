package com.github.Jungmin228.programmers.java;

public class 자릿수더하기 {

    public class Solution {
        public int solution(int n) {
            int answer = 0;

            while (n >= 10) {
                answer += n % 10;
                n /= 10;
            }
            answer += n;

            return answer;
        }
    }
}
