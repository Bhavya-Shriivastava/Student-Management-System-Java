# Student Management System (Java)

[![Java](https://img.shields.io/badge/Java-17-orange)](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![GitHub issues](https://img.shields.io/github/issues/Bhavya-Shriivastava/Student-Management-System-Java)](https://github.com/Bhavya-Shriivastava/Student-Management-System-Java/issues)
[![GitHub forks](https://img.shields.io/github/forks/Bhavya-Shriivastava/Student-Management-System-Java)](https://github.com/Bhavya-Shriivastava/Student-Management-System-Java/network)
[![GitHub stars](https://img.shields.io/github/stars/Bhavya-Shriivastava/Student-Management-System-Java)](https://github.com/Bhavya-Shriivastava/Student-Management-System-Java/stargazers)
[![GitHub repo size](https://img.shields.io/github/repo-size/Bhavya-Shriivastava/Student-Management-System-Java)](https://github.com/Bhavya-Shriivastava/Student-Management-System-Java)
[![Contributions Welcome](https://img.shields.io/badge/Contributions-Welcome-brightgreen.svg)](https://github.com/Bhavya-Shriivastava/Student-Management-System-Java/pulls)

# 🎓 Student Information and Performance Management System

A **console-based Student Management System** built using **Core Java**.  
This project demonstrates **OOP, Interfaces, Exception Handling, Multithreading, and File Persistence**.

---

## 🚀 Features
- ➕ Add new student records  
- ✏️ Update student details  
- ❌ Delete student records  
- 🔍 Search students by **ID** or **Name**  
- 📋 Display all student records in a structured format  
- 📝 Automatic **Grade Calculation** (A-F based on marks)  
- 💾 File Persistence with `students.txt` (load & save records)  
- ⚠️ Custom Exceptions:  
  - `StudentNotFoundException`  
  - `InvalidDataException`  
- 🔄 Multithreaded **Auto-Save** (saves data every 1 minute)

---

## 🛠️ Technologies Used
- **Core Java**  
- **OOP Concepts** (Abstraction, Encapsulation, Inheritance, Polymorphism)  
- **Interfaces**  
- **Exception Handling**  
- **Multithreading**  
- **File I/O**

---

## 📂 Project Structure
| File Name                    | Description                          |
|-------------------------------|--------------------------------------|
| `Student.java`               | Defines the Student class            |
| `StudentOperations.java`     | Interface for CRUD operations        |
| `StudentNotFoundException.java` | Custom exception for missing student |
| `InvalidDataException.java`  | Custom exception for invalid data     |
| `StudentManagementSystemImpl.java` | Main implementation of system   |
| `AutoSaveTask.java`          | Background autosave thread           |
| `Main.java`                  | Entry point of the program           |
| `students.txt`               | Data persistence file                |


---

## 📸 Sample Output
===== Student Management System =====
1. Add Student
2. Update Student
3. Delete Student
4. Search Student by ID
5. Search Student by Name
6. Display All Students
7. Save & Exit
Enter choice:

---

## ▶️ How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/Bhavya-Shriivastava/Student-Management-System-Java.git
   cd Student-Management-System-Java
2. Compile all Java files:
  javac *.java
3. Run the program:
  java Main

**📝 Author**

**👤 Bhavya Shrivastava
📌 B.Tech CSE @ KIIT University
🔗 [GitHub](https://github.com/Bhavya-Shriivastava) | [LinkedIn](https://www.linkedin.com/in/bhavya-shrivastava0107/)

