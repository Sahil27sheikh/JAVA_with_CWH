import java.util.Scanner;
public class CWH_35_ch7_practiceSet_q9 {

    // formula to convert Celsius to Fahrenheit:
    //  °F = (°C × 9/5) + 32
    static double fToc (double celsius){
        return (celsius * 9/5) + 32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the celsius number: ");
        double a = sc.nextDouble();
        double b = fToc(a);
        System.out.printf("The value of %.2f celsius to fahrenheit is %.2f",a,b);
    }
}
