package com.startjava.lesson_2_3_4.array;

import java.util.Random;
import java.util.Scanner;

public class ArraysTheme {
    public static void main(String[] args) {
        reverseArray();
        findFactorial();
        removeArrElements();
        displayAlphabet();
        fillArray();
        playHangman();
    }

    private static void reverseArray() {
        System.out.println("\n1. Реверс значений массива");

        int[] nums = {5, 7, 1, 3, 4, 2, 6};
        int length = nums.length;

        System.out.print("До реверса: ");
        showIntArray(nums);

        for (int i = 0; i < length / 2; i++) {
            int tmp = nums[i];
            nums[i] = nums[length - 1 - i];
            nums[length - 1 - i] = tmp;
        }

        System.out.print("После реверса: ");
        showIntArray(nums);
    }

    private static void findFactorial() {
        System.out.println("\n2. Вычисление факториала");

        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }

        System.out.println(nums[1] + " * " + nums[2] + " * " + nums[3] + " * " + nums[4] + " * " +
                nums[5] + " * " + nums[6] + " * " + nums[7] + " * " + nums[8] + " = " +
                (nums[1] * nums[2] * nums[3] * nums[4] * nums[5] * nums[6] * nums[7] * nums[8]));
    }

    private static void removeArrElements() {
        System.out.println("\n3. Удаление элементов массива");

        double[] nums = new double[15];
        Random random = new Random();
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            nums[i] = random.nextDouble();
        }

        System.out.print("Исходный массив: ");
        showDoubleArray(nums);

        double num = nums[length / 2];
        int counter = 0;

        for (int i = 0; i < length; i++) {
            if (nums[i] > num) {
                nums[i] = 0;
                counter++;
            }
        }

        System.out.print("Измененный массив: ");
        showDoubleArray(nums);
        System.out.println("Кол-во обнуленных ячеек: " + counter);
    }

    private static void displayAlphabet() {
        System.out.println("\n4. Вывод алфавита лесенкой");

        char[] letters = new char[26];
        int counter = 0;
        for (int i = 65; i < 91; i++) {
            char letter = (char) i;
            letters[counter++] = letter;
        }

        int length = letters.length;

        for (int i = length - 1; i >= 0; i--) {
            for (int j = length - 1; j >= i; j--) {
                System.out.print(letters[j]);
            }
            System.out.println();
        }
    }

    private static void fillArray() {
        System.out.println("\n5. Заполнение массива уникальными числами");

        int[] numbers = generateUniqueNumbers(60, 100, 30);

        sortArray(numbers);

        for (int i = 0; i < 30; i += 10) {
            for (int j = i; j < i + 10; j++) {
                System.out.print(numbers[j] + " ");
            }
            System.out.println();
        }
    }

    private static void playHangman() {
        System.out.println("\n6. Игра “Виселица”");

        final String[] WORDS = {"APPLE", "BANANA", "ORANGE", "STRAWBERRY", "GRAPE"};;
        final int MAX_TRIES = 6;

        Random random = new Random();
        String word = WORDS[random.nextInt(WORDS.length)];
        char[] guessedLetters = new char[word.length()];
        int incorrectAttempts = 0;
        StringBuilder incorrectLetters = new StringBuilder();
        StringBuilder correctLetters = new StringBuilder();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Начинаем игру!");

        while (incorrectAttempts < MAX_TRIES) {
            displayHangman(incorrectAttempts);
            System.out.println("Загаданное слово: " + getGuessedWord(word, guessedLetters));
            System.out.println("Неверно угаданные буквы: " + incorrectLetters.toString());
            System.out.println("Верно угаданные буквы: " + correctLetters.toString());
            System.out.println("Осталось попыток: " + (MAX_TRIES - incorrectAttempts));

            System.out.print("Введите букву: ");
            char guess = scanner.next().toUpperCase().charAt(0);

            if (!Character.isLetter(guess)) {
                System.out.println("Введите корректную букву\n");
                continue;
            }

            if (correctLetters.indexOf(String.valueOf(guess)) != -1 ||
                    incorrectLetters.indexOf(String.valueOf(guess)) != -1) {
                System.out.println("Эта буква была, загадайте другую\n");
                continue;
            }

            if (containsLetter(word, guess, guessedLetters)) {
                System.out.println("Угадали!\n");
                incorrectAttempts = incorrectAttempts > 0 ? --incorrectAttempts : 0;
                correctLetters.append(guess).append(" ");
                if (isWordGuessed(word, guessedLetters)) {
                    System.out.println("Ура! Угадано слово: " + word);
                    break;
                }
            } else {
                System.out.println("Такой буквы нет\n");
                incorrectLetters.append(guess).append(" ");
                incorrectAttempts++;
            }
        }

        if (incorrectAttempts == MAX_TRIES) {
            displayHangman(MAX_TRIES);
            System.out.println("Вы проиграли! Слово было: " + word);
        }

        scanner.close();
    }

    private static void showIntArray(int[] nums) {
        StringBuilder output = new StringBuilder("[");
        for (int num : nums) {
            output.append(num).append(", ");
        }
        output.setLength(output.length() - 2);
        output.append("]");
        System.out.println(output.toString());
    }

    private static void showDoubleArray(double[] nums) {
        StringBuilder output = new StringBuilder("[");
        int counter = 0;
        for (double num : nums) {
            counter++;
            String newLine = counter == 8 ? "\n" : "";
            output.append(String.format("%.3f",num)).append(", ").append(newLine);
        }
        output.setLength(output.length() - 2);
        output.append("]");
        System.out.println(output.toString());
    }

    public static int[] generateUniqueNumbers(int min, int max, int count) {
        if (count > max - min) {
            throw new IllegalArgumentException("Count exceeds range");
        }

        int[] generated = new int[count];
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int num = random.nextInt(max - min) + min;
            while (contains(generated, num, i)) {
                num = random.nextInt(max - min) + min;
            }
            generated[i] = num;
        }
        return generated;
    }

    public static boolean contains(int[] array, int num, int position) {
        for (int i = 0; i < position; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static void sortArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static boolean containsLetter(String word, char letter, char[] guessedLetters) {
        boolean contains = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                guessedLetters[i] = letter;
                contains = true;
            }
        }
        return contains;
    }

    private static String getGuessedWord(String word, char[] guessedLetters) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (guessedLetters[i] != '\0') {
                result.append(guessedLetters[i]);
            } else {
                result.append("_");
            }
            result.append(" ");
        }
        return result.toString();
    }

    private static boolean isWordGuessed(String word, char[] guessedLetters) {
        for (int i = 0; i < word.length(); i++) {
            if (guessedLetters[i] == '\0') {
                return false;
            }
        }
        return true;
    }

    private static void displayHangman(int incorrectAttempts) {
        switch (incorrectAttempts) {
            case 0:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 1:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 2:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println("  |   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 3:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 4:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 5:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println(" /    |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 6:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println(" / \\  |");
                System.out.println("      |");
                System.out.println("=========");
                break;
        }
    }
}
