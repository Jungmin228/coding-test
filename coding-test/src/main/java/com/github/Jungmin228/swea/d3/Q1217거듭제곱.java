package com.github.Jungmin228.swea.d3;

import java.util.Scanner;

public class Q1217거듭제곱 {
    class Solution {
        public /*static*/ void main(String args[]) throws Exception {
            Scanner sc = new Scanner(System.in);

            for (int test_case = 1; test_case <= 10; test_case++) {
                int num = sc.nextInt();
                int n = sc.nextInt();
                int m = sc.nextInt();

                System.out.printf("#%d %d\n", num, reculsive(n, m));
            }
        }

        /*static*/ int reculsive(int n, int m) {
            if (m <= 1) {
                return n;
            } else {
                return reculsive(n, m - 1) * n;
            }
        }
    }

}
