package com.github.Jungmin228.programmers.java.lv1;

public class 평균구하기 {
    class Solution {
        public double solution(int[] arr) {
            double answer = 0;

            for (int n : arr) {
                answer += n;
            }
            answer /= arr.length;
            return answer;
        }
    }
}
