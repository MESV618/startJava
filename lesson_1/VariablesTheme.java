public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Вывод характеристик компьютера");
        byte cpuCoreNumber = 6;
        System.out.println("\tnumber of cores inside a central processing unit = " + cpuCoreNumber);

        short ramGb = 16;
        System.out.println("\trandom access memory = " + ramGb + "gb");

        int operatingSystemBitness = 64;
        System.out.println("\toperating system bitness = " + operatingSystemBitness + "-bit");

        long ssdGb = 500;
        System.out.println("\tsolid-state drive capacity = " + ssdGb + "gb");

        float cpuClockSpeedGhz = 3.3f;
        System.out.println("\tcentral processing unit clock speed = " + cpuClockSpeedGhz + "Ghz");

        double gpuCoreClockSpeedMhz = 400;
        System.out.println("\tgraphics processor unit core clock speed = " + gpuCoreClockSpeedMhz +
                "Mhz");

        char cpuTdp = 'H';
        System.out.println("\tcentral processing unit thermal design power = " + cpuTdp);

        boolean hasBluetooth = true;
        System.out.println("\tcomputer has the bluetooth option = " + hasBluetooth);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        float penPriceRub = 100f;
        float bookPriceRub = 200f;
        float discountRate = 11f;
        float sumPriceRub = penPriceRub + bookPriceRub;
        float discountRub = sumPriceRub / 100 * discountRate;
        System.out.println("\tобщая стоимость товаров без скидки = " + sumPriceRub + " RUB");
        System.out.println("\tсумма скидки = " + discountRub + " RUB");
        System.out.println("\tсумма товаров со скидкой = " + (sumPriceRub - discountRub) + " RUB");

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("\t   J    a  v     v  a\n" +
                "\t   J   a a  v   v  a a\n" +
                "\tJ  J  aaaaa  V V  aaaaa\n" +
                "\t JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte byteMaxValue = Byte.MAX_VALUE;
        System.out.println("\tbyteMaxValue = " + byteMaxValue);
        System.out.println("\t++byteMaxValue = " + ++byteMaxValue);
        System.out.println("\t--byteMaxValue = " + --byteMaxValue);

        short shortMaxValue = Short.MAX_VALUE;
        System.out.println("\n\tshortMaxValue = " + shortMaxValue);
        System.out.println("\t++shortMaxValue = " + ++shortMaxValue);
        System.out.println("\t--shortMaxValue = " + --shortMaxValue);

        int intMaxValue = Integer.MAX_VALUE;
        System.out.println("\n\tintMaxValue = " + intMaxValue);
        System.out.println("\t++intMaxValue = " + ++intMaxValue);
        System.out.println("\t--intMaxValue = " + --intMaxValue);

        long longMaxValue = Long.MAX_VALUE;
        System.out.println("\n\tlongMaxValue = " + longMaxValue);
        System.out.println("\t++longMaxValue = " + ++longMaxValue);
        System.out.println("\t--longMaxValue = " + --longMaxValue);

        System.out.println("\n5. Перестановка значений переменных");
        int aNum = 2;
        int bNum = 5;
        int cNum;

        System.out.println("\tперестановка с помощью третьей переменной");
        System.out.println("\taNum = " + aNum + "; bNum = " + bNum);
        cNum = aNum;
        aNum = bNum;
        bNum = cNum;
        System.out.println("\taNum = " + aNum + "; bNum = " + bNum);

        System.out.println("\n\tперестановка с помощью арифметических операций");
        System.out.println("\taNum = " + aNum + "; bNum = " + bNum);
        aNum = aNum + bNum - (bNum = aNum);
        System.out.println("\taNum = " + aNum + "; bNum = " + bNum);

        System.out.println("\n\tперестановка с помощью побитовой операции ^");
        System.out.println("\taNum = " + aNum + "; bNum = " + bNum);
        aNum = aNum ^ bNum;
        bNum = bNum ^ aNum;
        aNum = aNum ^ bNum;
        System.out.println("\taNum = " + aNum + "; bNum = " + bNum);

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
                "\t  " + slash + underscore + leftParenthesis + " " + rightParenthesis + backslash +
                "\n" +
                "\t " + slash + "      " + backslash + "\n" +
                "\t" + slash + underscore + underscore + underscore + underscore + slash +
                backslash + underscore + underscore + backslash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int numberHundreds = number / 100;
        int numberTens = number % 100 / 10;
        int numberUnits = number % 10 / 1;
        System.out.println("\tЧисло " + number + " содержит:" + "\n" +
                "\t  сотен - " + numberHundreds + "\n" +
                "\t  десятков - " + numberTens + "\n" +
                "\t  единиц - " + numberUnits + "\n" +
                "\tСумма его цифр = " + (numberHundreds + numberTens + numberUnits) + "\n" +
                "\tПроизведение = " + (numberHundreds * numberTens * numberUnits));

        System.out.println("\n9. Вывод времени");
        int seconds = 86399;
        int hours = seconds / 3600;
        int remainderSeconds = seconds % 3600;
        int minutes = remainderSeconds / 60;
        seconds = remainderSeconds % 60;
        System.out.println("\t" + hours + ":" + minutes + ":" + seconds);
    }
}