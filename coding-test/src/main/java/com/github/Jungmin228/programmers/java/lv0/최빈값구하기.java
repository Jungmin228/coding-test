package com.github.Jungmin228.programmers.java.lv0;

import java.util.*;

public class 최빈값구하기 {
    class Solution {
        public int solution(int[] array) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i< array.length; i++) {
                if (map.containsKey(array[i])) {
                    map.replace(array[i], map.get(array[i]) + 1);
                } else{
                    map.put(array[i], 1);
                }
            }

            Optional<Integer> max = map.values().stream().max(Comparator.naturalOrder());

            int idx = 0;
            int count = 0;
            for (int k : map.keySet()) {
                if (Objects.equals(map.get(k), max.get())) {
                    idx = k;
                    count++;
                }
            }

            return count > 1 ? -1 : idx;
        }
    }
}
