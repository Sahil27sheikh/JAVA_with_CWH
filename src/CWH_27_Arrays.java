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
    }
}
