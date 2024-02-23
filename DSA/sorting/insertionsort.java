package sorting;
import java.util.Scanner;

public class insertionsort{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in an array :");
        int n = sc.nextInt();

        System.out.println("Entering the elements in an array :");
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            int temp = arr[i];
            int j=i-1;
            while(j>0&&arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}