package com.github.Jungmin228.programmers.java.lv2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class 최댓값최솟값 {
    class Solution {
        public String solution(String s) {
            String[] arr = s.split(" ");
            List<Integer> list = new ArrayList<>();

            for (String str : arr) {
                list.add(Integer.parseInt(str));
            }

            list.sort(Comparator.naturalOrder());

            return list.get(0) + " " + list.get(list.size() - 1);
        }
    }
}
