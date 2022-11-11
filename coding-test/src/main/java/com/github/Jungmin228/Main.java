package com.github.Jungmin228;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
