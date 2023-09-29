package Operators;
import java.util.Scanner;

//Create a program that determines whether a year entered by the user is a leap year or not.

public class leap {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int a = sc.nextInt();

    
        if((a % 4 ==0 && a % 100!=0) || (a%400==0)){
            System.out.println(a + " is a leap year ");
        }
        else{
            System.out.println(a + "is not a leap year");
        }


    }
    
}
