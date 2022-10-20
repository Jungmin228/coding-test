package com.github.Jungmin228.programmers.java.lv1;

public class 음양더하기 {
    class Solution {
        public int solution(int[] absolutes, boolean[] signs) {
            int result = 0;

            for (int i = 0; i < absolutes.length; i++) {
                if (signs[i]) {
                    result += absolutes[i];
                } else {
                    result -= absolutes[i];
                }
            }

            return result;
        }
    }

    class Solution2 {
        public int solution(int[] absolutes, boolean[] signs) {
            int result = 0;

            for (int i = 0; i < absolutes.length; i++) {
                result += signs[i] ? absolutes[i] : -absolutes[i];
            }

            return result;
        }
    }
}
