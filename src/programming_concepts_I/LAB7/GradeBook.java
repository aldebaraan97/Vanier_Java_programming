package programming_concepts_I.LAB7;

import java.util.ArrayList;

public class GradeBook {
    private ArrayList<String> studentNames = new ArrayList<>(4);
    private String  student0Name, student1Name, student2Name, student3Name;
    private final char[] letterGrades = {'A', 'B', 'C', 'D', 'F'};
    private ArrayList<ArrayList<Double>> studentScores = new ArrayList<>(4);
    private ArrayList<Double> student0TestScores = new ArrayList<>(4);
    private ArrayList<Double> student1TestScores = new ArrayList<>(4);
    private ArrayList<Double> student2TestScores = new ArrayList<>(4);
    private ArrayList<Double> student3TestScores = new ArrayList<>(4);

    // Constructors
    public GradeBook() {
        studentScores.add(student0TestScores);
        studentScores.add(student1TestScores);
        studentScores.add(student2TestScores);
        studentScores.add(student3TestScores);
        studentNames.add(student0Name);
        studentNames.add(student1Name);
        studentNames.add(student2Name);
        studentNames.add(student3Name);
    }

    public GradeBook(String studentName, ArrayList<Double> studentScores) {
        this.studentNames.add(studentName);
        this.studentScores.add(studentScores);
    }
    public GradeBook(ArrayList<Double> studentScores) {
        this.studentScores.add(studentScores);
    }
    // Setters
    public void setStudent0Name(String student0Name) {
        this.student0Name = student0Name;
    }
    public void setStudent1Name(String student1Name) {
        this.student1Name = student1Name;
    }
    public void setStudent2Name(String student2Name) {
        this.student2Name = student2Name;
    }
    public void setStudent3Name(String student3Name) {
        this.student3Name = student3Name;
    }

    // Getters
    public ArrayList<ArrayList<Double>> getStudentScores() {
        return studentScores;
    }
    public ArrayList<Double> getStudent0TestScores() {
        return student0TestScores;
    }
    public ArrayList<Double> getStudent1TestScores() {
        return student1TestScores;
    }
    public ArrayList<Double> getStudent2TestScores() {
        return student2TestScores;
    }
    public ArrayList<Double> getStudent3TestScores() {
        return student3TestScores;
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
        return average / 4.0;
    }

    private String getStudentGrade(double average) {
        String grade = "0";
        if (average >= 90 && average <= 100) grade = "A";
        else if (average >= 80 && average <= 89) grade = "B";
        else if (average >= 70 && average <= 79) grade = "C";
        else if (average >= 60 && average <= 69) grade = "D";
        else if (average >= 50 && average <= 59) grade = "F";
        return grade;
    }

    // Methods
    public void printStudentRecords() {
        for (int i = 0; i < studentScores.size(); i++) {
              ArrayList<Double> studentScores = getStudentScores(i);
              System.out.println("Student " + studentNames.get(i) + " average: " + getAverage(studentScores));
              System.out.println("Grade: " + getStudentGrade(getAverage(studentScores)));
        }
    }
}
