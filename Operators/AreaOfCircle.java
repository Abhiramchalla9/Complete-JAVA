package Operators;
import java.util.Scanner;

//Write a program to calculate the area of a circle given its radius using the formula: area = π * r^2.
public class AreaOfCircle {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        double pie = 3.14;

        System.out.println("Enter the radius");
        int r = sc.nextInt();

        double area = pie*(r*r);

        System.out.println("The area of the circle is :"+area);
        



    }
    
}
