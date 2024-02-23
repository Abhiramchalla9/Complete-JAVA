package Problems_On_Number;
import java.util.*;
public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i + " ");
            }
                int count=0;
                for(int j=2;j<n;j++){
                if(n%j==0){
                    System.out.println("It is not a prime number");
                    count++;
                    break;
                }
                
            }
            if(count==0){
                System.out.println("It is a prime number");
            }
        }
        

        sc.close();
    }
    
}
