import java.util.Scanner;
public class ArrayUtil {
    public void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo(){
        int [] myArray = new int[5];
        myArray[0]=5;
        myArray[1]=1;
        myArray[2]=8;
        myArray[3]=2;
        myArray[4]=10;
        myArray[2]=9;
        printArray(myArray);
        System.out.println(myArray.length);
        System.out.println(myArray[myArray.length-1]);
    }

    public static void main(String[] args) {
        ArrayUtil arrUtil = new ArrayUtil();
        arrUtil.arrayDemo();
    }
}
