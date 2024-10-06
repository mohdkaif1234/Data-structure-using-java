import java.util.Scanner;

public class numberTable {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int fact= 1;
        // for (int i=1 ; i<=10; i++){
        //     System.out.println(a*i +" ");
        // }
      {
            for (int i  = 1; i <= a; i++) {

                    fact= fact*i;
                System.out.println("facttorial of a number" +fact);
                }

            }
        }
}

