package com.github.Jungmin228.programmers.java.lv0;

import java.util.Arrays;

public class 최댓값만들기_1 {
    class Solution {
        public int solution(int[] numbers) {
            Arrays.sort(numbers);

            return numbers[numbers.length - 1] * numbers[numbers.length - 2];
        }
    }
}
