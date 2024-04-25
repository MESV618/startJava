package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private char sign;
    private int a;
    private int b;

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int calculate() {
        switch (sign) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '^':
                int result = 1;
                for (int i = b; i > 0; i--) {
                    result *= a;
                }
                return result;
            case '%':
                return a % b;
            default:
                System.out.println("Знак не распознан, операция не поддерживается");
                return 0;
        }
    }
}