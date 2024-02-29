package recursion;
import java.util.*;
public class TowerofHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disks:");
        int n = sc.nextInt();
        shiftDisks(n, 'A', 'B', 'C');
        sc.close();
    }

    public static void shiftDisks(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Disk 1 moved from " + source + " to " + destination);
        } else {
            shiftDisks(n - 1, source, destination, auxiliary);
            System.out.println("Disk " + n + " moved from " + source + " to " + destination);
            shiftDisks(n - 1, auxiliary, source, destination);
        }
    }
}
