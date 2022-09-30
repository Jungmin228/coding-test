package com.github.Jungmin228.programmers.java;

public class 홀수와짝수 {
    class Solution {
        public String solution(int num) {
            String answer = "";

            if (num % 2 == 0)
                answer = "Even";
            else
                answer = "Odd";

            return answer;
        }
    }
}
