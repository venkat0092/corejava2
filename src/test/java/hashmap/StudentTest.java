package hashmap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

public class StudentTest {

    static class Student {
        String firstName;
        String lastName;
        double GPA;

        public Student(String firstName, String lastName, double GPA) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.GPA = GPA;
        }
    }

    @Test
    public void testStudentHashMap() {
        // Create students
        Student student1 = new Student("John", "Doe", 3.8);
        Student student2 = new Student("Jane", "Smith", 3.5);
        Student student3 = new Student("Alice", "Johnson", 3.9);

        // Create HashMap and add students
        Map<String, Student> studentHashMap = new HashMap<>();
        studentHashMap.put(student1.firstName, student1);
        studentHashMap.put(student2.firstName, student2);
        studentHashMap.put(student3.firstName, student3);

        // Test cases
        assertEquals(student1, studentHashMap.get("John"));
        assertEquals(student3, studentHashMap.get("Alice"));

        // Print results to the console
        System.out.println("Test cases passed successfully!");
        System.out.println("Details:");
        System.out.println("John's student details: " + studentHashMap.get("John"));
        System.out.println("Alice's student details: " + studentHashMap.get("Alice"));
    }
}


