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


    }
}
