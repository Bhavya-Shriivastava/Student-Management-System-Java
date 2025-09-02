import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private int age;
    private String course;
    private double marks;
    private char grade;

    public Student(int id, String name, int age, String course, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
        this.grade = calculateGrade(marks);
    }

    private char calculateGrade(double marks) {
        if (marks >= 90) return 'A';
        else if (marks >= 75) return 'B';
        else if (marks >= 60) return 'C';
        else if (marks >= 40) return 'D';
        else return 'F';
    }

    // Getters & Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCourse() { return course; }
    public double getMarks() { return marks; }
    public char getGrade() { return grade; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setCourse(String course) { this.course = course; }
    public void setMarks(double marks) {
        this.marks = marks;
        this.grade = calculateGrade(marks);
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %s | Age: %d | Course: %s | Marks: %.2f | Grade: %c",
                id, name, age, course, marks, grade);
    }

    public String toFileString() {
        return id + "," + name + "," + age + "," + course + "," + marks;
    }

    public static Student fromFileString(String line) {
        String[] parts = line.split(",");
        int id = Integer.parseInt(parts[0]);
        String name = parts[1];
        int age = Integer.parseInt(parts[2]);
        String course = parts[3];
        double marks = Double.parseDouble(parts[4]);
        return new Student(id, name, age, course, marks);
    }
}
