import java.util.Scanner;
public class CWH_29_PracticeSet {
    public static void main(String[] args) {
        // Question 1;
        // Create the array of 5 floats and calculate their sum.
        System.out.println("Question 1");
        float [] a = {22.5f, 10.4f, 34.6f, 50.34f, 45.4f};
        float sum = 0;
        for (float i:a){
            sum = sum+i;
        }
        System.out.println("the value of sum is: "+sum);


        // question 2
        // Write a programme to find out weather a Given integer is present in array or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Question 2");
        float [] b = {22.5f, 10.4f, 34.6f, 50.34f, 45.4f};
        System.out.print("Enter the number: ");
        float num = sc.nextFloat();
        boolean isInArray = false;
        for (float i:b){
             if (num==i){
                 isInArray = true;
                 break;
             }
        }
        if (isInArray){
            System.out.println("The value are present in the array");
        }
        else {
            System.out.println("The value are not present in the array");

        }


        // Question 3
        // Calculate the average marks of the array containing marks of all students in physics using for each loop.
        System.out.println("Question 3");
        float [] c = {22.5f, 10.4f, 34.6f, 50.34f, 45.4f};
        float total = 0;
        for (float i:c){
            total = total+i;
        }
        System.out.println("the average marks of the students is : "+total/c.length);
    }
}
