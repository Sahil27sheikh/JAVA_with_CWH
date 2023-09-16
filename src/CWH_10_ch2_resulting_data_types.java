public class CWH_10_ch2_resulting_data_types {
    public static void main(String[] args) {

        // Resulting Data Type:
        /*
        int a = 664;
        float b = 7;
        double y = a * b;
        System.out.println(y);
         */


              // Increment And Decrement operators:
        /*
        a++ is the increment operator
        b-- is the decrement operator

        (
         a++ is first use the value and then increment.
         ++a is first increment the value and then use.
         )
         */

        // Quick Quiz-1:

        // Increment operators
        /*
        int a = 5;
        System.out.println(++a); // first a is Increment (6) and then use or print.
        System.out.println(a); // (easily print 5)
        System.out.println(a++); // first a is use and then Increment (5)
        */


        // Decrement Operators
        int a = 5;
        System.out.println(--a); // first a is Decrement (4) and then use or print.
//        System.out.println(a); // (easily print 4)
//        System.out.println(a--); // first a is use and then Decrement (5)

//        Quick Quiz-2:
//        ( What is the value of following equation )

        int y = 7;
        int x = ++y *8; // the precedence of ++ is greater then *. hence the ++y is first evaluate and then it is multiply by 8
        System.out.println(x);

        // Increment and Decrement in Char.
        char z = 'A';
        System.out.println(++z); // the value of character is increase and print as 'B'
        System.out.println(--z); // the value of character is not a increase and not a decrease.

        char p = '$';
        System.out.println(++p); // the value of character is increase and print as '%'
        System.out.println(--p); // the value of character is not a increase and not a decrease.
    }
}
