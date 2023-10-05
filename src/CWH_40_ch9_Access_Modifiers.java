
class myEmployee{
    private int id; // privet keyword is use for create privet.
    private String name;

    //getter for name.
    public String getName(){
        return name;
    }
    //setter for name.
    public void setName(String n){
        name = n;
    }

    //getter for id.
    public int getId(){
        return id;
    }
    //setter for id.
    public void setId(int i){
        id = i;
    }

}

public class CWH_40_ch9_Access_Modifiers {
    public static void main(String[] args) {
        myEmployee harry = new myEmployee();
        // harry.id = 45;  // We can not able to access privet access modifier
        // harry.name = "sahi"; -----> throws an error due to privet access modifier.

        // after use getter and setter privet access modifier is access like this.
        harry.setName("Harry is good");
        System.out.println(harry.getName());

        harry.setId(23);
        System.out.println(harry.getId());
    }
}
