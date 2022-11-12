package com.github.Jungmin228.swea.d1;

import java.util.Scanner;

public class Q2071평균값구하기 {
    class Solution
    {
        public /*static*/ void main(String args[]) throws Exception
        {
            Scanner sc = new Scanner(System.in);
            int T;
            T=sc.nextInt();

            for(int test_case = 0; test_case < T; test_case++)
            {
                double sum = 0;
                for (int i = 0; i < 10; i++)
                {
                    sum += sc.nextDouble();
                }
                System.out.printf("#%d %d\n", test_case + 1, Math.round(sum / 10));
            }
        }
    }
}
