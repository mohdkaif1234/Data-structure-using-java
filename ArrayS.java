import java.util.*;
public class ArrayS {
    public  void matrixSorted( int [] [] matrix, int r , int c){
        int i , k=0, l=0;
        while(k<r && l<c){
            for (i=l; i<c; i++){
                System.out.print(matrix[k][i] +" ");
            }
            k++;
            for (i=k; i<r; i++){
                System.out.println(matrix[r-1][i] +" ");
            }
            r--;
        }

    }


    public static void main(String[] args) {
        int [] [] matrix = { {1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 15, 16} };
        ArrayS ar = new ArrayS();
        ar.matrixSorted(matrix,4,4);
    }
}
