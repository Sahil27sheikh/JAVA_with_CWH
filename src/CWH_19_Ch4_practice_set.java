import java.util.Scanner;
public class CWH_19_Ch4_practice_set {
    public static void main(String[] args) {

        // Question 1:
        /*
        int a = 10; // it is a error because of '=' is the assignment operator and in the if we can not able to
                    // use assignment operators in the if. (and that condition '==' is use because of it is the conditionals operators.
        if (a=11){
            System.out.println("I am 11");
        }
        else {
            System.out.println("I am not 11");
        }
        */


        // Question 2:
        // Get the input form user of 3 subjects and show it you are pass or fail.
        Scanner sc = new Scanner(System.in);
        byte m1,m2,m3;
        System.out.print("Enter Your marks in physics: ");
        m1 = sc.nextByte();

        System.out.print("Enter Your marks in Chemistry: ");
        m2 = sc.nextByte();

        System.out.print("Enter Your marks in Maths: ");
        m3 = sc.nextByte();

        float percentage = (m1+m2+m3)/3.0f;
        System.out.println("Your Percentage is %f: "+percentage);

        if (percentage>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations, you have been promoted");
        }
        else {
            System.out.println("Sorry, You have not been promoted! Better luck next time");
        }

    }
}
