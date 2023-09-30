package ControlFlow;

 //Program to counting vowles,consonants,digits,spaces

public class vowconst {
   public static void main(String args[]){

        String line = "Java is a good programing language";
        int vowles = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

        //Converting the whole string into lowercase
        line = line.toLowerCase();
        int vowels =0;
        for(int i=0;i<line.length();i++){
            char ch = line.charAt(i);
        
            if(ch ==  'a' || ch  == 'e' || ch == 'i' || ch == 'o' || ch  == 'u'){
                ++vowels;
            }
            else if(ch >= 'a' && ch <= 'z'){
            ++consonants;
            }
            else if(ch >= '0' && ch<= '9'){
                ++digits;
            }
            else if(ch == ' '){
                ++spaces;
            }
        }
        
        System.out.println("vowels : " + vowels);
        System.out.println("consonants : " + consonants);
        System.out.println("digits : " + digits);
        System.out.println("spaces : " + spaces);


    }


}

    

