public class ArrayResize {
    public void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public void resize(int[] arr , int capacity){
        int[] temp = new int[capacity];
        for(int i=0; i< arr.length; i++){
            temp[i]=arr[i];
        }
        temp =arr;
    }

    public static void main(String[] args) {
        ArrayResize arrayResize = new ArrayResize();
        arrayResize.printArray(new int[]{5, 9, 3,10});
        int [] original = new int[]{5, 9, 3, 10};
        System.out.println(" The size of original array - "+ original.length);
        arrayResize.resize(original,10);
        System.out.println("The size of original array resize -"+ original.length);
    }
}
