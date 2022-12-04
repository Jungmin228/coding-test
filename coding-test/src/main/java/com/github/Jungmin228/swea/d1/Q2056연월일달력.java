package com.github.Jungmin228.swea.d1;

import java.util.Scanner;

public class Q2056연월일달력 {
    class Solution
    {
        public /*static*/ void main(String args[]) throws Exception
        {
            Scanner sc = new Scanner(System.in);
            int T;
            T=sc.nextInt();
            int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

            for(int test_case = 1; test_case <= T; test_case++)
            {
                String input = sc.next();
                String yearS = input.substring(0, 4);
                String monthS = input.substring(4, 6);
                String dayS = input.substring(6);

                int monthI = Integer.parseInt(monthS);
                int dayI = Integer.parseInt(dayS);

                if (monthI <= 0 || monthI > days.length || dayI < 1 || dayI > days[monthI-1]) {
                    System.out.println("#" + test_case + " -1");
                    continue;
                }

                System.out.println("#" + test_case + " " + yearS + "/" + monthS + "/" + dayS);
            }
        }
    }
}
