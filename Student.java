package miniProject;

public class Student {
    private int rollNumber;
    private String name;
    private double marks;

    public Student(int rollNumber, String name, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    // Getters
    public int getRollNumber() { return rollNumber; }
    public String getName() { return name; }
    public double getMarks() { return marks; }

    // Display
    public void display() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", Marks: " + marks);
    }
}

