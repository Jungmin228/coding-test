package com.github.Jungmin228.swea.d3;

import java.util.Scanner;

public class Q13218조별과제 {
    class Solution
    {
        public /*static*/ void main(String args[]) throws Exception
        {
            Scanner sc = new Scanner(System.in);
            int T;
            T=sc.nextInt();

            for(int test_case = 1; test_case <= T; test_case++)
            {
                int student = sc.nextInt();
                System.out.printf("#%d %d\n", test_case, student / 3);
            }
        }
    }

}
