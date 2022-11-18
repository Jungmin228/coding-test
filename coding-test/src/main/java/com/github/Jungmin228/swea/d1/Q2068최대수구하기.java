package com.github.Jungmin228.swea.d1;

import java.util.Arrays;
import java.util.Scanner;

public class Q2068최대수구하기 {
    class Solution {
        public /*static*/ void main(String args[]) throws Exception {
            Scanner sc = new Scanner(System.in);
            int T;
            T=sc.nextInt();


            for(int test_case = 1; test_case <= T; test_case++)
            {
                int[] arr = new int[10];

                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                }

                Arrays.sort(arr);
                System.out.printf("#%d %d\n", test_case, arr[arr.length - 1]);
            }
        }
    }
}
