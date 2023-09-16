public class CWH_13_ch3_Strings {
    public static void main(String[] args) {

        /*
        String name = new String("Sahil");
        // it was use to create new string but Java has special support of string we can able to use string as a datatype.
        System.out.println(name);
        */
//        String name = "Sahil ajaj sheikh"; // This type is use as a datatype
//        System.out.println(name);
        // Note: Strings are immutable means it can not able to change the string.

        // The new method of print.
        // 1st is print();
        // 2nd is println();
        // 3rd is printf();
        // 4th is format(); the format is same work as printf(); means format = printf

        // %d for int
        // %f for float
        // %c for char
        // %S for string

        int a = 4;
        float b = 1.2340f;
        System.out.printf("The value of a is %d and the value of b is %f",a,b);
        // in the output at the place of %d 4 is print and at the place of %f 3.434000 is print.

        System.out.format("The value of a is %d and the value of b is %.2f",a,b);
        // %.2f print only 2 character of point number.

        System.out.printf("The value of a is %d and the value of b is %10.2f",a,b);
        // 10 is usr for space of 10 character on output and .2 is print only 2 point numbers.

        char x = 'T';
        String y = "sahil ia good boy";
        System.out.format("the value of x is %c and the value of y is %S",x,y);
//        Note: the String is print in uppercase in order.
    }
}
