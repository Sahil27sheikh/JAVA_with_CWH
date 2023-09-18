public class CWH_17_logical_conditionals {
    public static void main(String[] args) {

        // Logical Operators:
        // && is AND (Both are True)
        System.out.println("For Logical AND");
        boolean a = true;
        boolean b = false;
        boolean c = true;

        if (a && b && c){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        // Output: NO

        // || is OR (One are True)
        System.out.println("For Logical OR");
        if (a || b || c){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        // Output: Yes // it is evaluate in Yes because of any one is true


        // ! is NOT
        // it is print the opposite value.
        // it is also known as inverter because it is invert the value.
        System.out.println("Not (a) is: "+!a);
        // output: Not (a) is: false   // it is print false because of the value of a is true.

        System.out.println("Not (b) is: "+!b);
        // output: Not (a) is: false   // it is print true because of the value of b is false.

    }
}
