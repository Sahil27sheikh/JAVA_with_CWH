public class CWH_29_PracticeSet {
    public static void main(String[] args) {
        // Question 1;
        // Create the array of 5 floats and calculate their sum.
        float [] a = {22.5f, 10.4f, 34.6f, 50.34f, 45.4f};
        float sum = 0;
        for (float i:a){
            sum = sum+i;
        }
        System.out.println("the value of sum is: "+sum);
    }
}
