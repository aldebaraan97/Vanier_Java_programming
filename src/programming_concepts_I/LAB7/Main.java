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
        ArrayList<String> studentNames = new ArrayList<>(4);
        ArrayList<ArrayList<Double>> studentScores = new ArrayList<>(4);
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <= 4; i++) {
            studentScores.add(new ArrayList<>());
        }

        // Get data from user
        System.out.println("Enter student names and scores: ");
        for (int i = 0; i <= 3; i++) { //(String studentName : studentNames) {
            System.out.println("Enter student " + (i + 1) + " name: ");
            studentNames.add(input.nextLine());
            for (int j = 0; j <= 3; j++) {
                System.out.println("Enter score of test " + (j + 1) + " : ");
                studentScores.get(i).add(input.nextDouble());
            }
            input.nextLine();
        }

        // Push data into the gradeBook object
        for (int i = 0; i <= 3; i++) {
            gradeBook = new GradeBook(studentNames.get(i), studentScores.get(i));
        }
        gradeBook.printStudentRecords();

    }
}
