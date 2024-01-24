package traversearray;

import java.util.ArrayList;

class Student {
    String firstName;
    String lastName;
    double GPA;

    public Student(String firstName, String lastName, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }
}

public class RemoveStudent {
    public static void main(String[] args) {
        // Create an ArrayList of Students
        ArrayList<Student> studentList = new ArrayList<>();

        // Add some students to the list
        studentList.add(new Student("John", "Doe", 3.5));
        studentList.add(new Student("Jane", "Smith", 2.8));
        studentList.add(new Student("Mike", "Johnson", 3.2));
        studentList.add(new Student("Emily", "Brown", 3.8));

        // Calculate the average GPA
        double totalGPA = 0;
        for (Student student : studentList) {
            totalGPA += student.GPA;
        }
        double averageGPA = totalGPA / studentList.size();

        // Remove students with GPA less than the average GPA
        ArrayList<Student> remainingStudents = new ArrayList<>();
        for (Student student : studentList) {
            if (student.GPA >= averageGPA) {
                remainingStudents.add(student);
            }
        }

        // Print the remaining students
        for (Student student : remainingStudents) {
            System.out.println(student.firstName + " " + student.lastName + ", GPA: " + student.GPA);
        }
    }
}

