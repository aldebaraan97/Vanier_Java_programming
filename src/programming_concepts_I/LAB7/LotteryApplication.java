package programming_concepts_I.LAB7;

import java.util.ArrayList;
import java.util.Objects;

public class LotteryApplication {
    private ArrayList<Integer> lotteryNumbers = new ArrayList<>();

    // Adds 10 semi-random integers from 0-9 to lotteryNumbers list
    public LotteryApplication() {
        for (int i = 0; i <= 9; i++)
            lotteryNumbers.add((int) (Math.random() * 9));
    }

    public ArrayList<Integer> matches(ArrayList<Integer> userLotteryNumbers) {
        ArrayList<Integer> numberOfMatches = new ArrayList<>();
        for (int i = 0; i < userLotteryNumbers.size(); i++) {
            if (Objects.equals(lotteryNumbers.get(i), userLotteryNumbers.get(i))) {
                numberOfMatches.add(lotteryNumbers.get(i));
            }
        }
        return numberOfMatches;
    }

    public void printLotteryNumbers() {
        getLotteryNumbers().forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

    public ArrayList<Integer> getLotteryNumbers() {
        return lotteryNumbers;
    }
}
