package programming_concepts_I.LAB6;

import programming_concepts_I.LAB6.Dice ;

import java.util.Scanner;

public class GameTwentyOne {
    public static void main(String[] args) {
        int systemScore = 0;
        int userScore = 0;
        boolean flag = true;
        Dice dice = new Dice();

        System.out.println(dice.roll());

        // Game event
        while (flag){
            Scanner input = new Scanner(System.in);
            String userRawInput;

            System.out.println("Roll the dice to accumulate points? y/n");
            userRawInput = input.next();

            flag = switch (userRawInput.toLowerCase()) {
                case "y" -> true;
                case "n" -> false;
                default -> false;
            };
            systemScore += dice.roll();
            userScore += dice.roll();
        }
        System.out.println("System score: " + systemScore);
        System.out.println("User score: " + userScore);
        System.out.println("The winner is " + (systemScore == userScore && systemScore <= 21?
                "Tie" : (systemScore > userScore && systemScore <= 21)?
                "Computer" : "User"));
    }
}
