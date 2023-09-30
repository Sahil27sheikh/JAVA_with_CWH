import java.util.Scanner;
public class CWH_32_methods_overloading {
    static void tellme(){  // void is use when nothing to return.
        System.out.println("Hii, I am  a sahil form umred city");
    }

    static  void change(int a){
        a = 45;
    }

    static  void change2(int []arr){
        arr[2] = 45;
    }


    // Method overloading.
    static void bro(){    // same name with no arguments.
        System.out.println("Good morning bro!");
    }

    static void bro(int m){   // Same name of method with arguments. and because of this reason java can not throw error.
        System.out.println("Good morning "+m+" times bro!");
    }

    static void bro(String a, int b){    // same name with parameter.
        System.out.println("Hi, "+a+" you won "+b+" rupees");
    }


    public static void main(String[] args) {

        // Example 1
        tellme();
        // output: Hii, I am  a sahil form umred city

        System.out.print("Who are you? ");tellme();
        // Output: Who are you? Hii, I am  a sahil form umred city

        // Example 2
        // Case 1: Changing the integer.
        int x = 68;
        change(x);
        System.out.println("The value of x after running change is: "+x);
        // The value can not be change it is pass the copy of the integer.

        // Case 2: Changing the Array.
        int [] c = {1,2,4,8,9};
        change2(c);
        System.out.println("the value of the array after use the change2 method is: "+c[2]);
        // The value is change because of the array and the objects is change.

        for (int element:c){
            System.out.print(element +" ");
            // Output: 1 2 45 8 9
        }
        System.out.println();


        // Method overloading
        // bro 1 method
        bro();
        // Output: Good morning bro!

        // bro 2 method
        bro(5000);
        // Output: Good morning 5000 times bro!

        // use bro method using user input.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        bro(sc.nextInt());


        // bro 3 method
        bro("Mohammad",15000);
        // Output: Hi, Mohammad you won 15000 rupees

        // using user input
        System.out.print("Enter the name: ");
        bro(sc.next(),10000);



    }
}

// Note: we can not able to use overloading by changing return type of methods.
//       we can able to use overloading by changing the parameters of methods.
