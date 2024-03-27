package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public final class GuessNumber {
    private final Player player1;
    private final Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 100 + 1);
        Player currentPlayer = player2;
        while (true) {
            currentPlayer = currentPlayer == player2 ? player1 : player2;
            System.out.println(currentPlayer.getName() + ", введите число");
            currentPlayer.setNumber(scanner.nextInt());
            scanner.nextLine();

            int playerNum = currentPlayer.getNumber();
            if (playerNum == randomNum) {
                System.out.println("Вы угадали!");
                break;
            }
            if (playerNum > randomNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
            }
        }
    }
}
