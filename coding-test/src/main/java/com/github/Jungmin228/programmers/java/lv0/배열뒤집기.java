package com.github.Jungmin228.programmers.java.lv0;

public class 배열뒤집기 {
    class Solution {
        public int[] solution(int[] num_list) {
            int[] result = new int[num_list.length];

            for (int i = 0; i < num_list.length; i++) {
                result[num_list.length - i - 1] = num_list[i];
            }

            return result;
        }
    }
}
