import java.io.*;
import java.util.*;

public class StudentManagementSystemImpl implements StudentOperations {
    private List<Student> students;
    private final String FILE_NAME = "students.txt";

    public StudentManagementSystemImpl() {
        students = new ArrayList<>();
        loadFromFile();
    }

    @Override
    public void addStudent(Student student) throws InvalidDataException {
        if (student.getId() <= 0 || student.getName().isEmpty() || student.getAge() <= 0 || student.getMarks() < 0) {
            throw new InvalidDataException("Invalid student data provided!");
        }
        students.add(student);
        System.out.println("Student added successfully!");
    }

    @Override
    public void updateStudent(int id, String name, int age, String course, double marks) throws StudentNotFoundException {
        Student student = searchStudentById(id);
        student.setName(name);
        student.setAge(age);
        student.setCourse(course);
        student.setMarks(marks);
        System.out.println("Student updated successfully!");
    }

    @Override
    public void deleteStudent(int id) throws StudentNotFoundException {
        Student student = searchStudentById(id);
        students.remove(student);
        System.out.println("Student deleted successfully!");
    }

    @Override
    public Student searchStudentById(int id) throws StudentNotFoundException {
        for (Student s : students) {
            if (s.getId() == id) return s;
        }
        throw new StudentNotFoundException("Student with ID " + id + " not found!");
    }

    @Override
    public List<Student> searchStudentByName(String name) throws StudentNotFoundException {
        List<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                result.add(s);
            }
        }
        if (result.isEmpty()) throw new StudentNotFoundException("No student found with name " + name);
        return result;
    }

    @Override
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records available.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    @Override
    public void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Student s : students) {
                writer.write(s.toFileString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving to file: " + e.getMessage());
        }
    }

    @Override
    public void loadFromFile() {
        students.clear();
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                students.add(Student.fromFileString(line));
            }
        } catch (IOException e) {
            System.out.println("Error loading from file: " + e.getMessage());
        }
    }
}
