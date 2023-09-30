public class CWH_31_methods_callingMethod {

    // Another method to use methods in java.
    // calling a method
    int logic(int x , int y){  // static is not use in this method because of we can call the methods separately.
        int z;
        if (x>y){
            z = x+y;
        }
        else {
            z = (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {

        // Example 1
        int a = 5;
        int b = 7;
        int c;

        CWH_31_methods_callingMethod obj = new CWH_31_methods_callingMethod();   // Create a new syntax of method for use logic method.
        c = obj.logic (a,b);
        System.out.println(c);

        // Example 2
        int p = 34343;
        int q = 54543;
        int r;
        r = obj.logic(p,q);
        System.out.println(r);

    }
}

// Note: usually in java we can use static methods because it is easy to use.
