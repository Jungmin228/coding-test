package com.github.Jungmin228.swea.d1;

import java.util.Scanner;

public class Q2058자릿수더하기 {
    class Solution {
        public /*static*/ void main(String args[]) throws Exception {
            Scanner sc = new Scanner(System.in);
            int T;
            T = sc.nextInt();

            int sum = 0;
            while (T > 9) {
                sum += T % 10;
                T /= 10;
            }
            sum += T;
            System.out.println(sum);
        }
    }
}
