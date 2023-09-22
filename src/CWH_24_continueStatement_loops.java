public class CWH_24_continueStatement_loops {
    public static void main(String[] args) {

        // Continue is use withe for loop.
        for (int i=0; i<50; i++){
            if (i == 5){
                System.out.println("Ending the loop 5");
                continue; // continue is skip the value 5 and continue to forward the loop.
            }
            System.out.println("java is great "+i);
        }
    }
}
