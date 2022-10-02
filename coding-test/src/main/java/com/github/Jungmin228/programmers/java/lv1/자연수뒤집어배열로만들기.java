package com.github.Jungmin228.programmers.java.lv1;

public class 자연수뒤집어배열로만들기 {
    class Solution {
        public int[] solution(long n) {
            String number = String.valueOf(n);
            int size = number.length();
            int[] answer = new int[size];

            for (int i = 0; i < size; i++) {
                answer[i] = number.charAt(size-(i+1)) - '0';
            }

            return answer;
        }
    }
}
