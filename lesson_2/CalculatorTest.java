import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer = "yes";

        while (answer.equals("yes")) {
            System.out.println("\nВведите первое число: ");
            int a = scanner.nextInt();
            calculator.setA(a);

            System.out.println("Введите знак математической операции: ");
            char sign = scanner.next().charAt(0);
            calculator.setSign(sign);

            System.out.println("Введите второе число: ");
            int b = scanner.nextInt();
            calculator.setB(b);

            System.out.println(a + " " + sign + " " + b + " = " + calculator.calculate());

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next();
            } while (!(answer.equals("yes") || answer.equals("no")));
        }
    }
}