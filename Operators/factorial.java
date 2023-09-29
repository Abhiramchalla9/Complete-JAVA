package Operators;
import java.util.Scanner;
//Write a Java program to find the factorial of a number using a while loop.
public class factorial {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int res=1;
        while (n>0){
            res=res*n;
            n--;
        }
        System.out.println(res);

    }
}
