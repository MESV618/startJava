public final class GuessNumber {
    private final Player player1;
    private final Player player2;
    private final int randomNum;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.randomNum = (int) (Math.random() * 100 + 1);
    }

    public int checkGuess(Player player) {
        if (player == player1 || player == player2) {
            int playerNum = player.getNumber();
            if (playerNum < randomNum) {
                System.out.println("Число " + playerNum + " меньше того, что загадал " +
                        "компьютер");
                return -1;
            } else if (playerNum > randomNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал " +
                        "компьютер");
                return 1;
            } else {
                System.out.println("Вы угадали!");
                return 0;
            }
        }
        return 404;
    }
}
