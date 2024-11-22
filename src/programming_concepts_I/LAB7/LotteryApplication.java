package programming_concepts_I.LAB7;
import java.util.ArrayList;

public class LotteryApplication {
    private final ArrayList<Integer> lotteryNumbers = new ArrayList<>();

    // Adds 10 semi-random integers from 0-9 to lotteryNumbers list
    public LotteryApplication() {
        for (int i = 0; i <= 9; i++)
            lotteryNumbers.add((int) (Math.random() * 9));
    }

    /** Compares the value of two lists at the index i */
    public ArrayList<Integer> matches(ArrayList<Integer> userLotteryNumbers) {
        ArrayList<Integer> numberOfMatches = new ArrayList<>();
        for (int i = 0; i < userLotteryNumbers.size(); i++) {
            if (lotteryNumbers.get(i) == userLotteryNumbers.get(i)) {
                numberOfMatches.add(lotteryNumbers.get(i));
            }
        }
        return numberOfMatches;
    }

    /** forEach() method performs a process/operation on each element of the list */
    public void printLotteryNumbers() {
        getLotteryNumbers().forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

    /** Returns a list with the lottery numbers in the current object */
    public ArrayList<Integer> getLotteryNumbers() {
        return lotteryNumbers;
    }
}
