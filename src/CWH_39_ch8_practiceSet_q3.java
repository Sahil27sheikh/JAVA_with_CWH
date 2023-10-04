import java.util.Scanner;
// Question 3
// Create a class square with a method to initialize its side, calculation area, perimeter etc..

class square{
    int side;
    public int area(){
        return side*side;
    }

    public int parameter(){
        return 4*side;
    }
}
public class CWH_39_ch8_practiceSet_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        square sq = new square();
        System.out.print("Enter the side: ");
        sq.side = sc.nextInt();

        System.out.println("The area of the square is: " +sq.area());
        System.out.println("The parameter of the square is: " +sq.parameter());


    }
}
