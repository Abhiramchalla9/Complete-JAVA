package Problems_On_Number;
import java.util.*;

public class PowerOfNumber {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int n = sc.nextInt();

        System.out.println("Enter the power :");
        int p = sc.nextInt();

        int result = 1;
        while(p>0){
            result *= n;
            p--;
        }

        System.out.println("Result : "+result);
    
    }
}
