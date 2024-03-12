import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";

        System.out.println("Игрок 1, введите Ваше имя");
        Player player1 = new Player(scanner.nextLine());

        System.out.println("Игрок 2, введите Ваше имя");
        Player player2 = new Player(scanner.nextLine());

        while (answer.equals("yes")) {
            GuessNumber guessNumber = new GuessNumber(player1, player2);

            Player player = player2;
            do {
                player = player == player2 ? player1 : player2;
                System.out.println(player.getName() + ", введите число");
                player.setNumber(scanner.nextInt());
                scanner.nextLine();
            } while (guessNumber.checkGuess(player) != 0);

            do {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
                answer = scanner.next();
            } while (!(answer.equals("yes") || answer.equals("no")));
        }
    }
}
