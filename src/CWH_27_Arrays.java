public class CWH_27_Arrays {
    public static void main(String[] args) {
        float [] marks = {89.5f, 45, 56.5f, 99.5f, 89f, 78.5f};

        // .length
        // .length is use to find the length of the arrays
        System.out.println("The length of the array is: "+ marks.length);
        System.out.println("The marks of the student is: "+ marks[5]);

        String [] students = {"Sahil", "Shahid", "Shubham", "Sohail", "Saddo", "Samir"};
        System.out.println("The length of the array is: "+ students.length);
        System.out.println("The marks of the student is: "+ students[5]);

        // The very simple method to display the array.
        System.out.println("Simple way to display the array: "+ marks[0]);
        System.out.println("Simple way to display the array: "+ marks[1]);
        System.out.println("Simple way to display the array: "+ marks[2]);
        System.out.println("Simple way to display the array: "+ marks[3]);
        System.out.println("Simple way to display the array: "+ marks[4]);
        System.out.println("Simple way to display the array: "+ marks[5]);


        // Display array using for loop.
        // in this method we can able to display array in only one or two line.
        for (int i=0; i<students.length; i++){
            System.out.println("Display array using for loop: "+marks[i]);
        }


        // Quick Quiz
        // Print the element of the array in reverse order.
        System.out.println("Quick Quiz - display array in reverse order");
        for (int i= marks.length -1; i>=0; i--){
            System.out.println("Quick quiz in reverse order: "+marks[i]);
        }


        // Very simple method to display the arrays in java.
        for (float element: marks){
            System.out.println("Very simple way to display array: "+element);
        }
    }
}
