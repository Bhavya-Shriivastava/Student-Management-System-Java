import java.util.List;

public interface StudentOperations {
    void addStudent(Student student) throws InvalidDataException;
    void updateStudent(int id, String name, int age, String course, double marks) throws StudentNotFoundException;
    void deleteStudent(int id) throws StudentNotFoundException;
    Student searchStudentById(int id) throws StudentNotFoundException;
    List<Student> searchStudentByName(String name) throws StudentNotFoundException;
    void displayAllStudents();
    void saveToFile();
    void loadFromFile();
}
