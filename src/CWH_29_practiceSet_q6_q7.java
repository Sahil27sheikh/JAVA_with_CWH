public class CWH_29_practiceSet_q6_q7 {
    public static void main(String[] args) {
        // find the maximum value of the array;
        int [] a = {1,4,78,67, 88, 84764654,22};
        int max = Integer.MIN_VALUE; // Integer.MIN_VALUE; is use to minimum value of the integer in java
        for (int e :a){
            if (e>max){
                max=e;
            }
        }
        System.out.println("The value of the maximum element is: "+max);


        // find the minimum value of the element of the array.
        int [] b = {4,66,34,2, 65,55};
        int min = Integer.MAX_VALUE; // Integer.MAX_VALUE; is use to maximum value of the integer in java
        for (int element: b){
            if (element<min){
                min= element;
            }
        }
        System.out.println("The minimum value of the element of the array is: "+min);
    }
}
