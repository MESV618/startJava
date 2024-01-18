public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");
        boolean isMale = true;
        if (!isMale) {
            System.out.println("\tnot a male");
        } else {
            System.out.println("\tmale");
        }

        byte age = 24;
        if (age > 18) {
            System.out.println("\tgreater than 18 years of age");
        } else {
            System.out.println("\tless than or equal to 18 years of age");
        }

        float heightMeters = 1.92f;
        if (heightMeters < 1.8) {
            System.out.println("\tless than 180 cm of height");
        } else {
            System.out.println("\tgreater than or equal to 180 cm of height");
        }

        char firstLetterName = "Sam".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("\t'M' is the first letter of the name");
        } else if (firstLetterName == 'I') {
            System.out.println("\t'I' is the first letter of the name");
        } else {
            System.out.println("\t'" + firstLetterName + "' " + "is the first letter of the name");
        }

        System.out.println("\n2. Поиск большего числа");
        int a = 511;
        int b = 195;

        if (a < b) {
            System.out.println("\t" + a + " < " + b);
        } else if (a > b) {
            System.out.println("\t" + a + " > " + b);
        } else {
            System.out.println("\t" + a + " = " + b);
        }

        System.out.println("\n3. Проверка числа");
        int c = 256;
        System.out.print("\t" + c + " является ");

        if (c != 0) {
            if (c < 0) {
                System.out.print("отрицательным");
            } else {
                System.out.print("положительным");
            }

            System.out.print(" и ");

            if (c % 2 == 0) {
                System.out.println("четным");
            } else {
                System.out.println("нечетным");
            }
        } else {
            System.out.println("нулём");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int d = 321;
        int dHundreds = d / 100;
        int dTens = d / 10 % 10;
        int dOnes = d % 10;

        int e = 123;
        int eHundreds = e / 100;
        int eTens = e / 10 % 10;
        int eOnes = e % 10;

        boolean hasEqualHundreds = dHundreds == eHundreds;
        boolean hasEqualTens = dTens == eTens;
        boolean hasEqualOnes = dOnes == eOnes;
        boolean hasEqualPosition = hasEqualHundreds || hasEqualTens || hasEqualOnes;

        if (hasEqualPosition) {
            System.out.println("\td = " + d + "; e = " + e);

            if (hasEqualHundreds) {
                System.out.println("\tв 3 разряде одинаковая цифра = " + dHundreds);
            }
            if (hasEqualTens) {
                System.out.println("\tво 2 разряде одинаковая цифра = " + dTens);
            }
            if (hasEqualOnes) {
                System.out.println("\tв 1 разряде одинаковая цифра = " + dOnes);
            }
        } else {
            System.out.println("\tравных разрядов нет");
        }

        System.out.println("\n5. Определение символа по его коду");
        char uppercaseW = '\u0057';
        System.out.print("\tсимвол " + uppercaseW + " является ");

        if (uppercaseW >= 'a' && uppercaseW <= 'z') {
            System.out.println("маленькой буквой");
        } else if (uppercaseW >= 'A' && uppercaseW <= 'Z') {
            System.out.println("большой буквой");
        } else if (uppercaseW >= '0' && uppercaseW <= '9') {
            System.out.println("цифрой");
        } else {
            System.out.println("не буквой и не цифрой");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        float depositAmount = 301_000f;
        float interestRate;
        float interestAmount;
        System.out.println("\tсумма вклада = " + depositAmount);

        if (depositAmount < 100_000) {
            interestRate = 0.05f;
        } else if (100_000 <= depositAmount && depositAmount <= 300_000) {
            interestRate = 0.07f;
        } else {
            interestRate = 0.1f;
        }

        interestAmount = depositAmount * interestRate;
        depositAmount += interestAmount;
        System.out.println("\tсумма начисленных процентов = " + interestAmount + "\n" +
                "\tитоговая сумма = " + depositAmount);

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int programmingPercent = 92;
        int historyGrade = convertToGrade(historyPercent);
        int programmingGrade = convertToGrade(programmingPercent);

        System.out.println("\tистория " + historyGrade + "\n" +
                "\tпрограммирование " + programmingGrade + "\n" +
                "\tсредний балл = " + ((float) (historyGrade + programmingGrade) / 2) + "\n" +
                "\tсредний процент = " + ((float) (historyPercent + programmingPercent) / 2));

        System.out.println("\n8. Расчет годовой прибыли");
        float monthlySalesAmount = 13_000f;
        float monthlyRentalPrice = 5_000f;
        float monthlyProductionCost = 9_000f;
        float annualProfit = (monthlySalesAmount - monthlyRentalPrice - monthlyProductionCost) * 12;

        System.out.print("\tПрибыль за год: ");
        if (annualProfit > 0) {
            System.out.print("+");
        }
        System.out.print(annualProfit + " руб.");
    }

    static int convertToGrade (int percent) {
        if (percent <= 60) {
            return 2;
        } else if (60 < percent && percent <= 73) {
            return 3;
        } else if (73 < percent && percent <= 91) {
            return 4;
        } else {
            return 5;
        }
    }
}