package Problems_On_String;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        int  n = str.length();
        int spaces = 0;

        for(int i=0;i<n;i++){
            if(str.charAt(i)==' '){
                spaces = spaces + 1;
            }
        }
        System.out.println("Number of words are ");
        System.out.println(spaces + 1);
    }
    
}
