public class CWH_15_Ch3_Practice_Set {
    public static void main(String[] args) {

        // Question 1 (convert string in to lower case.
        String a = "My Name Is Sudha";
        a = a.toLowerCase();
        System.out.println(a);
        // Output: my name is sudha

        // Question 2 ( replace spaces with underscore )
        String b = "I Am Replace";
        b = b.replace(" ","_");
        System.out.println(b);
        // Output: I_Am_Replace

        // Question 3 (replace name)
        String c = "Dear <|name|>, Thanks a lot!";
        c = c.replace("<|name|>","Sahil");
        System.out.println(c);
        // Output: Dear Sahil, Thanks a lot!

        // Question 4 (Detect double and triple spaces
        String d = "This string  contain  double and   triple  spaces.";
        System.out.println(d.indexOf("  "));
        System.out.println(d.indexOf("   "));
        System.out.println(d.indexOf("    "));
        // Output: 11
        //         32
        //         -1



    }
}
