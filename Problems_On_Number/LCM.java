package Problems_On_Number;
import java.util.*;
public class LCM {

        static int gcd(int a,int b){

        int g = 1;
        for(int i=1;i<a;i++){
            if(a%i==0 && b%i==0){
                g=i;
            }
        }
        return g;
        }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first num :");
        int a = sc.nextInt();
        System.out.println("Enter the sec num :");
        int b = sc.nextInt();

        /*  lcm*hcf = a*b;
            lcm = (a*b)/hcf;
        */
        int result1 =  a*b;
        int result2 =  gcd(a,b);

        int lcm = (result1)/(result2);

        System.out.println("The Least common factor is "+lcm);
    }
    
}
