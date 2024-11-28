package programming_concepts_I.LAB7;

import java.util.ArrayList;

public class GradeBook {
    private ArrayList<String> studentNames = new ArrayList<>(4);
    private final char[] letterGrades = {'A', 'B', 'C', 'D', 'F'};
    private ArrayList<ArrayList<Double>> studentScores = new ArrayList<>(4);
    private ArrayList<Double> student0TestScores = new ArrayList<>(4);
    private ArrayList<Double> student1TestScores = new ArrayList<>(4);
    private ArrayList<Double> student2TestScores = new ArrayList<>(4);
    private ArrayList<Double> student3TestScores = new ArrayList<>(4);

    // Constructors
    public GradeBook() {}

    public GradeBook(String studentName, ArrayList<Double> studentScores) {
        this.studentNames.add(studentName);
        this.studentScores.add(studentScores);
    }
    public GradeBook(ArrayList<Double> studentScores) {
        this.studentScores.add(studentScores);
    }

    // Getters
    public ArrayList<Double> getStudentRecord(String studentName, int studentIndex) {
        ArrayList<Double> studentRecord = new ArrayList<>();
        return studentRecord;
    }

    public ArrayList<String> getStudentNames() {
        return studentNames;
    }

    private ArrayList<Double> getStudentScores(int index) {
        return studentScores.get(index);
    }

    private double getAverage(ArrayList<Double> studentScores) {
        double average = 0;
        for (Double score : studentScores ) {
            average += score;
        }
        return average / studentScores.size();
    }

    private String getStudentGrade(double average) {
        String grade = "";
        if (average >= 90 && average <= 100) grade = "A";
        else if (average >= 80 && average <= 89) grade = "B";
        else if (average >= 70 && average <= 79) grade = "C";
        else if (average >= 60 && average <= 69) grade = "D";
        else if (average >= 50 && average <= 59) grade = "F";
        return grade;
    }

    // Methods
    public void printStudentRecords() {

        for (int i = 0; i <= studentScores.size(); i++) {
              ArrayList<Double> studentScores = getStudentScores(i);
//            System.out.println("Student " + studentName + " average: " + getAverage(studentScores) +
//                    "\nGrade: " + getStudentGrade(getAverage(studentScores)));

            System.out.println("Student " + studentNames.get(i) + " average: " + getAverage(studentScores));
            System.out.println("Grade: " + getStudentGrade(getAverage(getStudentScores(i))));
        }

    }
}
