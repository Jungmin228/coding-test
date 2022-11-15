package com.github.Jungmin228;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            char result;

            if (n1 < n2) {
                result = '<';
            } else if (n1 > n2) {
                result = '>';
            } else {
                result = '=';
            }

            System.out.printf("#%d %c\n", test_case, result);
        }
    }
}
