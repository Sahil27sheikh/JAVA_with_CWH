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

    }
}
