package Problems_On_Number;
import java.util.*;

public class GCD {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number :");
        int a = sc.nextInt();
        System.out.println("Enter the second number :");
        int b = sc.nextInt();

        int g = 0; 
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0){
                System.out.println(i);
                g=i;
            }                              
        }
        System.out.println("The highest common factor is :"+g);
        
    }
    
}
