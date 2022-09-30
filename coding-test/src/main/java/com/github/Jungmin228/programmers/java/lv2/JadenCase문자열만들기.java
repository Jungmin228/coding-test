package com.github.Jungmin228.programmers.java.lv2;

public class JadenCase문자열만들기 {
//    #1 런타임 에러
//    class Solution {
//        public String solution(String s) {
//            String answer = "";
//            String lower = s.toLowerCase();
//
//            String[] list = lower.split(" ");
//
//            for (String str : list) {
//                str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
//                answer += str + " ";
//            }
//
//            answer = answer.trim();
//
//            return answer;
//        }
//    }

//    #2
    class Solution {
        public String solution(String s) {
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == ' ') {
                    builder.append(c);
                } else if (i == 0) {
                    builder.append(Character.toUpperCase(c));
                } else if (s.charAt(i - 1) == ' ') {
                    builder.append(Character.toUpperCase(c));
                } else {
                    builder.append(Character.toLowerCase(c));
                }
            }

            return builder.toString();
        }
    }
}
