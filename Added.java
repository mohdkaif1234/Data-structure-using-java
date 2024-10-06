import java.util.Scanner;

public class Added {
    public static void main(String[] args) {
        System.out.println("enter a first number ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter the 2nd number");
        Scanner bc= new Scanner(System.in);
        int b = bc.nextInt();
        int c;
        c = a+b;
        System.out.println("result" +c);

        if( a % 2 == 0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");

        }
        int i = 0;
        int count = 0;
        for(i=0; i<a ; i++) {
            count++;
        }
        if(a%2 == 0){
            System.out.println(count);
        }


    }
}
