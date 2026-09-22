package studentmanager.app;

import studentmanager.model.Student;
import studentmanager.service.StudentManager;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent(new Student(101, "Aarav", "BCA", 82.5));
        manager.addStudent(new Student(102, "Riya", "BCA", 91.0));
        manager.addStudent(new Student(103, "Karan", "BCA", 76.5));

        System.out.println("STUDENT PACKAGE MANAGER");
        manager.displayStudents();
    }
}
