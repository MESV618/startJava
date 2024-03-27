package com.startjava.lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int startRange = -10;
        int endRange = 21;
        int sumEven = 0;
        int sumOdd = 0;
        int counter = startRange;

        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
        } while (++counter <= endRange);

        System.out.println("\tВ отрезке [" + startRange + ", " + endRange + "] " +
                "сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;

        endRange = a;

        if (b > endRange) {
            endRange = b;
        }

        if (c > endRange) {
            endRange = c;
        }

        startRange = a;

        if (b < startRange) {
            startRange = b;
        }

        if (c < startRange) {
            startRange = c;
        }

        System.out.print("\t");
        for (int i = --endRange; startRange < i; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int originNum = 1234;
        int sumDigits = 0;

        System.out.print("\tчисло в обратном порядке = ");

        while (originNum != 0) {
            int digit = originNum % 10;
            sumDigits += digit;
            System.out.print(digit);
            originNum /= 10;
        }

        System.out.println("\n\tсумма цифр числа = " + sumDigits);

        System.out.println("\n4. Вывод чисел в несколько строк");
        startRange = 1;
        endRange = 24;
        counter = 0;

        for (int i = startRange; i < endRange; i++) {
            if (i % 2 == 1) {
                System.out.printf("%5s", i);

                counter++;

                if (counter % 5 == 0) {
                    System.out.println();
                }
            }
        }

        if (counter % 5 != 0) {
            for (int i = 1; i <= 5 - counter % 5; i++) {
                System.out.printf("%5s", 0);
            }

            System.out.println();
        }

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность");
        originNum = 3_242_592;
        counter = 1;
        int countTwos = 0;

        System.out.print("\tВ " + originNum + " ");

        while (originNum != 0) {
            int digit = originNum % 10;

            if (digit == 2) {
                countTwos++;
            }

            originNum /= 10;
        }

        if (countTwos % 2 == 0) {
            System.out.println("четное количество двоек - " + countTwos);
        } else {
            System.out.println("нечетное количество двоек - " + countTwos);
        }

        System.out.println("\n6. Отображение геометрических фигур");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        int symbolsInRow = 5;
        while (symbolsInRow > 0) {
            int countSymbols = 0;
            while (countSymbols < symbolsInRow) {
                System.out.print("#");
                countSymbols++;
            }
            System.out.println();
            symbolsInRow--;
        }

        System.out.println();

        symbolsInRow = 1;
        boolean hasPeak = false;
        do {
            int countSymbols = 0;

            do {
                System.out.print("$");
            } while (++countSymbols < symbolsInRow);

            if (symbolsInRow == 3) {
                hasPeak = true;
            }

            symbolsInRow = hasPeak ? --symbolsInRow : ++symbolsInRow;

            System.out.println();
        } while (symbolsInRow > 0);

        System.out.println("\n7. Отображение ASCII-символов");
        startRange = 15;
        endRange = 122;

        System.out.printf("%-10s%-12s%-20s%n", "DECIMAL", "CHARACTER ", "DESCRIPTION ");

        for (int i = startRange; i <= endRange; i++) {
            boolean isSuitable = i % 2 == 1 && i < 48 || i % 2 == 0 && i < 123 && 96 < i;

            if (isSuitable) {
                System.out.printf("%5d %9c            %-19s%n", i, i, Character.getName(i));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        originNum = 1234321;
        int reversedNum = 0;
        int num = originNum;

        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        if (originNum == reversedNum) {
            System.out.println("\tчисло " + originNum + " является палиндромом");
        } else {
            System.out.println("\tчисло " + originNum + " не является палиндромом");
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        originNum = 658937;
        int leftHalf = originNum / 1000;
        int rightHalf = originNum % 1000;
        int sumLeftHalf = 0;
        num = leftHalf;
        sumDigits = 0;
        counter = 0;

        while (num > 0) {
            sumDigits += num % 10;
            num /= 10;
            counter++;
            if (counter == 3) {
                sumLeftHalf = sumDigits;
                sumDigits = 0;
                num = rightHalf;
            }
        }

        int sumRightHalf = sumDigits;

        System.out.print("\tЧисло " + originNum);
        if (sumLeftHalf == sumRightHalf) {
            System.out.println(" является счастливым");
        } else {
            System.out.println(" не является счастливым");
        }
        System.out.printf("\tСумма цифр %03d = %d, а сумма %03d = %d\n", leftHalf, sumLeftHalf, rightHalf, sumRightHalf);

        System.out.println("\n10. Отображение таблицы умножения Пифагора");
        int size = 9;

        System.out.print("   |");

        for (int i = 2; i <= size; i++) {
            System.out.printf("%4d", i);
        }

        System.out.println("\n------------------------------------");

        for (int i = 2;  i <= size; i++) {
            System.out.printf("%2d |", i);
            for (int j = 2; j <= size; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
