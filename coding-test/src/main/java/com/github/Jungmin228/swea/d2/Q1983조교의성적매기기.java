package com.github.Jungmin228.swea.d2;

import java.util.Scanner;

public class Q1983조교의성적매기기 {
    class Solution {
        public /*static*/ void main(String args[]) throws Exception {
            Scanner sc = new Scanner(System.in);
            int T;
            T = sc.nextInt();

            String[] scores = { "A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0" };

            for (int test_case = 1; test_case <= T; test_case++) {
                int studentNum = sc.nextInt();
                int who = sc.nextInt() - 1;
                int[] students = new int[studentNum];

                for (int i = 0; i < studentNum; i++) {
                    int mid = sc.nextInt();
                    int fin = sc.nextInt();
                    int hw = sc.nextInt();

                    students[i] = mid * 35 + fin * 45 + hw * 20;
                }

                int rank = 1;
                for (int j = 0; j < studentNum; j++) {
                    if (students[who] < students[j]) {
                        rank++;
                    }
                }
                rank = rank * 100 / studentNum;

                int score = rank % 10 == 0 ? rank / 10 - 1 : rank / 10;
                System.out.printf("#%d %s\n", test_case, scores[score]);
            }
        }
    }
}

