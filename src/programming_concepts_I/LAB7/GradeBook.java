package programming_concepts_I.LAB7;

import java.util.ArrayList;

public class GradeBook {
    private ArrayList<String> studentNames = new ArrayList<>();
    private final char[] letterGrades = {'A', 'B', 'C', 'D', 'F'};

    public GradeBook() {
        studentNames.add("John Doe");
        studentNames.add("Jane Doe");
        studentNames.add("Jack Doe");
        studentNames.add("Jill Doe");
        studentNames.add("Bob Doe");
    }

    public ArrayList<String> getStudentNames() {
        return studentNames;
    }

    public ArrayList<Double> getStudentRecord(String studentName) {
        ArrayList<Double>;
    }


}
