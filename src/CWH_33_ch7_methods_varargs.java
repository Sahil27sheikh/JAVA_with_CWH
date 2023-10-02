public class CWH_33_ch7_methods_varargs {

    // it is the varargs method in java which is solve the problem to create multiple methods for the same functionality.
    // it is get the all values in the form of array.
    static int sum (int ...arr){
        int result = 0;
        for (int e:arr){
            result += e;
        }
        return result;
        }

    static int summing (int x, int ...adding){
        int res = x;
        for (int element:adding){
            res += element;
        }
        return res;
    }

    public static void main(String[] args) {
        // The sum method is run in at all of this.
        System.out.println("The sum of the value of the 4 and 89 is: "+sum(4,89));
        // Output: The sum of the value of the 4 and 89 is: 93

        System.out.println("The sum of the value of the 4,67 and 89 is: "+sum(4,67,89));
        // Output: The sum of the value of the 4,67 and 89 is: 160

        System.out.println("The sum of the value of the 4, 67, 89 and 89 is: "+sum(4,67,89,89));
        // Output: The sum of the value of the 4, 67, 89 and 89 is: 249

        System.out.println("The sum of the value of the 4, 200,651,787 and 89 is: "+sum(4,200, 651,787,89));
        // Output: The sum of the value of the 4, 200,651,787 and 89 is: 1731

        System.out.println("The sum of the value of the 4, 200,651,787 and 89 is: "+sum(4)); // only one value
        // Output: The sum of the value of the 4, 200,651,787 and 89 is: 4

        System.out.println("The sum of the no value is: "+sum()); // empty
        // Output: The sum of the no value is: 0
        // if you have not entered the any value in the sum it is print "0" because nothing is present in the method.



        // minimum one argument is important example

        System.out.println("The sum of the value of the 4, 200,651,787 and 89 is: "+summing(4)); // only one value
        // Output: The sum of the value of the 4, 200,651,787 and 89 is: 4

        // System.out.println("The sum of the value of the 4, 200,651,787 and 89 is: "+summing()); // empty
        // it is throws the error because of minimum one argument or the value of "x" in summing method is important.

        System.out.println("The sum of the value of the 4, 200,651,787 and 89 is: "+summing(4,200, 651,787,89));
        // Output: The sum of the value of the 4, 200,651,787 and 89 is: 1731



    }
}
