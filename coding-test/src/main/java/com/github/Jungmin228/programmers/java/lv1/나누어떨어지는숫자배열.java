package com.github.Jungmin228.programmers.java.lv1;

import java.util.Arrays;

public class 나누어떨어지는숫자배열 {
    class Solution {
        public int[] solution(int[] arr, int divisor) {
            int[] result = Arrays.stream(arr).filter(x -> x % divisor == 0).toArray();

            Arrays.sort(result);

            if (result.length == 0) {
                return new int[] {-1};
            }

            return result;
        }
    }
}
