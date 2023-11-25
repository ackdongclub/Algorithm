package org.example;

public class Recursion_Function {

    public static void main(String[] args) {

    }

    //팩토리얼 연습
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
