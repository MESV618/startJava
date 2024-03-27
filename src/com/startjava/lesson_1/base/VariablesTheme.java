package com.startjava.lesson_1.base;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Вывод характеристик компьютера");
        byte cpuCoreNumber = 6;
        System.out.println("\tnumber of cores inside a central processing unit = " + cpuCoreNumber);

        short ramGb = 16;
        System.out.println("\trandom access memory = " + ramGb + "gb");

        int osBitness = 64;
        System.out.println("\toperating system bitness = " + osBitness + "-bit");

        long ssdGb = 500;
        System.out.println("\tsolid-state drive capacity = " + ssdGb + "gb");

        float cpuClockSpeedGhz = 3.3f;
        System.out.println("\tcentral processing unit clock speed = " + cpuClockSpeedGhz + "Ghz");

        double gpuCoreClockSpeedMhz = 400;
        System.out.println("\tgraphics processor unit core clock speed = " +
                gpuCoreClockSpeedMhz + "Mhz");

        char cpuTdp = 'H';
        System.out.println("\tcentral processing unit thermal design power = " + cpuTdp);

        boolean hasBluetooth = true;
        System.out.println("\tcomputer has the bluetooth option = " + hasBluetooth);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        float penPrice = 100f;
        float bookPrice = 200f;
        float discountRate = 11f;
        float sumPrice = penPrice + bookPrice;
        float discountPrice = sumPrice / 100 * discountRate;
        System.out.println("\tобщая стоимость товаров без скидки = " + sumPrice + " RUB");
        System.out.println("\tсумма скидки = " + discountPrice + " RUB");
        System.out.println("\tсумма товаров со скидкой = " + (sumPrice - discountPrice) + " RUB");

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("\t   J    a  v     v  a\n" +
                "\t   J   a a  v   v  a a\n" +
                "\tJ  J  aaaaa  V V  aaaaa\n" +
                "\t JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("\tmaxByte = " + maxByte);
        System.out.println("\t++maxByte = " + ++maxByte);
        System.out.println("\t--maxByte = " + --maxByte);

        short maxShort = Short.MAX_VALUE;
        System.out.println("\n\tmaxShort = " + maxShort);
        System.out.println("\t++maxShort = " + ++maxShort);
        System.out.println("\t--maxShort = " + --maxShort);

        int maxInt = Integer.MAX_VALUE;
        System.out.println("\n\tmaxInt = " + maxInt);
        System.out.println("\t++maxInt = " + ++maxInt);
        System.out.println("\t--maxInt = " + --maxInt);

        long maxLong = Long.MAX_VALUE;
        System.out.println("\n\tmaxLong = " + maxLong);
        System.out.println("\t++maxLong = " + ++maxLong);
        System.out.println("\t--maxLong = " + --maxLong);

        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        int tmp = a;

        System.out.println("\tперестановка с помощью третьей переменной");
        System.out.println("\ta = " + a + "; b = " + b);
        a = b;
        b = tmp;
        System.out.println("\ta = " + a + "; b = " + b);

        System.out.println("\n\tперестановка с помощью арифметических операций");
        System.out.println("\ta = " + a + "; b = " + b);
        a = a + b - (b = a);
        System.out.println("\ta = " + a + "; b = " + b);

        System.out.println("\n\tперестановка с помощью побитовой операции ^");
        System.out.println("\ta = " + a + "; b = " + b);
        a ^= b;
        a ^= (b ^= a);
        System.out.println("\ta = " + a + "; b = " + b);

        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        System.out.println("\tкод = " + (int) dollar + "; символ = " + dollar);

        char asterisk = '*';
        System.out.println("\tкод = " + (int) asterisk + "; символ = " + asterisk);

        char atSign = '@';
        System.out.println("\tкод = " + (int) atSign + "; символ = " + atSign);

        char verticalBar = '|';
        System.out.println("\tкод = " + (int) verticalBar + "; символ = " + verticalBar);

        char tilde = '~';
        System.out.println("\tкод = " + (int) tilde + "; символ = " + tilde);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        char underscore = '_';
        System.out.println("\t    " + slash + backslash + "\n" +
                "\t   " + slash + "  " + backslash + "\n" +
                "\t  " + slash + underscore + leftParenthesis + " " +
                rightParenthesis + backslash + "\n" +
                "\t " + slash + "      " + backslash + "\n" +
                "\t" + slash + underscore + underscore + underscore + underscore + slash +
                backslash + underscore + underscore + backslash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int numberHundreds = number / 100;
        int numberTens = number / 10 % 10;
        int numberOnes = number % 10;
        System.out.println("\tЧисло " + number + " содержит:" + "\n" +
                "\t  сотен - " + numberHundreds + "\n" +
                "\t  десятков - " + numberTens + "\n" +
                "\t  единиц - " + numberOnes + "\n" +
                "\tСумма его цифр = " + (numberHundreds + numberTens + numberOnes) + "\n" +
                "\tПроизведение = " + (numberHundreds * numberTens * numberOnes));

        System.out.println("\n9. Вывод времени");
        int seconds = 86399;
        int hours = seconds / 3600;
        int minutes = seconds / 60 % 60;
        seconds = seconds % 60;
        System.out.println("\t" + hours + ":" + minutes + ":" + seconds);
    }
}