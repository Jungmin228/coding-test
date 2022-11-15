package com.github.Jungmin228.swea.d3;

import java.util.Scanner;

public class Q15230알파벳공부 {
    class Solution {
        public /*static*/ void main(String args[]) throws Exception {
            Scanner sc = new Scanner(System.in);
            int T;
            T=sc.nextInt();


            for(int test_case = 1; test_case <= T; test_case++)
            {
                int count = 0;
                String line = sc.next();
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) - i == 97) {
                        count++;
                        continue;
                    }
                    break;
                }

                System.out.printf("#%d %d\n", test_case, count);
            }
        }
    }
}
