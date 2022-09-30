package com.github.Jungmin228.programmers.java.lv0;

public class 아이스아메리카노 {
    class Solution {
        public int[] solution(int money) {
            int[] answer = new int[2];
            int americano = 5500;

            answer[0] = money / americano;
            answer[1] = money % americano;

            return answer;
        }
    }
}
