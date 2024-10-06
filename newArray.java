public class newArray {
    public  void printArray(int[] arr){
        int n = arr.length;
        for (int i=0; i<n;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        newArray arrUtil = new newArray();
        arrUtil.printArray(new int[]{3,2 ,4,7,10,6,5});


    }
}
