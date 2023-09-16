import java.util.Scanner;
public class CWH_Ch2_Practice_set {
    public static void main(String[] args) {
        Scanner sahil = new Scanner(System.in);

        /*
        Pr-1 ( float a= 7/4 * 9/2)
        float a = (7/4.0f) * (9/2.0f);
        System.out.println(a);
        */

        /*
        pr-2
        Write a given java program to encrypt a given grade vy adding 8 to it. decrypt is to show the correct grade.

        char grade = 'B';
        grade = (char)(grade + 8);  // char is use because of the value of character and integer is integer. when we use
                                     // char on grade it is forcefully return char.
        System.out.println(grade);  // it print "j" because of B+8=J

        grade = (char)(grade - 8);
        System.out.println(grade);  // it print "b" because of J-8=B
        */

        /*
        pr-3
        Use comparison operators to find out weather a given number is greater than the user entered number or not.

        System.out.print("Enter the number: ");
        int a = sahil.nextInt();
        System.out.print(a>8);
        */

        /*
        pr-4
        writhe the following expression in a given program (v square - u square / 2as

        double a=1;
        double s=2;
        double v=3;
        double u=4;

        double k= ((v*v) - (u*u))/(2*(a*s));
        System.out.println(k);
        */

        /*
        pr-5
        Find the value of "a" in the  following equation.
         */
        int x=7;
        int a = 7*49/7 + 35/7;
        System.out.println(a);
    }
}
