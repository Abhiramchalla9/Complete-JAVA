package Operators;
import java.util.Scanner;
//Create a program that accepts two integers and checks whether they are equal or not.
public class equalnot {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a :");
        int a = sc.nextInt();

        System.out.println("Enter the value of b :");
        int b = sc.nextInt();

        if(a==b){
            System.out.println("both a and b are equal");
        }
        else{
            System.out.println("a and b are not eqaul");
        }
    }
    
}
