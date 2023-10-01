public class CWH_35_ch7_practiceSet_q6 {

    // Question 6:
    static int average(int ...n){
        if (n.length == 0){
            return 0;
        }
        int sum =0;
        for (int element: n){
            sum += element;
        }
        return sum/n.length;
    }

    public static void main(String[] args) {
        // Question 6:
        // write a function to find the average of a set of numbers passed as arguments using varargs.
        int avg = average(50,45,85,90,90,50);
        System.out.println(avg);

    }
}
