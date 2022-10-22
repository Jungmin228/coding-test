package com.github.Jungmin228.programmers.java.lv0;

import java.util.Arrays;

public class 배열두배만들기 {
    class Solution {
        public int[] solution(int[] numbers) {
            return Arrays.stream(numbers).map(x -> x * 2).toArray();
        }
    }
}
