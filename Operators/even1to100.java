package Operators;
import java.util.Scanner;
//Implement a Java program to calculate the sum of all even numbers from 1 to 100.
public class even1to100 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        //Intializing the sum 
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                sum = sum+i;
            }
        }

        System.out.println(" The sum of the even numbers from 1 to 100 is :"+sum);
        
    }
    
}
