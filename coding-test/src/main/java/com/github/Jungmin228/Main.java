package com.github.Jungmin228;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
