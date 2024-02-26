import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("\nВведите первое число: ");
            int a = scanner.nextInt();

            System.out.println("Введите знак математической операции: ");
            char sign = scanner.next().charAt(0);

            System.out.println("Введите второе число: ");
            int b = scanner.nextInt();

            calculator.setA(a);
            calculator.setB(b);
            calculator.setSign(sign);

            System.out.println(a + " " + sign + " " + b + " = " + calculator.calculate());

            String answer;
            while (true) {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next();
                if (answer.equals("yes")) {
                    break;
                } else if (answer.equals("no")) {
                    return;
                }
            }
        }
    }
}