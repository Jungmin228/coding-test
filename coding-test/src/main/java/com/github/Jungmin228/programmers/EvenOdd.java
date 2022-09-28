package com.github.Jungmin228.programmers;

public class EvenOdd {
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
