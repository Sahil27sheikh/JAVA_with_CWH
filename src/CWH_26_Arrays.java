public class CWH_26_Arrays {
    public static void main(String[] args) {
        /*
        Classroom of 500 students - you have store marks if 500 students
        You have two options;
        1) Create 500 variables
        2) Use Arrays (recommended)
        */
        // Basis structure to create new Arrays.

        // first type to write arrays.
        // Declaration and memory allocation.
        // int [] marks = new int[5];

        // Second type to write arrays.
        // Declaration and then memory allocation.
        // int [] marks;
        // marks = new int[];
        /*
        marks[0] = 100; // This is the Array element.
        // Initialization.
        marks[1] = 10;
        marks[2] = 56;
        marks[3] = 99;
        marks[4] = 30;
        marks[4] = 20; // We can also able to overwrite the arrays.
        //  marks[5] = 38; // Throws an error
        */

        // Third type to writhe the arrays
        // Declaration, memory allocation and initialization together
        int [] marks = {100, 10, 56, 99, 30};


        System.out.println(marks[2]); // to print the Arrays
    }
}
