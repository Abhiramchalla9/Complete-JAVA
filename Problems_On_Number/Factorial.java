package Problems_On_Number;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        int res = 1;
        while(n>0){
            res = res * n;
            n--;
        }
        System.out.println("The factorial of a number is " + res);
        sc.close();
    }    
}
