package Problems_On_Number;

import java.util.*;

public class PalindromeCheck {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want to check :");
        int n = sc.nextInt();

        int rev = 0;
        int dummy = n;
        while(n > 0){
            int temp = n%10;
            rev = rev*10+temp;
            n=n/10;
        }
        if(dummy == rev){
            System.out.println("It is a palindrome number !");
        }
        else{
            System.out.println("It is not a palindrome number :( ");
        }

    }
    
}
