public class CWH_24_breakStatement_loops {
    public static void main(String[] args) {
        // Break is use withe for loop.
        for ( int i= 0; i<50; i++){
            System.out.println("Java is great "+i);
            if(i==2){
                System.out.println("Ending the loop");
                break; // break is use to end the loop weather the condition is true or false.
            }
        }
        // output is print in only the order to 2.


        // Break is use withe while loop.
        int a = 0;
        while (a<50){
            System.out.println("java is great: "+a);
            if (a==5){
                System.out.println("Ending the loop");
                break;
            }
            a++;
        }


        // Break statement withe do while loop.
        int b = 1;
        do{
            System.out.println("Do While "+b);
            b++;
            if (b==10){
                System.out.println("Ending the loop");
                break;
            }
        }
        while (b<=100);
        System.out.println("loop end hear");
    }
}
