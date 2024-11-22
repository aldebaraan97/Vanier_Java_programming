package programming_concepts_I.LAB7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LotteryApplicationTest();
    }

    public static void LotteryApplicationTest() {
        Scanner input = new Scanner(System.in);
        LotteryApplication lotteryNumbers = new LotteryApplication();
        ArrayList<Integer> lotteryNumbersList = lotteryNumbers.getLotteryNumbers();
        ArrayList<Integer> userLotteryNumbers = new ArrayList<>();

        lotteryNumbers.printLotteryNumbers();
        System.out.println("Enter 10 different integers:");
        for (Integer lotteryNumber : lotteryNumbersList) {
            System.out.println("Enter an integer: ");
            userLotteryNumbers.add(input.nextInt());
        }

        lotteryNumbers.printLotteryNumbers();
        userLotteryNumbers.forEach(e -> System.out.print(e + " "));
        System.out.println("The number of matches is " + lotteryNumbers.matches(userLotteryNumbers));
    }
}
