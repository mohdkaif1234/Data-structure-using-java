public class SortedMatrix {

    public void search(int [][] matrix , int n , int x) {
        int i = 0;
        int j = n-1;
        while (i<n && j>=0) {
            if(matrix[i][j]==x) {
                System.out.println("x found at - :" + i + " ," + j);
                return;
            }
            if(matrix[i][j] > x) {
                j--;
            }else {
                i++;
            }
        }
        System.out.print("not found ");

    }
    public void spiralPrint( int [][]  matrix , int r , int c){
        int i , k=0 , l=0;
        while (k<r && l<c){
            for (i=l; l<c ; i++){
                System.out.println(matrix[k][i]  + " ");
            }
            k++;
            for (i=k; i<r; i++){
                System.out.println(matrix[r-1][i] +" ");
            }
            r--;

           if(i<c) {
            for (i = r - 1; i >= k; i--) {
                System.out.println(matrix[i][r] + " ");
            }
            i++;
        }
        }
    }
    public static void main(String[] args) {
        int [][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 51}
                };
        SortedMatrix sm = new SortedMatrix();
        sm.search(matrix, matrix.length, 32);
        sm.spiralPrint(matrix,4,4);




        }

    }

