package com.github.Jungmin228.programmers.java.lv0;

public class 중복된숫자개수 {
    class Solution {
        public int solution(int[] array, int n) {
            int count = 0;
            for (int num : array) {
                if (num == n) {
                    count++;
                }
            }
            return count;
        }
    }
}
