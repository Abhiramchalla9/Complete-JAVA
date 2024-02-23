package Problems_On_Number;

import java.util.*;

public class PositiveNegativeCheck {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        if(n>0){
            System.out.println("It is a positive number");
        }
        else{
            System.out.println("It is a negative number");
        }
    }    
}
