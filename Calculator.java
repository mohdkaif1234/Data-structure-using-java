
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.println(" enter an operator + , - , * , /");
        char operator = sc.next().charAt(0);
        System.out.println("enter the second number : ");
        double num2 = sc.nextDouble();
        double result ;
        switch (operator){
            case '+':
                result = num1 + num2;
                System.out.println(" the result is " +result);
                break;
            case  '-' :
                result = num1-num2;
                System.out.println(" the substraction  is : " +result) ;
                break;
            case  '*':
                result = num1*num2;
                System.out.println("the multiplication is : "+ result);
                break;
            case  '/' :
                if(num2 != 0) {
                    result = num1 / num2;
                    System.out.println("the division is : "+result);
                }else {
                    System.out.println("error  or not divisble ");
                    return;

                }
                break;
            default:
        }
    }
}
