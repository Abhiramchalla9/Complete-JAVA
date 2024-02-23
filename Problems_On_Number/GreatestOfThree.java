package Problems_On_Number;
import java.util.*;
public class GreatestOfThree {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number :");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number :");
        int n2 = sc.nextInt();
        System.out.println("Enter the three number :");
        int n3 = sc.nextInt();

        int max = Math.max(n1 ,Math.max(n2 , n3));
        System.out.println("The largest number among the three numbers is "+max);
        sc.close();
    }
    
}
