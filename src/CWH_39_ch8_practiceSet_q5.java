// Question 5
// Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting) , running, firing etc..
class tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }

    public void run(){
        System.out.println("running form the enemy");
    }

    public void fire(){
        System.out.println("Fairing the enemy");
    }
}
public class CWH_39_ch8_practiceSet_q5 {
    public static void main (String []args){

        tommy player1 = new tommy();
        player1.fire();
        player1.run();
        player1.hit();

    }
}
