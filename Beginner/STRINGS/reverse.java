// reverse a string takes string as an input and returns the reversed string

import java.util.Scanner;
public class reverse{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the string :");

        String a = sc.nextLine();
        String rev=rev(a);
        System.out.print("the reversed string is : "+rev);
        sc.close();
    }

    static String rev(String input){
        String b = "";
        for(int i=input.length()-1;i>=0;i--){
            char c=input.charAt(i);
            b=b+c;
        }
        return b;
    }
}