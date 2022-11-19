package com.github.Jungmin228.swea.d3;

import java.util.Scanner;

public class Q10505소득불균형 {
    class Solution {
        public /*static*/ void main(String args[]) throws Exception {
            Scanner sc = new Scanner(System.in);
            int T;
            T = sc.nextInt();

            for (int test_case = 1; test_case <= T; test_case++) {
                int people = sc.nextInt();
                int[] incomes = new int[people];
                int sum = 0;

                for (int i = 0; i < people; i++) {
                    incomes[i] = sc.nextInt();
                    sum += incomes[i];
                }

                int avg = sum / people;
                int count = 0;

                for (int i = 0; i < people; i++) {
                    if (incomes[i] <= avg) {
                        count++;
                    }
                }

                System.out.printf("#%d %d\n", test_case, count);
            }
        }
    }
}
