package com.github.Jungmin228.programmers.java.lv0;

public class 각도기 {
    class Solution {
        public int solution(int angle) {
            if (angle < 90) {
                return 1;
            }
            if (angle == 90) {
                return 2;
            }
            if (angle < 180) {
                return 3;
            }
            return 4;
        }
    }
}
