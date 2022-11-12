package com.github.Jungmin228.swea.d1;

import java.util.Scanner;

public class Q1933간단한N의약수 {
    class Solution {
        public /*static*/ void main(String args[]) throws Exception {
            Scanner sc = new Scanner(System.in);
            int T;
            T = sc.nextInt();

            for (int i = 1; i <= T; i++) {
                if (T % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
