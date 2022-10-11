package com.github.Jungmin228.programmers.java.lv1;

public class 핸드폰번호가리기 {
    class Solution {
        public String solution(String phone_number) {
            String prev = phone_number.substring(phone_number.length() - 4);
            String star = "*";

            return star.repeat(phone_number.length() - 4) + prev;
        }
    }
}
