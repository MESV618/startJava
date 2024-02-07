public class Calculator {
    public static void main(String[] args) {
        char sign = '%';
        int a = 14;
        int b = 5;
        int result = 1;

        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = a / b;
        } else if (sign == '^') {
            for (int i = b; i > 0; i--) {
                result *= a;
            }
        } else if (sign == '%') {
            result = a % b;
        }

        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}