// Question 1:
// Create a class Employee with following properties and methods
// salary
// getSalary
// name
// getName
// setName

class Employee1{
    // Properties:
    int salary;
    String name;

    // Methods:
    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}
public class CWH_ch8_practiceSet_q1 {
    public static void main(String[] args) {
        // Question 1
        Employee1 sahil = new Employee1();
        sahil.setName("Sahil");
        sahil.salary = 55000;
        System.out.println("My Name Is: "+ sahil.getName());
        System.out.println("My Salary Is: "+ sahil.getSalary());

    }
}
