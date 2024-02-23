package Problems_on_Arrays;

import java.util.Scanner;

public class AverageOfArray {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers");
        int n = sc.nextInt();

        System.out.println("Entering the elements into the array:");
        int[] arr = new int[n];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum = sum+i;
        }
        float avg = (float)sum/n;
        System.out.println("Average of the elements is:"+avg);
        sc.close();
    }
    
}
