package com.github.Jungmin228.programmers.java.lv0;

public class 문자열뒤집기 {
    class Solution {
        public String solution(String my_string) {
            StringBuilder builder = new StringBuilder(my_string);

            return builder.reverse().toString();
        }
    }
}
