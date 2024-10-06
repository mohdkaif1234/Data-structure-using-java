import java.util.Scanner;
public class chw {
    public static void main(String[] args) {
        int age ;
        System.out.println("Enter Your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
/*
        if(age>56){
            System.out.println("you are experinced");
        }
        else if(age >46){
            System.out.println("you are semi-experinced");
        }
        else if(age>36){
            System.out.println("you are semi-semi experince");
        }
        else{
            System.out.println("you are not experince");
        }

 */
        switch (age){
            case 18:
                System.out.println("you are to become adult");
                break;
            case 21:
                System.out.println("you are going to a job ");
                break;
            case 60:
                System.out.println("you are going to retire");
                break;
            default:
                System.out.println("enjoy your life ");
        }
        System.out.println("thank for using my java code");

    }
}
