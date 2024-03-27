package com.startjava.lesson_1.base;

import java.util.Locale;

public class VariableNamesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Разные переменные");
        // цифра
        byte digit = 3;
        System.out.println("\tцифра = " + digit);

        // сумма чисел
        int sumNumbers = 5_875_126 + 19_690;
        System.out.println("\tсумма чисел = " + String.format(Locale.US, "%,d", sumNumbers));

        // произведение цифр
        byte sumDigits = 9 * 9;
        System.out.println("\tпроизведение цифр = " + sumDigits);

        // максимальное число
        long maxNumber = Long.MAX_VALUE;
        System.out.println("\tмаксимальное число = " + String.format(Locale.US, "%,d", maxNumber));

        // количество десятков
        byte numberTens = 58 / 10;
        System.out.println("\tколичество десятков = " + numberTens);

        // вес собаки
        float dogWeight = 12.55f;
        System.out.println("\tвес собаки = " + dogWeight);

        // исходное число
        short originalNumber = 91;
        System.out.println("\tисходное число = " + originalNumber);

        // процент по вкладу
        float depositInterest = 4f;
        System.out.println("\tпроцент по вкладу = " + depositInterest);

        // (переменная хранит символ) &
        char ampersand = '&';
        System.out.println("\tсимвол = " + ampersand);

        // код ошибки
        int errorCode = 20807;
        System.out.println("\tкод ошибки = " + errorCode);

        // тип сообщения
        byte messageType = 1;
        System.out.println("\tтип сообщения = " + messageType);

        // число нулей
        byte zeroesNumber = 4;
        System.out.println("\tчисло нулей = " + zeroesNumber);

        // уникальное число
        int uniqueNumber = 130;
        System.out.println("\tуникальное число = " + uniqueNumber);

        // случайное число
        int randomNumber = (int) Math.floor(Math.random() * Integer.MAX_VALUE);
        System.out.println("\tслучайное число = " + randomNumber);

        // математическое выражение
        String mathExpression = "2 + 2";
        System.out.println("\tматематическое выражение = " + mathExpression);

        // выбор (чего-либо)
        boolean choice = true;
        System.out.println("\tвыбор = " + choice);

        // счет (в игре)
        int score = 22;
        System.out.println("\tсчет = " + score);

        // максимальная длина (строки)
        short maxLineLength = 2000;
        System.out.println("\tмаксимальная длина = " + maxLineLength);

        // пункт меню
        byte menuItem = 8;
        System.out.println("\tпункт меню = " + menuItem);

        // стоимость кофе на вынос
        float takeawayCoffeePrice = 2.5f;
        System.out.println("\tстоимость кофе на вынос = " + takeawayCoffeePrice);

        // дата начала (чего-либо)
        int startDate = 17122023;
        System.out.println("\tдата начала = " + startDate);

        // окончание диапазона
        byte endRange = 127;
        System.out.println("\tокончание диапазона = " + endRange);

        // полное имя работника месяца
        String monthEmployeeFullName = "John Green";
        System.out.println("\tполное имя работника месяца = " + monthEmployeeFullName);

        // заголовок электронной книги
        String ebookTitle = "Java 8";
        System.out.println("\tзаголовок электронной книги = " + ebookTitle);

        // размер
        byte size = 16;
        System.out.println("\tразмер = " + size);

        // вместимость (чего-либо)
        byte capacity = 50;
        System.out.println("\tвместимость = " + capacity);

        // счетчик
        int counter = 600;
        System.out.println("\tсчетчик = " + counter);

        // путь до файла
        String filePath = "C:\\Users\\semyo\\.gradle\\gradle.properties";
        System.out.println("\tпуть до файла = " + filePath);

        // количество чисел в каждой строке
        short numbersInRow = 258;
        System.out.println("\tколичество чисел в каждой строке = " + numbersInRow);

        System.out.println("\n2. boolean-переменные");
        // сотни равны?
        boolean hasEqualHundreds = true;
        System.out.println("\tсотни равны? = " + hasEqualHundreds);

        // компьютер включен?
        boolean isComputerTurnedOn = true;
        System.out.println("\tкомпьютер включен? = " + isComputerTurnedOn);

        // есть равные цифры?
        boolean hasEqualDigits = false;
        System.out.println("\tесть равные цифры? = " + hasEqualDigits);

        // (что-либо) создано?
        boolean isCreated = true;
        System.out.println("\t(что-либо) создано? = " + isCreated);

        // (что-либо) пустое?
        boolean isEmpty = false;
        System.out.println("\t(что-либо) пустое? = " + isEmpty);

        // (что-либо) активное?
        boolean isActive = true;
        System.out.println("\t(что-либо) активное? = " + isActive);

        // новый?
        boolean isRecent = true;
        System.out.println("\tновый? = " + isRecent);

        // электронная почта действительная?
        boolean isValidEmail = true;
        System.out.println("\tэлектронная почта действительная? = " + isValidEmail);

        // имеются уникальные строки?
        boolean hasUniqueStrings = false;
        System.out.println("\tимеются уникальные строки? = " + hasUniqueStrings);

        System.out.println("\n3. Аббревиатуры");
        // старый universally unique identifier
        String oldUuid = "dbcb64fc-9d05-11ee-8c90-0242ac120002";
        System.out.println("\tстарый universally unique identifier = " + oldUuid);

        // производитель оперативной памяти
        String ramManufacturer = "Kingston";
        System.out.println("\tпроизводитель оперативной памяти = " + ramManufacturer);

        // емкость жесткого диска
        String hddCapacity = "2TB";
        System.out.println("\tемкость жесткого диска = " + hddCapacity);

        // протокол передачи гипертекста
        String http = "http";
        System.out.println("\tпротокол передачи гипертекста = " + http);

        // сокращенный uniform resource locator
        String shortUrl = "https://rb.gy/mob0qr";
        System.out.println("\tсокращенный uniform resource locator = " + shortUrl);

        // новый идентификатор клиента
        int newClientId = 40658495;
        System.out.println("\tновый идентификатор клиента = " + newClientId);

        // кодировка american standard code for information interchange
        String ascii = "209 131 209 135 208 184 208 188 32 208 180 208 182 208 176 208 178 209 131";
        System.out.println("\tкодировка american standard code for information interchange = " + ascii);
    }
}