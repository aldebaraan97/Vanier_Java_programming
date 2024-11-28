package programming_concepts_I.LAB7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        LotteryApplicationTest();
        gradeBookTest();
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

        System.out.println("Lottery numbers:\n");
        lotteryNumbers.printLotteryNumbers();
        System.out.println("\nUSer input:");
        userLotteryNumbers.forEach(e -> System.out.print(e + " "));
        System.out.println("\nThe matches are " + lotteryNumbers.matches(userLotteryNumbers));
    }

    public static void gradeBookTest() {
        GradeBook gradeBook = new GradeBook();
        Scanner input = new Scanner(System.in);

        // Get data from user
        System.out.println("Enter student names and scores: ");
        for (int i = 0; i <= 3; i++) { //(String studentName : studentNames) {
            System.out.println("Enter student " + (i + 1) + " name: ");
            gradeBook.getStudentNames().add(input.next());
            for (int j = 0; j <= 3; j++) {
                System.out.println("Enter score of test " + (j + 1) + " : ");
                gradeBook.getStudentScores().get(j).add(input.nextDouble());
            }
            input.nextLine();
        }
        gradeBook.printStudentRecords();
    }
}
