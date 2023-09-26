public class CWH_29_PracticeSet_q5 {
    public static void main(String[] args) {
        // Question 5
        // Write a java programme to reverse an array.
        int [] a = {1,2,3,4,5,6,7};
        int l = a.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for(int i=0; i<n; i++){
        // Explain using example
            // Swap a[i] and a[l-i-1]
            // a    b     temp
            //|3|  |4|     ||
            temp = a[i];
            a[i] = a[l-i-1];
            a[l-i-1] = temp;
        }
        for(int element: a){
            System.out.print(element + " ");
        }
        // Output: 7 6 5 4 3 2 1
    }
}
