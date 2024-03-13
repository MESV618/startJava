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
        Player player = player2;
        while (true) {
            player = player == player2 ? player1 : player2;
            System.out.println(player.getName() + ", введите число");
            player.setNumber(scanner.nextInt());
            scanner.nextLine();

            int playerNum = player.getNumber();
            if (playerNum < randomNum) {
                System.out.println("Число " + playerNum + " меньше того, что загадал " +
                        "компьютер");
            } else if (playerNum > randomNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал " +
                        "компьютер");
            } else {
                System.out.println("Вы угадали!");
                break;
            }
        }
    }
}
