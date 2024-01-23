 class Bus {
     void move() {
         System.out.println("moving");

     }
     public static void main(String[] args){
         Bus S=new School();
         Bus T= new transport();
         S.move();
         T.move();
     }
 }

class School extends Bus {
    void move() {
        System.out.println("moving with 60kmph");
    }

}

class transport extends Bus{
    void move(){
        System.out.println("moving with 90kmph");

    }
}


