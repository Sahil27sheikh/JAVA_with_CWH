import java.util.Scanner;
public class CWH_29_ch6_practiceSet_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Question 1
        float [] f = {1.11f,2.2f,3.06f,4.78f,5.89f};
        float sum = 0;
        for (float element:f){
            sum = sum + element;
        }
        System.out.println("This is the sum of the float: "+sum);
        // Output: This is the sum of the float: 17.039999


        // Question 2
        int [] a = {1,3,5,45,23,534,23,1};
        System.out.print("Enter the number for check the value: ");
        int num = sc.nextInt();
        boolean isInArray = false;
        for (int i:a){
            if (num==i){
                isInArray= true;
                break;
            }
        }
        if (isInArray){
            System.out.println("The number is present in the array");
        }
        else {
            System.out.println("The number is not present in the array");
        }


        // Question 3
        int [] b = {23, 45, 23, 100, 23, 77};
        int total = 0;
        for (int i:b){
            total = total+i;
        }
        System.out.println("the average marks of the all students in the physics is: "+total/b.length +"%");


    }
}
