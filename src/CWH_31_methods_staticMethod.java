public class CWH_31_methods_staticMethod {
    static int logic(int x , int y){  // static method is use because of we can only able to use static method under a another static method.
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
        c = logic (a,b);  // call the method and interchange the value.
        System.out.println(c);

        // Example 2
        int p = 34343;
        int q = 54543;
        int r;
        r = logic(p,q);
        System.out.println(r);

    }
}
