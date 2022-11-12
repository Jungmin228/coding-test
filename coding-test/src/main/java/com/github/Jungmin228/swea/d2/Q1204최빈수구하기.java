package com.github.Jungmin228.swea.d2;

import java.util.Scanner;

public class Q1204최빈수구하기 {
    class Solution
    {
        public /*static*/ void main(String args[]) throws Exception
        {
            Scanner sc = new Scanner(System.in);
            int T=sc.nextInt();

            for(int test_case = 0; test_case < T; test_case++)
            {
                int n = sc.nextInt();
                int[][] arr = new int[T][101];

                for (int student = 0; student < 1000; student++) {
                    int score = sc.nextInt();
                    arr[test_case][score]++;
                }

                int max = 0;
                int result = 0;
                for (int i = 0; i < 101; i++) {
                    if (max < arr[test_case][i]) {
                        max = arr[test_case][i];
                        result = i;
                    } else if (max == arr[test_case][i]) {
                        result = result <= i ? i : result;
                    }
                }
                System.out.printf("#%d %d\n", n, result);
            }
        }
    }
}
