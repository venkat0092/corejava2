public class College extends Department{
    int getDepartmentSize(){
        return 5;

    }

    public static void main(String[] args) {
        College college = new College();
        System.out.println(college.getDepartmentSize());
    }

}


