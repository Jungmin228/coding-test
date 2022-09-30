package com.github.Jungmin228.programmers.java.lv2;

import java.util.Arrays;

public class 구명보트 {
    class Solution {
        public int solution(int[] people, int limit) {
            int boat = 0;
            int length = 0;
            int min = 0;
            int max = people.length - 1;

            Arrays.sort(people);

            while (true) {
                if (min > max) {
                    break;
                } else if (min == max) {
                    boat++;
                    break;
                } else if (people[min] + people[max] <= limit) {
                    min++;
                }
                max--;
                boat++;
                length++;
            }

            return boat;
        }
    }
}
