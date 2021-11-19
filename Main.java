import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Initialization
        boolean flag;

        boolean isEven;
        boolean isPerfectlyEven;

        String message = null;
        String replay = "yes";

        Scanner keyboard = new Scanner(System.in);

        do {

            //Prompt User Input
            flag = true;
            do {

                try {

                    System.out.print("Message: ");
                    message = keyboard.nextLine();
                    flag = false;

                } catch (Exception e) {

                    System.out.println("Invalid Input.");

                }

            } while (flag);

            // Check & Display If Character Count Is Even
            isEven = CharacterCounter.minRepeat(message) == CharacterCounter.maxRepeat(message);
            System.out.println("Even: " + isEven);
            isPerfectlyEven = CharacterCounter.minStrictRepeat(message) == CharacterCounter.maxStrictRepeat(message);
            System.out.println("Perfectly Even: " + isPerfectlyEven);

            // Prompt Replay
            flag = true;
            do {

                try {

                    System.out.print("Check another message? ");
                    replay = keyboard.nextLine();
                    if (replay.toLowerCase().charAt(0) == 'y' || replay.toLowerCase().charAt(0) == 'n') {

                        flag = false;

                    } else {

                        System.out.println("Invalid Input.");

                    }

                } catch (Exception e) {

                    System.out.println("Invalid Input.");

                }

            } while (flag);

        } while (replay.toLowerCase().charAt(0) == 'y');

    }

}
