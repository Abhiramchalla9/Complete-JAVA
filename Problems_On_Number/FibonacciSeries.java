package Problems_On_Number;
import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n term");
        int n = sc.nextInt();
        System.out.println("Enter the first term");
        int firstterm = sc.nextInt();
        System.out.println("Enter the second term");
        int secondterm = sc.nextInt();

        System.out.println("Fibinacci series :"+firstterm+", "+secondterm);

        for(int i=2;i<n;i++){
            int nextterm = firstterm+secondterm;

            System.out.print(", "+nextterm);

            firstterm = secondterm;
            secondterm = nextterm;
        }
       System.out.println();
    }
    
}
