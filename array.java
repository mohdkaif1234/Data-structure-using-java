import java.util.Scanner;
public class array {
    public static void main(String[] args) {

      /*  int [] marks = new int [5];
        marks [0] =  100;
        marks [1] = 60;
        marks [2] = 70;
        marks [3] = 67;
        marks [4] = 98;
        System.out.println(marks[2]);

       */
        //int [] marks  ={98 , 89, 45, 67, 70};
       /* float [] marks = {0.4f, 45.5f, 45f ,56.5f};
        String [] student = {"kaif", "harry" , "shubham" , "ajay"};
        System.out.println(marks[0]);

        System.out.println(student[0]);

        */
        int i=0;
        int [] marks  ={98 , 89, 45, 67, 70};
        System.out.println(marks.length);
        System.out.println(" printing using for loop in array");
        for(i=0;i< marks.length; i++){
            System.out.println(marks[i]);
        }

        for(  i =marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }

    }
}
