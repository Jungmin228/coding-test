package com.github.Jungmin228.programmers.java.lv1;

public class 제일작은수제거하기 {
    class Solution {
        public int[] solution(int[] arr) {
            if (arr.length == 1) {
                int[] result = new int[1];
                result[0] = -1;
                return result;
                // return new int[] {-1};
            }

            int minIdx = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[minIdx] >= arr[i]) {
                    minIdx = i;
                }
            }

            int[] result = new int[arr.length-1];
            for (int i = 0; i < minIdx; i++) {
                result[i] = arr[i];
            }
            //System.arraycopy(arr, 0, result, 0, minIdx);
            for (int j = minIdx + 1; j < arr.length; j++) {
                result[j-1] = arr[j];
            }
            //if (arr.length - (minIdx + 1) >= 0)
            //                System.arraycopy(arr, minIdx + 1, result, minIdx + 1 - 1, arr.length - (minIdx + 1));

            return result;
        }
    }
}
