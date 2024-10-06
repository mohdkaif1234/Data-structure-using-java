import org.w3c.dom.ls.LSOutput;

public class Matrix {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;

         int [][] matrix = new int[row][col];

         int value = 1 ;
         for (int i = 0; i< row ; i++){
             for (int j= 0; j<col; j++){
                 matrix[i][j] = value++;
             }
         }
         for ( int i = 0 ;i< row ; i++){
             for (int j= 0 ; j<col ; j++){
                 System.out.print(matrix[i][j] + "\t");
             }
            System.out.print("\n");
         }

    }

}