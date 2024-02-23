package Problems_On_Number;
import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int n = sc.nextInt();

        int sumOfDigits = 0;
        while(n > 0){
            int temp = n % 10;
            sumOfDigits = sumOfDigits + temp;
            n = n / 10;
        }
        System.out.println("Sum of the Digits: " + sumOfDigits);
        sc.close();
    }
}
