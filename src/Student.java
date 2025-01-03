public class Student {

    private String firstName;
    private String lastName;
    private int id;
    private double grade;

    public Student(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public double getGrade() {
        return grade;
    }

    public Student setGrade(double grade) {
        this.grade = grade;
        return this;
    }

    public void printStudentInfo() {
        System.out.print("[");
        System.out.print("First Name: " + this.firstName);
        System.out.print(", ");
        System.out.print("Last Name: " + this.lastName);
        System.out.print(", ");
        System.out.print("ID: " + this.id);
        System.out.print(", ");
        System.out.print("Grade: " + this.grade);
        System.out.print("]");
        System.out.println();
    }

}