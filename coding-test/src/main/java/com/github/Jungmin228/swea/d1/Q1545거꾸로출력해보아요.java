package com.github.Jungmin228.swea.d1;

import java.util.Scanner;

class Q1545거꾸로출력해보아요 {
    class Solution {
        public /*static*/ void main(String args[]) throws Exception {
            Scanner sc = new Scanner(System.in);
            int T;
            T = sc.nextInt();

            for (int test_case = T; test_case >= 0; test_case--) {
                System.out.print(test_case + " ");
            }
        }
    }
}