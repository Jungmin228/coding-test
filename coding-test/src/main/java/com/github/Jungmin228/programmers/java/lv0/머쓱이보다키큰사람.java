package com.github.Jungmin228.programmers.java.lv0;

public class 머쓱이보다키큰사람 {
    class Solution {
        public int solution(int[] array, int height) {
            int count = 0;

            for (int i : array) {
                if (height < i) {
                    count++;
                }
            }

            return count;
        }
    }
}
