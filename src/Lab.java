public class Lab {

    public Lab(String teacher, String dayOfWeek, int maxSize) {
        this.teacher = teacher;
        this.dayOfWeek = dayOfWeek;
        this.maxSize = maxSize;
        students = new Student[maxSize];
    }

    private Student[] students;
    private String teacher;
    private String dayOfWeek;
    private int currentSize;
    private int maxSize;

    private double avgGrade;

    public Student[] getStudents() {
        return students;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public Lab setStudents(Student[] students) {
        this.students = students;
        return this;
    }

    public Lab setTeacher(String teacher) {
        this.teacher = teacher;
        return this;
    }

    public Lab setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    public Lab setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
        return this;
    }

    public Lab setMaxSize(int maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    public Lab setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
        return this;
    }

    public void calcAvg() {
        double total = 0;
        for (int i = 0; i < currentSize; i++) {
            total += students[i].getGrade();
        }
        avgGrade = total / currentSize;
        System.out.println("Student average is: " + avgGrade);
    }

    public void enrollStudent(Student student) {
        System.out.println(currentSize);
        System.out.println(maxSize);
        if (currentSize < maxSize) {
            students[currentSize] = student;
            currentSize++;
            System.out.println("Student enrolled successfully.");
        } else {
            System.out.println("Lab is full. Cannot enroll more students.");
        }
    }


    public void printLabInfo() {
        System.out.print("{");
        System.out.println();
        for (int i = 0; i < currentSize; i++) {
            System.out.print("\t");
            students[i].printStudentInfo();
        }

        System.out.print("\t");
        System.out.print("[");
        System.out.print("Teacher: " + this.teacher);
        System.out.print(", ");
        System.out.print("Day of week: " + this.dayOfWeek);
        System.out.print(", ");
        System.out.print("Enrolled students: " + this.currentSize);
        System.out.print(", ");
        System.out.print("Average grade: " + this.avgGrade);
        System.out.print("]");
        System.out.println();

        System.out.print("}");
    }

}