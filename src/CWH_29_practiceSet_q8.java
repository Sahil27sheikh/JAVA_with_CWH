public class CWH_29_practiceSet_q8 {
    public static void main(String[] args) {
        // write a java programme to find whether an array is sorted or not.

        boolean isSorted = true;
        int [] b = {1,2,3,4,5};
        for (int i =0; i< b.length-1; i++){
            if (b[i] > b[i+1]){
               isSorted = false;
               break;
            }
        }
        if (isSorted){
            System.out.println("The array is sorted.");
        }
        else {
            System.out.println("The array is not sorted.");
        }
        // Output: The array is sorted.


        boolean is = true;
        int [] a = {1,45, 65, 23, 2};
        for (int i =0; i< a.length-1; i++){
            if (a[i] > a[i+1]){
               is = false;
               break;
            }
        }
        if (is){
            System.out.println("The array is sorted.");
        }
        else {
            System.out.println("The array is not sorted.");
        }
        // Output: The array is not sorted.
    }
}
