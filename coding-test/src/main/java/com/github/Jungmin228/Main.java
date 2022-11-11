package com.github.Jungmin228;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 0; test_case <= T; test_case++) {
            System.out.print((int) Math.pow(2, test_case) + " ");
        }
    }
}
