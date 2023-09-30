package ControlFlow;

import java.util.Scanner;

public class prime {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of num :");
        int num = sc.nextInt();

        int count = 0;

        for(int i=2;i<num;i++){
            if(num%i==0){
                System.out.println("It is not a prime number");
                count = count+1;
                break;
            }
            if(count==0){
                System.out.println("It is a prime number");
            }
        }

    }
    
}
