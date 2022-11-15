package com.github.Jungmin228.swea.d2;

import java.util.Scanner;

public class Q1284수도요금경쟁 {
    class Solution {
        public /*static*/ void main(String args[]) throws Exception {
            Scanner sc = new Scanner(System.in);
            int T;
            T=sc.nextInt();

            for(int test_case = 1; test_case <= T; test_case++)
            {
                int P = sc.nextInt();
                int Q = sc.nextInt();
                int R = sc.nextInt();
                int S = sc.nextInt();
                int W = sc.nextInt();

                int A = P * W;
                int B = W <= R ? Q : Q + S * (W - R);
                int result;

                if (A < B) {
                    result = A;
                } else {
                    result = B;
                }

                System.out.printf("#%d %d\n", test_case, result);
            }
        }
    }
}
