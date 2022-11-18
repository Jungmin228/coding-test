package com.github.Jungmin228.swea.d2;

import java.util.Scanner;

public class Q1986지그재그숫자 {
    class Solution
    {
        public /*static*/ void main(String args[]) throws Exception
        {
            Scanner sc = new Scanner(System.in);
            int T;
            T=sc.nextInt();

            for(int test_case = 1; test_case <= T; test_case++)
            {
                int num = sc.nextInt();
                int sum = 0;

                for (int i = 1; i <= num; i++) {
                    sum = i % 2 == 0 ? sum - i : sum + i;
                }

                System.out.println("#" + test_case + " " + sum);
            }
        }
    }
}
