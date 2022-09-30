package com.github.Jungmin228.programmers.java.lv1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class 정수내림차순으배치하기 {
    class Solution {
        public long solution(long n) {
            String s = String.valueOf(n);

            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < s.length(); i++) {
                list.add((int) s.charAt(i) - '0');
            }
            list.sort(Comparator.reverseOrder());

            long answer = 0;
            for (int i = list.size(); i>0; i--) {
                answer += list.get(list.size()-i) * Math.pow(10, i-1);
            }

            return answer;
        }
    }
}
