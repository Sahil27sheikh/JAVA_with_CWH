public class CWH_26_Arrays {
    public static void main(String[] args) {
        /*
        Classroom of 500 students - you have store marks if 500 students
        You have two options;
        1) Create 500 variables
        2) Use Arrays (recommended)
        */
        // Basis structure to create new Arrays.
        int [] marks = new int[5]; // marks is the variable name.
        marks[0] = 100;
        marks[1] = 10;
        marks[2] = 56;
        marks[3] = 99;
        marks[4] = 30;
        marks[4] = 20; // We can also able to overwrite the arrays.
        System.out.println(marks[2]); // to print the Arrays
    }
}
