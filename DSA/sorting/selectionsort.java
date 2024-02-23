package sorting;

import java.util.Scanner;

public class selectionsort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in an array:");
        int n = sc.nextInt();

        System.out.println("Enter the elements in an array:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

       
        for (int i = 0; i < n - 1; i++) { 
            int minIndex = i;
            for (int j = i + 1; j < n; j++) { 
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            
        }

        
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}