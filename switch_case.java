import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        System.out.println("enter first number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        System.out.println("enter your choice ");
        System.out.println("1 .  Addition");
        System.out.println("2. prime number ");
        System.out.println("3. even number");
        int ch = sc.nextInt();
        int c;
        int j;
        int i;
        int count = 0;

        switch (ch) {
            case 1:
                System.out.println("addition ");
                c = a + b;
                System.out.println(c);

            case 2:
                System.out.println("prime number ");
                for (i = 0; i <= a; i++) {
                    count = 0;
                    for (j = 2; j < i; j++) {
                    }
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 0 && i != 1) {
                    System.out.println("prime number " + i);
                } else {
                    System.out.println("not a prime number " + i);
                }
            case 3:

                if (a % 2 == 0) {
                    System.out.println("even number");
                } else {
                    System.out.println("odd number");
                }
        }
    }

}
