package com.github.Jungmin228.swea.d3;

import java.util.Scanner;

public class Q15612체스판위의룩배치 {
    class Solution {
        public /*static*/ void main(String args[]) throws Exception {
            Scanner sc = new Scanner(System.in);
            int T;
            T=sc.nextInt();


            for(int test_case = 1; test_case <= T; test_case++)
            {
                int[] rook = new int[8];
                boolean success = true;

                for (int i = 0; i < rook.length; i++) {
                    int count = 0;
                    String input = sc.next();

                    for (int j = 0; j < input.length(); j++) {
                        if (input.charAt(j) == 'O') {
                            count++;
                            rook[i] = j;
                        }
                        if (count > 1) {
                            success = false;
                        }
                    }
                }

                if (!success) {
                    System.out.printf("#%d no\n", test_case);
                    continue;
                }

                for (int i = 0; i < rook.length; i++) {
                    for (int j = i + 1; j < 8; j++) {
                        if (rook[i] == rook[j]) {
                            success = false;
                        }
                    }
                }

                if (success) {
                    System.out.printf("#%d yes\n", test_case);
                } else {
                    System.out.printf("#%d no\n", test_case);
                }
            }
        }
    }

}
