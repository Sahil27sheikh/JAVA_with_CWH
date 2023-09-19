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


        // Question 3:
        // Calculate the income tax of the employ of government as per sales mentioned below.
        System.out.println("Enter Your Income: ");
        float income = sc.nextFloat();
        float tax = 0;
        if (income<=2.5){
            tax = tax + 0;
        }

        else if (income>2.5f && income<=5f) {
            tax = tax + 0.05f * (income - 2.5f);
        }

        else if (income>5f && income<=10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5.0f);
        }

        else if (income>10f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }

        System.out.println("The total tax paid by employ is: "+tax);


        // Question 4:
        // find the day of weak using given the number.
        System.out.print("Enter The Number: ");
        int day = sc.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Sorry, You Have Entered Wrong Number!");
        }

        // Question 5
        // calculate the year is leap year or not.
        System.out.println("Enter The Year: ");
        int year= sc.nextInt();
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {

            System.out.println(year +" Is The Leap Year");
        }

        else {
            System.out.println(year +" Is Non - Leap Year");
        }


        // Question 5
        // find out the type of the website at the base of url
        System.out.print("Enter the url hear: ");
        String url = sc.next();
        if (url.endsWith(".com")){
            System.out.println("This website is \"Commercial Website\"");
        }

        else if (url.endsWith(".org")) {
            System.out.println("This website is \"Organization Website\"");
        }

        else if (url.endsWith(".in")) {
            System.out.println("This website is \"Indian Website\"");
        }

        else {
            System.out.println("You Are Entered Wrong Website");
        }

    }
}
