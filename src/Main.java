public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("James", "Gosling", 9876543);
        Student student2 = new Student("Dennis", "Richie", 1234567);

        student1.setGrade(95);
        student2.setGrade(98);

        Lab lab = new Lab("Mr.Smith", "Monday", 30);
        lab.enrollStudent(student1);
        lab.enrollStudent(student2);
        lab.printLabInfo();

    }

}