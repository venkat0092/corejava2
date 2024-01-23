package loopsandconditions.reversedigits;

public class AgePerson {
    static String getAgePerson(int age){
        if (age < 13)
            return "kid";
        else if (age >= 13 && age <= 19)
            return "teen";
        else
            return "adult";

    }


public static void main(String[] args) {
    System.out.println(getAgePerson(11));
}
}



