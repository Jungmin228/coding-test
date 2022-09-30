package com.github.Jungmin228.programmers.java.lv1;

public class x만큼간격이있는n개의숫자 {
    class Solution {
        public long[] solution(int x, int n) {
            long[] answer = new long[n];
            long step = x;

            for (int i = 0; i < n; i++) {
                answer[i] = step;
                step += x;
            }

            return answer;
        }
    }
}
