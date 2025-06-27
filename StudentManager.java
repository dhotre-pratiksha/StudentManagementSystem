package miniProject;
import java.util.*;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    // Add student
    public void addStudent(Student s) {
        students.add(s);
    }

    // Display all students
    public void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            for (Student s : students) {
                s.display();
            }
        }
    }

    // Search by roll number
    public void searchStudent(int roll) {
        boolean found = false;
        for (Student s : students) {
            if (s.getRollNumber() == roll) {
                System.out.println("Student found:");
                s.display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with roll " + roll + " not found.");
        }
    }

    // Remove by roll number
    public void removeStudent(int roll) {
        Iterator<Student> it = students.iterator();
        boolean removed = false;
        while (it.hasNext()) {
            if (it.next().getRollNumber() == roll) {
                it.remove();
                System.out.println("Student removed.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Student not found.");
        }
    }

    // Display Top Scorer
    public void displayTopScorer() {
        if (students.isEmpty()) {
            System.out.println("No students.");
            return;
        }
        Student top = students.get(0);
        for (Student s : students) {
            if (s.getMarks() > top.getMarks()) {
                top = s;
            }
        }
        System.out.println("Top Scorer:");
        top.display();
    }
}
