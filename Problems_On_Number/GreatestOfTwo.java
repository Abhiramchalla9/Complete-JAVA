package Problems_On_Number;
import java.util.*;
public class GreatestOfTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first num :");
        int n1 = sc.nextInt();
        System.out.println("Enter the second num :");
        int n2 = sc.nextInt();

        int max = Math.max(n1,n2);
        System.out.println("The largest number among these two is : "+max);
    }
    
}
