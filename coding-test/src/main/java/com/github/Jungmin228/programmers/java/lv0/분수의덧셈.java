package com.github.Jungmin228.programmers.java.lv0;

public class 분수의덧셈 {
    class Solution {
        public int[] solution(int denum1, int num1, int denum2, int num2) {
            int de = denum1 * num2 + denum2 * num1;
            int n = num1 * num2;

            int gcd = gcd(de, n);

            int[] result = new int[2];
            result[0] = de / gcd;
            result[1] = n / gcd;

            return result;
        }

        private int gcd(int a, int b) {
            if(a % b == 0) {
                return b;
            }
            return gcd(b, a % b);
        }
    }

    // 첫 답안(오답)
    // 변수(de, n, num1, num2) 잘못 작성함
    class Solution2 {
        public int[] solution(int denum1, int num1, int denum2, int num2) {
            int de = denum1 * num2 + denum2 + num1;
            int n = num1 * num2;

            int min = Math.min(num1, num2);
            int gcd = 1;

            for (int i = 1; i <= min; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    gcd = i;
                }
            }

            int[] result = new int[2];
            result[0] = de / gcd;
            result[1] = n / gcd;

            return result;
        }
    }

    // 수정 답안
    // class Solution {
//     public int[] solution(int denum1, int num1, int denum2, int num2) {
//         int[] result = new int[2];
//         // 분모의 최소공배수를 구한다.
//         result[0] = denum1*num2 + denum2*num1;
//         result[1] = num1*num2;
//         int min = (result[0] > result[1])? result[0]: result[1];
//         int gcd = 0;
//         for (int i = 1; i <= min; i++) {
//             if (result[0] % i == 0 && result[1] % i == 0)
//                 gcd = i;
//         }
//         result[0] = result[0]/gcd;
//         result[1] = result[1]/gcd;

    //         return result;
//     }
// }
    class Solution3 {
        public int[] solution(int denum1, int num1, int denum2, int num2) {
            int de = denum1 * num2 + denum2 * num1;
            int n = num1 * num2;

            int min = Math.min(de, n);
            int gcd = 1;

            for (int i = 1; i <= min; i++) {
                if (de % i == 0 && n % i == 0) {
                    gcd = i;
                }
            }

            int[] result = new int[2];
            result[0] = de / gcd;
            result[1] = n / gcd;

            return result;
        }
    }
}
