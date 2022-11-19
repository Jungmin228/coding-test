package com.github.Jungmin228.swea.d3;

import java.util.Scanner;

public class Q3431준환이의운동관리 {
    class Solution
    {
        public /*static*/ void main(String args[]) throws Exception
        {
            Scanner sc = new Scanner(System.in);
            int T;
            T=sc.nextInt();

            for(int test_case = 1; test_case <= T; test_case++)
            {
                int L = sc.nextInt();
                int U = sc.nextInt();
                int X = sc.nextInt();
                int result;

                if (X < L) {
                    result = L - X;
                } else if (X <= U) {
                    result = 0;
                } else {
                    result = -1;
                }

                System.out.printf("#%d %d\n",test_case, result);
            }
        }
    }
}
