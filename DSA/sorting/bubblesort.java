package sorting;
import java.util.Scanner;

public class bubblesort{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in an array :");
        int n = sc.nextInt();

        System.out.println("Enter the elements in an array :");
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                
            }

        }
        System.out.println("Sorted array:");
        for(int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
        }

    }
}