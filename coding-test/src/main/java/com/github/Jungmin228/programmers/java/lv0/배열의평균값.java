package com.github.Jungmin228.programmers.java.lv0;

public class 배열의평균값 {
    class Solution {
        public double solution(int[] numbers) {
            double answer = 0;

            for (int num : numbers) {
                answer += num;
            }

            return answer / (numbers.length);
        }
    }
}
