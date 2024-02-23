package binarytree;
import java.util.Scanner;
public class height {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        sc = new Scanner(System.in);

        Node root = createTree();
        System.out.println("Height of the tree"+caluclateHeight(root));
    }
    static Node createTree(){
        Node root = null;
        System.out.println("Enter the data :");
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        root = new Node(data);

        System.out.println("Enter left for " + data);
		root.left = createTree();
		
		System.out.println("Enter right for "+ data);
		root.right = createTree();
		
		return root;

    }
    static int caluclateHeight(Node root){
        if(root == null){
            return 0;
        }
        else{
            int leftHeight = caluclateHeight(root.left);
            int rightHeight = caluclateHeight(root.right);  
            return Math.max(leftHeight,rightHeight) + 1;
        }

    }
}
class Node{
    Node left,right ;
    int data;
    public Node(int data){
        this.data=data;
    }
}
