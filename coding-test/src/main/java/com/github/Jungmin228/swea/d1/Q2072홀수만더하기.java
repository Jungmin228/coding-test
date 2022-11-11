package com.github.Jungmin228.swea.d1;

import java.util.Scanner;

public class Q2072홀수만더하기 {
    class Solution {
        public /*static*/ void main(String args[]) throws Exception {
            Scanner sc = new Scanner(System.in);
            int T;
            T = sc.nextInt();

            for (int test_case = 1; test_case <= T; test_case++) {
                int result = 0;

                for (int i = 0; i < 10; i++) {
                    int n = sc.nextInt();

                    if (n % 2 == 1) {
                        result += n;
                    }
                }
                System.out.printf("#%d %d\n", test_case, result);
            }
        }
    }
}
