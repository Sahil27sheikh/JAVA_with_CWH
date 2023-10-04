// Question 2:
// Create a class cellphone with methods to print "ringing...", "vibrating..." etc

class cellphone{
    public void ring(){
        System.out.println("Ringing...");
    }

    public void vibrate(){
        System.out.println("Vibrating...");
    }

    public void call(){
        System.out.println("Calling...");
    }
}
public class CWH_39_ch8_practiceSet_q2 {
    public static void main(String[] args){
        cellphone s1pro = new cellphone();
        s1pro.call();
        s1pro.vibrate();
        s1pro.ring();

    }
}
