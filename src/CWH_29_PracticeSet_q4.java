public class CWH_29_PracticeSet_q4 {
    public static void main(String[] args) {

        // print the 2D array and their sum.

//        int [][] mat1 = {{1,2,3},
//                        {4,5,6}};  // it is 2D array 2X3 matrix.
//
//        int [][] mat2 = {{7,9,12},
//                        {3,10,6}};
//
//        int [][] result = {{0,0,0},
//                          {0,0,0}};
//
//        for (int i=0; i<mat1.length; i++){  // 2 Row matrix
//            for (int j=0; j<mat1[i].length; j++){  // 3 Column matrix
//                System.out.format("Setting value for i=%d and j=%d\n",i,j);
//                result[i][j]= mat1[i][j] + mat2[i][j];
//            }
//        }
//        System.out.println("the sum result of these two matrix is:");
//        for (int i=0; i<mat1.length; i++) {
//            for (int j = 0; j < mat1[i].length; j++) {
//                System.out.print(result[i][j] + " ");
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//            System.out.println(); // print only new line.
//        }


        int [][] mat1 = {{23, 54, 98},
                         {45, 64, 24}};

        int [][] mat2 = {{23, 54, 98},
                         {45, 64, 24}};

        int [][] result = {{0, 0, 0},
                         {0, 0, 0}};

        for ( int i=0; i< mat1.length; i++){
            for (int j=0; j<mat1[i].length; j++){
                System.out.format("Setting value for i=%d and j=%d\n",i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        for ( int i=0; i< mat1.length; i++){
            for (int j=0; j<mat1[i].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
