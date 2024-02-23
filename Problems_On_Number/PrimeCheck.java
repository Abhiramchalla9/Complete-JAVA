package Problems_On_Number;
import java.util.*;

public class PrimeCheck {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int n = sc.nextInt();

        int count = 0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("It is not a prime number ");
                count++;
                break;
            }
            if(count==0){
                System.out.println("It is a prime number !");
            }

        }
    }
}
