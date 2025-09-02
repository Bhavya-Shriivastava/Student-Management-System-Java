import java.util.*;

public class Main {
    public static void main(String[] args) {
        StudentManagementSystemImpl sms = new StudentManagementSystemImpl();
        AutoSaveTask autoSave = new AutoSaveTask(sms);
        autoSave.setDaemon(true);
        autoSave.start();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Search Student by ID");
            System.out.println("5. Search Student by Name");
            System.out.println("6. Display All Students");
            System.out.println("7. Save & Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Course: ");
                        String course = sc.nextLine();
                        System.out.print("Enter Marks: ");
                        double marks = sc.nextDouble();
                        sms.addStudent(new Student(id, name, age, course, marks));
                        break;

                    case 2:
                        System.out.print("Enter Student ID to update: ");
                        int uid = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter New Name: ");
                        String uname = sc.nextLine();
                        System.out.print("Enter New Age: ");
                        int uage = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter New Course: ");
                        String ucourse = sc.nextLine();
                        System.out.print("Enter New Marks: ");
                        double umarks = sc.nextDouble();
                        sms.updateStudent(uid, uname, uage, ucourse, umarks);
                        break;

                    case 3:
                        System.out.print("Enter Student ID to delete: ");
                        int did = sc.nextInt();
                        sms.deleteStudent(did);
                        break;

                    case 4:
                        System.out.print("Enter Student ID to search: ");
                        int sid = sc.nextInt();
                        System.out.println(sms.searchStudentById(sid));
                        break;

                    case 5:
                        System.out.print("Enter Student Name to search: ");
                        String sname = sc.nextLine();
                        for (Student s : sms.searchStudentByName(sname)) {
                            System.out.println(s);
                        }
                        break;

                    case 6:
                        sms.displayAllStudents();
                        break;

                    case 7:
                        sms.saveToFile();
                        System.out.println("Exiting... Data saved.");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
