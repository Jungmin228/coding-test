package com.github.Jungmin228;

import com.github.Jungmin228.programmers.java.lv2.올바른괄호;

public class Main {
    public static void main(String[] args) {
        올바른괄호 bracket = new 올바른괄호();

        System.out.println(bracket.solution("()()"));
        System.out.println(bracket.solution("(())()"));
        System.out.println(bracket.solution(")()("));
        System.out.println(bracket.solution("(()("));

    }
}
