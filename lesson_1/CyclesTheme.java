public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int startRange = -10;
        int endRange = 21;
        int sumEven = 0;
        int sumOdd = 0;
        int i = startRange;

        do {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        } while (++i <= endRange);

        System.out.println("\tВ отрезке [" + startRange + ", " + endRange + "] " +
                "сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;

        if (a < b & a < c) {
            startRange = a;
        } else if (b < a & c < a) {
            endRange = a;
        }

        if (b < a & b < c) {
            startRange = b;
        } else if (a < b & c < b) {
            endRange = b;
        }

        if (c < a & c < b) {
            startRange = c;
        } else if (a < c & b < c) {
            endRange = c;
        }

        System.out.print("\t");
        for (int j = --endRange; startRange < j; j--) {
            System.out.print(j + " ");
        }
        System.out.println();

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        a = 1234;
        i = 1;
        int digit = 1;
        int sumDigit = 0;

        System.out.print("\tчисло в обратном порядке = ");

        while (true) {
            digit = a / i % 10;

            if (a / i < 1) {
                break;
            }

            System.out.print(digit);

            sumDigit += digit;
            i *= 10;
        }

        System.out.println("\n\tсумма цифр числа = " + sumDigit);

        System.out.println("\n4. Вывод чисел в несколько строк");
        startRange = 1;
        endRange = 24;
        i = 0;

        for (int j = startRange; j < endRange; j++) {
            if (j % 2 == 1) {
                System.out.printf("%10s", j);

                i++;

                if (i % 5 == 0) {
                    System.out.println();
                }
            }
        }

        if (i % 5 != 0) {
            for (int j = 1; j <= 5 - i % 5; j++) {
                System.out.printf("%10s", 0);
            }

            System.out.println();
        }

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность");
        a = 3_242_592;
        i = 1;
        int countDigit = 0;

        System.out.print("\tВ " + a + " ");

        while (true) {
            digit = a / i % 10;

            if (a / i < 1) {
                if (countDigit % 2 == 0) {
                    System.out.println("четное количество двоек - " + countDigit);
                } else {
                    System.out.println("нечетное количество двоек - " + countDigit);
                }
                break;
            } else if (digit == 2) {
                countDigit++;
            }

            i *= 10;
        }

        System.out.println("\n6. Отображение геометрических фигур");
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 10; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        int t = 5;
        while (t > 0) {
            int l = 0;
            while (l < t) {
                System.out.print("#");
                l++;
            }
            System.out.println();
            t--;
        }

        System.out.println();

        i = 1;
        do {
            int j = 0;
            do {
                System.out.print("$");
                j++;
            } while (j < i);
            System.out.println();
            i++;
        } while (i <= 3);
        i = 2;
        do {
            int j = 0;
            do {
                System.out.print("$");
                j++;
            } while (j < i);
            System.out.println();
            i--;
        } while (i >= 1);

        System.out.println("\n7. Отображение ASCII-символов");
        startRange = 15;
        endRange = 122;
        char unknownChar;

        System.out.printf("%-10s%-12s%-20s%n", "DECIMAL", "CHARACTER ", "DESCRIPTION ");

        for (int j = startRange; j <= endRange; j++) {
            if (j % 2 == 1 & j < 48 | j % 2 == 0 & j < 123 & 96 < j) {
                unknownChar = (char) j;
                System.out.printf("%5d %9c            %-19s%n", j, unknownChar,
                        Character.getName(unknownChar));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        a = 1234321;

        if (isPalindrome(a)) {
            System.out.println("\tчисло " + a + " является палиндромом");
        } else {
            System.out.println("\tчисло " + a + " не является палиндромом");
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        a = 658937;

        int firstHalf = a / 1000;
        int secondHalf = a % 1000;

        int sumFirstHalf = sumDigits(firstHalf);
        int sumSecondHalf = sumDigits(secondHalf);

        System.out.print("\tЧисло " + a);
        if (sumFirstHalf == sumSecondHalf) {
            System.out.println(" является счастливым");
        } else {
            System.out.println(" не является счастливым");
        }
        System.out.printf("\tСумма цифр %03d = %d, а сумма %03d = %d\n", firstHalf, sumFirstHalf, secondHalf, sumSecondHalf);

        System.out.println("\n10. Отображение таблицы умножения Пифагора");
        int size = 9;

        System.out.print("   |");

        for (int j = 2; j <= size; j++) {
            System.out.printf("%4d", j);
        }

        System.out.println("\n------------------------------------");

        for (int j = 2;  j <= size; j++) {
            System.out.printf("%2d |", j);
            for (int k = 2; k <= size; k++) {
                System.out.printf("%4d", j * k);
            }
            System.out.println();
        }
    }

    private static boolean isPalindrome(int num) {
        int reversed = 0;
        int original = num;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }

    private static int sumDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
