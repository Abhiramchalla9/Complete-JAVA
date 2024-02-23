package Problems_On_Number;

import java.util.*;
public class MaxMinDigitInNumber {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int n = sc.nextInt();

        int Max= Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;

        while( n > 0){
            int temp = n%10;
            Max = Math.max(Max , temp);
            Min = Math.min(Min , temp);
            n = n/10;
        }
        System.out.println("The Maximum Digit is"+Max);
        System.out.println("The Minimum Digit is"+Min);
        sc.close();
    }
}
