package com.github.Jungmin228.swea.d1;

import java.util.Scanner;

public class Q2050알파벳을숫자로변환 {
    class Solution
    {
        public /*static*/ void main(String args[]) throws Exception
        {
            Scanner sc = new Scanner(System.in);
            String input = sc.next();

            for (int i = 0; i < input.length(); i++) {
                System.out.print(input.charAt(i) - 64 + " ");
            }
        }
    }
}
