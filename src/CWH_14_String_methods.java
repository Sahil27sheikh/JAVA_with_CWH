import java.util.Scanner;
public class CWH_14_String_methods {
    public static void main(String[] args) {

        // (1) Length method in Strings.
        String name = "Sahil Is The Good Boy";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);
        // the length method is use to define the length of the string.
        // length method is start form zero to infinite. (ex:- 0,1,2,3,4,5,....)
        // length method is also read the white spaces between the strings.
        // Output:- Sahil Is The Good Boy


        // (2) toLowerCase method of strings.
        String lString = name.toLowerCase();
        System.out.println(lString);
        // the toLowerCase is use to transform the full string in to the order of lower case.
        // Output:- sahil is the good boy  [ All the character of string in lower case.]


        // (3) toUpperCase method of strings.
        String uString = name.toUpperCase();
        System.out.println(uString);
        // the toLowerCase is use to transform the full string in to the order of upper case.
        // Output:- SAHIL IS THE GOOD BOY  [ All the character of string in upper case.]


        // (4) trim method of strings.
        // Example 1
        String nonTrimString = "   chance   ";
        // System.out.println(nonTrimString); // if trim method is not use it print the spaces also.

        // the trim method is use for delete the extra spaces of the string before and after only.

        // After trim string method is use:
        String trimString = nonTrimString.trim();
        System.out.println(trimString);
        // Output:- chance


        //Example 3
        String non = "    No More     Chance    in   the   game       ";

        String yes = non.trim();
        System.out.println(yes);
        // Output:-No More     Chance    in   the   game  // no space before and after the string.


        // (5) substring(int start) method.
        // Example 1
        String a ="What is mean by String";
        String b = a.substring(10);
        System.out.println(b);
        // the substring is print the string form the number you define to the end of the string.
        // the numbering is start form "0 to end of the string."
        // Output:- an by String

        // Example 2
        String c = a.substring(17);
        System.out.println(c);
        // Output:-tring


        // (5) substring(int start, int end) method.
        // Example 1
        String d ="Google is the company name";
        String e = d.substring(5,15);
        System.out.println(e);
        // in this method you can able to print the string then to then.
        // in this method the starting is the print but the ending is not print it is print only before the end.
        // Output:- e is the c   // in this example "e means 5 to c means before the 15".

        // Example 2
        System.out.println(d.substring(1,19));
        // Output:- oogle is the compa


        // (6) replace method.

        // Character replace method

        // Example 1
        String f = "Who is Sahil";
        String g = f.replace('s','t');
        System.out.println(g);
        // in this replace method the string is replace the character of the string.
        // in this example it replace only first word character of the string "is" is replace in to "it"
        // no "Sahil" is replace in to "Tahil" because of JAVA is the case sensitive language "s" and "S" is different.
        // Output:- Who it Sahil

        // Example 2
        String h = "noooo more chocklets";
        System.out.println(h.replace('o','e'));
        // Output:- neeee mere checklets


        // Substring replacement method
        // Example 1
        // this method of the replacement is use for replace the substring. and it is write under " " .
        String i= "sahil is the bad boy than harry";
        System.out.println(i.replace("sahil","Pagal"));
        // Output:- Pagal is the bad boy than harry

        // Example 2
        System.out.println(i.replace("ha","be"));
        // Output:- sahil is the bad boy tben berry

        // Example 3
        System.out.println(i.replace("a","Toy"));
        // Output:- sToyhil is the bToyd boy thToyn hToyrry


        // (7) starts with and Ends with method of strings
        // Example 1
        // starts with:
        // this method is return the booleans as true and false.
        // this method check the string starts with and return the answer in true and false.
        String j = "the sum of the number 2 and 3 is 5";
        System.out.println(j.startsWith("the"));
        // Output:- true
        System.out.println(j.startsWith("dff"));
        // Output:- false

        // Ends With:
        System.out.println(j.endsWith("5"));
        // Output:- true
        System.out.println(j.endsWith("the"));
        // Output:- false


        // Example 2
        // Starts with and Ends With method using scanner for user input
        // Starts with
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Hear: ");
//        String k = sc.nextLine();
//        System.out.println(j.startsWith(k));

        // Ends With:
//        System.out.print("Enter Hear: ");
//        String abc = sc.nextLine();
//        System.out.println(j.endsWith(k));


        // Example 3
        // Starts With
//        System.out.print("Enter Your String Hear: ");
//        String l = sc.nextLine();
//        System.out.print("Enter Starts With Substring Or Character Hear: ");
//        String m = sc.nextLine();
//        System.out.print("Your Answer is: ");
//        System.out.println(l.startsWith(m));

        // Ends With
//        System.out.print("Enter Starts With Substring Or Character Hear: ");
//        String n = sc.nextLine();
//        System.out.print("Your Answer is: ");
//        System.out.println(l.endsWith(m));


        // charAt method of string
        // Example 1
        String o = "Number of the gift are 6";
        System.out.println(o.charAt(5));
        // Output:- r





    }
}