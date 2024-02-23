package Problems_On_Number;
import java.util.*;
public class PerfectNumberCheck {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int n = sc.nextInt();

        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum = sum+i;
            }
        }
        if(sum==n){
            System.out.println("It is a perfect num !");
        }
        else{
            System.out.println("It is not a perfect number");
        }
    }
}
