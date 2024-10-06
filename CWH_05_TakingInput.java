import java.util.Scanner;
public class CWH_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking inpiut from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        System.out.println("enter number 2");
        int a = sc.nextInt();
        System.out.println("enter number 2");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("the sum of these number");
        System.out.println(sum);

    }
}
