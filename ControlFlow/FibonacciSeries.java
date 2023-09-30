package ControlFlow;

import java.util.Scanner;

//Write a Java program that prints the Fibonacci series up to a given limit

public class FibonacciSeries {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        System.out.println("Enter the firstterm");
        int firstterm = sc.nextInt();

        System.out.println("Enter the secondterm");
        int secondterm = sc.nextInt();

        System.out.println("Fibonacci Series till " + n + " terms:");

        for(int i=1;i<=n;++i){
           
             System.out.print(firstterm + ", ");

            int nextterm = firstterm+secondterm;
            firstterm = secondterm;
            secondterm = nextterm;
            
        }
    }
    
}
