package com.github.Jungmin228.swea.d3;

import java.util.Scanner;

public class Q1236824시간 {
    class Solution
    {
        public /*static*/ void main(String args[]) throws Exception
        {
            Scanner sc = new Scanner(System.in);
            int T;
            T=sc.nextInt();

            for(int test_case = 1; test_case <= T; test_case++)
            {
                int hour = sc.nextInt();
                int time = sc.nextInt();
                int result = hour + time;
                result = result >= 24 ? result - 24 : result;

                System.out.printf("#%d %d\n", test_case, result);
            }
        }
    }

}
