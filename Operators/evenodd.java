package Operators;
import java.util.Scanner;

//Create a program to check if a given number is even or odd.

public class evenodd {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a :");
        int a = sc.nextInt();

        if(a%2==0){
            System.out.println("It is a even number");
        }
        else{
            System.out.println("It is a odd number");
        }

        sc.close();

    }
    
}
