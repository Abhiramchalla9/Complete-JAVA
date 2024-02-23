package Problems_on_Arrays;
import java.util.*;

public class FrequencyArray {
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of elements :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Entering the elements into an array :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if(arr[i] != -1){
                int count = 1;

                for(int j=i+1;j<n;j++){
                    if(arr[j]==arr[i]){
                        count++;
                        arr[j]=-1;
                    }
                }
                System.out.println("The frequency of"+arr[i]+"in the array is"+count);
            }
        }



    } 
}
