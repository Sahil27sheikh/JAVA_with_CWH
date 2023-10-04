import java.util.Scanner;
// question 6
// repeat question 4 for circle
class circle {
    double radius;

    public double area(){
        return Math.PI * radius * radius;
    }

    public double circumference(){
        return 2 * Math.PI * radius;
    }
}

public class CWH_39_ch8_practiceSet_q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circle cir = new circle();

        System.out.print("Enter the radius of the circle: ");
        cir.radius = sc.nextDouble();

        System.out.printf("The area of the circle with radius %.2f is %.2f\n",cir.radius,cir.area());
        System.out.printf("The circumference of the circle with radius %.2f is %.2f",cir.radius,cir.circumference());

    }
}
