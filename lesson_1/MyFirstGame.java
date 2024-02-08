public class MyFirstGame {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int guessNum = 50;
        int randomNum = 24;

        while (guessNum != randomNum) {
            if (guessNum < randomNum) {
                System.out.println("Число " + guessNum + " меньше того, что загадал компьютер");
                min = guessNum + 1;
            } else {
                System.out.println("Число " + guessNum + " больше того, что загадал компьютер");
                max = guessNum - 1;
            }

            guessNum = min == max ? max : max - (max - min + 1) / 2;
        }

        System.out.println("Число = " + guessNum);
        System.out.println("Вы победили!");
    }
}