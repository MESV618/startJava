import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Игрок 1, введите Ваше имя");
        Player player1 = new Player(scanner.nextLine());

        System.out.println("Игрок 2, введите Ваше имя");
        Player player2 = new Player(scanner.nextLine());

        GuessNumber guessNumber = new GuessNumber(player1, player2);
        String answer = "yes";

        while ("yes".equals(answer)) {
            guessNumber.play();

            do {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
                answer = scanner.next();
            } while (!("yes".equals(answer) || "no".equals(answer)));
        }
    }
}
