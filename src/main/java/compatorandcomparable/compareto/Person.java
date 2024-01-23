package compatorandcomparable.compareto;

public class Person {
    private double height;
    private double weight;
    private String ssn;
    private String phoneNumber;

    // Constructor
    public Person(double height, double weight, String ssn, String phoneNumber) {
        this.height = height;
        this.weight = weight;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
    }

    // Override equals method to match based on ssn
    @Override
    public boolean equals(Object obj) {
        // Check if comparing with itself
        if (this == obj) {
            return true;
        }

        // Check if the object is null or of a different type
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Cast the object to Person
        Person person = (Person) obj;

        // Compare based on ssn
        return ssn.equals(person.ssn);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating two Person objects with the same ssn
        Person person1 = new Person(170.0, 65.0, "123-45-6789", "123-456-7890");
        Person person2 = new Person(165.0, 60.0, "123-45-6789", "987-654-3210");

        // Testing equals method
        if (person1.equals(person2)) {
            System.out.println("These persons are the same based on ssn.");
        } else {
            System.out.println("These persons are different.");
        }
    }
}

