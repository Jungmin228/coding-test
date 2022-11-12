package com.github.Jungmin228.swea.d1;

import java.util.Scanner;

public class Q2019더블더블 {
    class Solution {
        public /*static*/ void main(String args[]) throws Exception {
            Scanner sc = new Scanner(System.in);
            int T;
            T=sc.nextInt();

            for (int test_case = 0; test_case <= T; test_case++) {
                System.out.print((int) Math.pow(2, test_case) + " ");
            }
        }
    }
}
