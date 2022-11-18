package com.github.Jungmin228.swea.d3;

import java.util.Scanner;

public class Q14692통나무자르기 {
    class Solution {
        public /*static*/ void main(String args[]) throws Exception {
            Scanner sc = new Scanner(System.in);
            int T;
            T = sc.nextInt();

            for (int test_case = 1; test_case <= T; test_case++) {
                int tree = sc.nextInt();
                String win;

                if (tree % 2 == 0) {
                    win = "Alice";
                } else {
                    win = "Bob";
                }

                System.out.printf("#%d %s\n", test_case, win);
            }
        }
    }
}
