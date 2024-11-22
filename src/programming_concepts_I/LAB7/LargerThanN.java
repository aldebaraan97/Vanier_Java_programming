package programming_concepts_I.LAB7;

import java.util.ArrayList;

public class LargerThanN {
    public static ArrayList<Integer> largerThan(ArrayList<Integer> integers, int N) {
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer integer : integers) {
            if (integer > N) {
                result.add(integer);
            }
        }
        return result;
    }
}
