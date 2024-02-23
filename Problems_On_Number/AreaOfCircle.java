package Problems_On_Number;

import java.util.*;

public class AreaOfCircle {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        int r = sc.nextInt();

        System.out.println("Caluclating the area of the circle :");
        double AreaCircle = 3.14*r*r;

        System.out.println(AreaCircle);

    }
}
