package programming_concepts_I.LAB6;

public class Employee {
    private String name;
    int idNumber;
    String position, department;

    public Employee(String name, int idNumber, String department,String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    public Employee(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        department = "";
        position = "";
    }

    public Employee() {
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
