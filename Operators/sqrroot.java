package Operators;
import java.util.Scanner;

//Write a program that computes the square root of a given number using the Math.sqrt() method.

public class sqrroot {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of S :");
        double S = sc.nextDouble();

        double squareroot = Math.sqrt(S);

        System.out.println("The value of " + S + " squareroot is "+squareroot);
        
    }
    
}
