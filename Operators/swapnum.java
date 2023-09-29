package Operators;
import java.util.Scanner;
public class swapnum {
    public static void main(String args[]){

        //Implement a Java program to swap two numbers without using a temporary variable.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a :");
        int a = sc.nextInt();

        System.out.println("Enter the value of b :");
        int b = sc.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("The values of a and b after swapped :");

        System.out.println(a);
        System.out.println(b);

    }
    
}
