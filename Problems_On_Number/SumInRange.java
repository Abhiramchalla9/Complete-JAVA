package Problems_On_Number;
import java.util.*;

public class SumInRange {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int n1 = sc.nextInt();
        
        System.out.println("Enter the second number");
        int n2 = sc.nextInt();

        int ans = (n2 - n1 + 1) * (n1 + n2) / 2;
        System.out.println("The sum of the numbers in the given range is: " + ans);
        sc.close();
    }
}
