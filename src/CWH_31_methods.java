public class CWH_31_methods {
    static int logic(int x , int y){
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
        c = logic(p,q);
        System.out.println(c);

    }
}
