package programming_concepts_I.LAB7;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Double> testScores = new ArrayList<Double>();

    public Student(String name, ArrayList<Double> testScores) {
        this.name = name;
        this.testScores = testScores;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        double sum = 0;
        for (Double score : testScores)
            sum += score;
        return sum;
    }

    public char getGrade() {
        if (testScores.size() == 0)
            return 'N';
        else if (getAverage() >= 90)
            return 'A';
        else if (getAverage() >= 80)
            return 'B';
        else if (getAverage() >= 70)
            return 'C';
        else if (getAverage() >= 60)
            return 'D';
        else
            return 'F';
    }

    private ArrayList<Double> getScores() {
        return testScores;
    }

}
