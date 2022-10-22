package com.github.Jungmin228.programmers.java.lv0;

import java.util.Arrays;

public class 중앙값구하기 {
    class Solution {
        public int solution(int[] array) {
            Arrays.sort(array);

            return array[array.length / 2];
        }
    }
}
