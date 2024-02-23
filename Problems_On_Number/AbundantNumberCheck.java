package Problems_On_Number;
import java.util.*;

public class AbundantNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        int sumofdivisors=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sumofdivisors = sumofdivisors+i;
            }
        }
        if(sumofdivisors>n){
            System.out.println("It is an Abundant number !");
        }
        else{
            System.out.println("It is not a Abundant number");
        }
    }
    
}
