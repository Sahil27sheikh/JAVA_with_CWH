import java.util.Scanner;
// Question 3
// Create a class square with a method to initialize its side, calculation area, perimeter etc..

class rectangle{
    int length;
    int breath;
    public int area(){
        return length*breath;
    }

    public int parameter(){
        return 2*(length + breath);
    }
}
public class CWH_39_ch8_practiceSet_q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rectangle rect = new rectangle();

        // length
        System.out.print("Enter the length: ");
        rect.length = sc.nextInt();

        // breath
        System.out.print("Enter the breath: ");
        rect.breath = sc.nextInt();

        System.out.println("The area of the square is: " +rect.area());
        System.out.println("The parameter of the square is: " +rect.parameter());


    }
}
