package com.github.Jungmin228.swea.d1;

import java.util.Scanner;

public class Q19361대1가위바위보 {
    class Solution {
        public /*static*/ void main(String args[]) throws Exception {
            Scanner sc = new Scanner(System.in);
            int T1, T2;
            T1 = sc.nextInt();
            T2 = sc.nextInt();

            switch (T1 - T2) {
                case 1: case -2:
                    System.out.println("A");
                    break;
                case -1: case 2:
                    System.out.println("B");
                    break;
            }
        }
    }
}
