public class CWH_28_MultidimensionalArrays {
    public static void main(String[] args) {
       // int [] a = 1D arrays
       // int [] [] a = 2D arrays
       // int [] [] [] a = 3D arrays
       // int [] [] [] [] a = 4D arrays
       // And so on

        // Example:
        int [] [] flats = new int[2][3];
        // Access array:
        flats [0][0] = 101;
        flats [0][1] = 102;
        flats [0][2] = 103;
        flats [1][0] = 201;
        flats [1][1] = 202;
        flats [1][2] = 203;

        // Display 2D arrays
        for(int i=0; i< flats.length; i++){
            for (int j= 0; j<flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");  // Add the spaces between the value
            }
            System.out.println();  //Add new line after the one line is end
        }


    }
}
