
// Writing a custom class
class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){ // create a new method in our custom class
        System.out.println("My name is: "+name);
        System.out.println("My ID is: "+id);
    }
    public int printSalary(){
        return salary;
    }
}

public class CWH_36_37_38_ch8_oops {
    public static void main(String[] args) {
        System.out.println("This is out custom class");
        Employee sahil = new Employee(); // Instantiating a new Employee Object.
        Employee john = new Employee();
        // Setting Attribute for sahil
        sahil.id = 23;
        sahil.name = "codeWithSahil";
        sahil.salary = 50000;
        int sahilSalary = sahil.printSalary();

        // Setting Attribute for john
        john.id = 29;
        john.name = "John Ibrahim";
        john.salary = 10000;
        int johnSalary = john.printSalary();

        // Printing the Attribute
        // System.out.println(sahil.id);
        // System.out.println(sahil.name);
        sahil.printDetails(); // print the details of sahil
        System.out.println("The salary of the sahil is: " +sahilSalary);
        john.printDetails();  // print the details of john
        System.out.println("The salary of the john is: " +johnSalary);
    }
}

// object oriented programming map the code to real world.
// it is make the code short and easy to understand.

// What is oops?
// Solving the problems by creating object is one of the most popular approach in programming
// is called Object Oriented Programming.

// What is DRY?
// DRY means Do Not Repeat Yourself.
// DRY is use to reduce the copy pest of the code and reduce the maintenance and size of code.

// Class:
// A class is a blueprint for creation Object.
// Classes is use to create the valid Objects.
// hence class is create the objects.
// The object and class is related to each other.
// the one class is create so many objects.

// Object:
// object is the real world entity created by the class.
// memory is allocated only after object is created or instantiation.

// How to model a problem in oops?
// We can find the Noun, Adjective and verbs in our problems.
// Example to know this-
// Noun -------------> Class -------> Employee
// Adjective --------> Attribute ---> name, age, salary of employee
// verb (Action) ----> Method ------> get salary (), increment ()

// OOPs terminology (most important):
// 1) Abstraction (hide internal details)
// Show only essential details
// Example:
// we can buy the phone. we see the look of the phone, display, buttons etc..
// but we can not se that how its phone features work how to create their features, how to create the phone on company etc..
// the most relative example of my thinking is the frontend part of the any website or web application is able to see form us but the
// backend part of this we can not able to see how its created how its work etc...

// 2) Encapsulation
// encapsulation means so many information or anything is store under a one box.
// Example:
// The so many vitamins and dead bacterias are combine together and make the one capsule and tablet.
// Example 2:
// laptop is the single entity with WiFy, speakers, storage, etc.. in a single box.
// with the use of encapsulation the software development in java is easy to use.

// 3) Inheritance
// The act of deriving new things form existing things.
// mens the use of old material we can create a new material.
// Example:
// Rickshaw to E-Rickshaw
// phone to smartphone
// The inheritance is implement the DRY! principle.

// Polymorphism (one entity many forms)
// Example:
// smartphone ---> phone,    smartphone ----> calculator,   smartphone ----> camera etc..




