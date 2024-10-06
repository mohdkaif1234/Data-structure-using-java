import java.util.*;
import java.lang.ArrayIndexOutOfBoundsException;
import java.util.Arrays;
public class SquareofArray {

    public void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +"  ");
        }
        System.out.println();
    }

    public static int[] sortedSquares(int[] arr){
        int n =arr.length;
        int i=0;
        int j = n-1;
        int[] result = new int[n];

        for(int k=n-1; k>=0; k--){
            if (Math.abs(arr[i]) > Math.abs(arr[j]))    {
                 result[k] = arr[i]*arr[i];
                i++;
            }else {
                result[k] = arr[j]*arr[j];
                j--;
            }
        }
        return result;
    }
    public void arrayDemo(){
        int[] arr ={-4, -1, 0, 3, 10};
        int[] result =sortedSquares(arr);
        printArray(result);
    }
    public static void main(String[] args) {
        SquareofArray sq = new SquareofArray();
        sq.arrayDemo();


    }
}
