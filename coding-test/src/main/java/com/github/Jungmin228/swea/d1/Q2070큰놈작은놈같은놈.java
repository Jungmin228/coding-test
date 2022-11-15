package com.github.Jungmin228.swea.d1;

import java.util.Scanner;

public class Q2070큰놈작은놈같은놈 {
    class Solution {
        public /*static*/ void main(String args[]) throws Exception {
            Scanner sc = new Scanner(System.in);
            int T;
            T=sc.nextInt();

            for(int test_case = 1; test_case <= T; test_case++)
            {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                char result;

                if (n1 < n2) {
                    result = '<';
                } else if (n1 > n2) {
                    result = '>';
                } else {
                    result = '=';
                }

                System.out.printf("#%d %c\n", test_case, result);
            }
        }
    }
}
