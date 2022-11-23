package com.github.Jungmin228.swea.d3;

import java.util.Scanner;

public class Q4406모음이보이지않는사람 {
    class Solution {
        public /*static*/ void main(String args[]) throws Exception {
            Scanner sc = new Scanner(System.in);
            int T;
            T = sc.nextInt();

            for (int test_case = 1; test_case <= T; test_case++) {
                String word = sc.next();

                word = word.replace("a", "")
                           .replace("e", "")
                           .replace("i", "")
                           .replace("o", "")
                           .replace("u", "");

                System.out.printf("#%d %s\n", test_case, word);
            }
        }
    }

}
