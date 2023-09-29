public class CWH_29_PracticeSet_q5 {
    public static void main(String[] args) {
        // Question 5
        // Write a java programme to reverse an array.
        int [] a = {1,2,3,4,5,6,7};
        int l = a.length;
        int n = Math.floorDiv(l, 2); // floorDiv is use for print the highest integer of the decimal.
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
        System.out.println();
        // Output: 7 6 5 4 3 2 1


        int [] b = {2,378,4,44556,68,75};
        int number = Math.floorDiv(b.length, 2);
        int temporary;
        for( int i=0; i<number; i++){
            temporary = b[i];
            b[i] = b[b.length - i -1];
            b[b.length - i - 1] = temporary;
        }
        for(int c:b){
            System.out.print(c +" ");
        }

    }
}
