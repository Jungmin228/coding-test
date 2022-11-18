package com.github.Jungmin228.swea.d1;

import java.util.Arrays;
import java.util.Scanner;

public class Q2063중간값찾기 {
    class Solution {
        public /*static*/ void main(String args[]) throws Exception {
            Scanner sc = new Scanner(System.in);
            int T;
            T=sc.nextInt();

            int[] arr = new int[T];
            for(int test_case = 1; test_case < T; test_case++)
            {
                arr[test_case] = sc.nextInt();
            }

            Arrays.sort(arr);

            System.out.printf("%d\n", arr[arr.length / 2]);
        }
    }

}
