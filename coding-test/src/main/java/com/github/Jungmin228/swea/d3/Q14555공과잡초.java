package com.github.Jungmin228.swea.d3;

import java.util.Scanner;

public class Q14555공과잡초 {
    class Solution {
        public /*static*/ void main(String args[]) throws Exception {
            Scanner sc = new Scanner(System.in);
            int T;
            T = sc.nextInt();

            for (int test_case = 1; test_case <= T; test_case++) {
                int count = 0;
                String grassland = sc.next().replace(".", "");

                for (int i = 0; i < grassland.length(); i++) {
                    if (grassland.charAt(i) == '(') {
                        if (grassland.charAt(i + 1) == ')' || grassland.charAt(i + 1) == '|') {
                            count++;
                        }
                    } else if (grassland.charAt(i) == ')') {
                        if (grassland.charAt(i - 1) == '|') {
                            count++;
                        }
                    }
                }
                System.out.printf("#%d %d\n", test_case, count);
            }
            sc.close();
        }
    }
}
