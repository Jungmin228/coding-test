package com.github.Jungmin228.swea.d1;

import java.util.Scanner;

public class Q2025N줄덧셈 {
    class Solution {
        public /*static*/ void main(String args[]) throws Exception {
            Scanner sc = new Scanner(System.in);
            int T;
            T = sc.nextInt();
            int sum = 0;

            for (int i = 1; i <= T; i++) {
                sum += i;
            }
            // System.out.println((T * (T + 1)) / 2);

            System.out.println(sum);
        }
    }
}
