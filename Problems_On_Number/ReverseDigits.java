package Problems_On_Number;
import java.util.*;

public class ReverseDigits {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int n = sc.nextInt();

        int res = 0;
        while(n>0){
            int temp = n % 10;
            res = res * 10 + temp;
            n = n / 10;
        }
        System.out.println("The reversed number is " + res);
    }    
}
