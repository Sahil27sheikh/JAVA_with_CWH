import java.util.Scanner;

public class CWH_07_Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Best of luck for your percentage");
        // Input marks for five subjects
        System.out.print("Enter the marks of 1st subject: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the marks of 2nd subject: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the marks of 3rd subject: ");
        double c = scanner.nextDouble();

        System.out.print("Enter the marks of 4th subject: ");
        double d = scanner.nextDouble();

        System.out.print("Enter the marks of 5th subject: ");
        double e = scanner.nextDouble();

        double totalMarks = a+b+c+d+e;

        System.out.print("Enter the out of marks of total subjects: ");
        double outOf = scanner.nextDouble();

        double percentage = (totalMarks / outOf) * 100;

        System.out.println("Your total marks is: "+totalMarks);
        System.out.print("Your percentage is: "+percentage);

    }
}
