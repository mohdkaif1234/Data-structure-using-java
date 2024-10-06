import java.util.*;
public class armast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number:");
        int n=sc.nextInt();
        int sum=0;
        int rem=1;
        int temp=n;
        while(temp !=0)
        {
            rem=temp%10;
            sum=sum+rem*rem*rem;
            temp=temp%10;
        }
    }
}
