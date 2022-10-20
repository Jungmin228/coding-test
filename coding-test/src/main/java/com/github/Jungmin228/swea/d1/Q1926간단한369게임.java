package com.github.Jungmin228.swea.d1;

import java.util.Scanner;

public class Q1926간단한369게임 {
    class Solution
    {
        public /*static*/ void main(String args[]) throws Exception
        {
            Scanner sc = new Scanner(System.in);
            int T;
            T=sc.nextInt();

            for(int test_case = 1; test_case <= T; test_case++)
            {
                String n = String.valueOf(test_case);
                StringBuilder result = new StringBuilder();

                for (int i = 0; i < n.length(); i++) {
                    if (n.charAt(i) == '3' || n.charAt(i) == '6' || n.charAt(i) == '9') {
                        result.append("-");
                    }
                }

                if (result.length() >= 1) {
                    System.out.print(result.append(" "));
                } else {
                    System.out.print(n + " ");
                }
            }
        }
    }
}
