package loopsandconditions.reversedigits;

public class ReverseNum {
    static  int reverseNum(int num) {
        int reverseNumber = 0;
        while(num != 0){
            int remainder = num % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            num /= 10;
        }
        return reverseNumber;
    }

    public static void main(String[] args) {
        System.out.println(reverseNum(12345));
    }

        }



