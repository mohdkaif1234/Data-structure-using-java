import java.util.Scanner;

public class aramstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number check if it is aramstrong or not");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        int count = 0;
        while(temp >0){
            count ++;
            temp /=10;
        }
        temp =n;
        while (temp >0){
            int rem = temp %10;
            sum +=(int)Math.pow(rem, count);
            temp/=10;
        }
        if(sum == n){
            System.out.println(n+ " is an Aramstrong number");
        }else{
            System.out.println(n+ " is not an Aramstrong number");
        }
    }
}
