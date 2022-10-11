package com.github.Jungmin228.programmers.java.lv1;

import java.util.Arrays;

public class 서울에서김서방찾기 {
    class Solution {
        public String solution(String[] seoul) {
            String result = "김서방은 ";

            for (int i = 0; i < seoul.length; i++) {
                if (seoul[i].equals("Kim")) {
                    result += i;
                    break;
                }
            }

            return result + "에 있다";
        }
    }
    class Solution2 {
        public String solution(String[] seoul) {
            int pos = Arrays.asList(seoul).indexOf("Kim");

            return "김서방은 " + pos + "에 있다";
        }
    }
}
