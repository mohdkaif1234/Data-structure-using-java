import java.util.Scanner;
public class Hotel_menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*******WELCOME TO REVOLUTION CAFE********** ");
        System.out.println("Enter the Number for Menu :");
        int menu = sc.nextInt();
        switch (menu){
            case 1:
                System.out.println("1. Chiken Tikka (RS. 353 half)");
                break;
            case 2:
                System.out.println("2. Mutton handi ( RS.1100)");
                break;
            case 3:
                System.out.println("3.paneer( RS. 120 half)");
                break;
            case 4:
                System.out.println("4.sahi paneer( RS.200 half)");
                break;
            case 5:
                System.out.println("5.Special Biryani(RS.  200 Full)");
                break;
            case 6:
                System.out.println("6. Nahari Kolcha (RS. 180 full)");
                break;
            default:
                System.out.println("Please choose valid number : ");
        }
        System.out.println("******THANK YOU  FOR COMING*******");
    }
}
