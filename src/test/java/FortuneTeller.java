import java.util.Scanner;

public class FortuneTeller {

    public static void main(String[] args) {

        boolean isNumValid = false;

        while (!isNumValid) {
            System.out.println("Pick number from 1 to 10");
            Scanner scanner = new Scanner(System.in);
            int inputtedNumber = scanner.nextInt();

            if (inputtedNumber <= 10 && inputtedNumber >= 1) {
                if (inputtedNumber > 5) {
                    System.out.println("Be carefull! Something can spoil your mood");
                } else {
                    System.out.println("This day brings you something special");
                }
                isNumValid = true;
            } else {
                System.out.println("Don't cheat! input number from 1 to 10");
            }
        }

    }
}
