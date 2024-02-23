package binarytree;
import java.util.Scanner;

public class sizetree {
	
	static Scanner sc = null;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		Node root = createTree();
        System.out.println("Size of the tree is " + sizetree(root));
		
	}
	
	static Node createTree() {
		
		Node root = null;
		System.out.println("Enter data: ");
		int data = sc.nextInt();
		
		if(data == -1) return null;
		
		root = new Node(data);
		
		System.out.println("Enter left for " + data);
		root.left = createTree();
		
		System.out.println("Enter right for "+ data);
		root.right = createTree();
		
		return root;
	}
	
    static int sizetree(Node root){
        if(root==null){
            return 0;
        }
        else{
            int leftsize = sizetree(root.left);
            int rightsize = sizetree(root.right);
            return leftsize + rightsize + 1;
        }
    }
	
}

class Node {
	Node left, right;
	int data;
	
	public Node(int data) {
		this.data = data;
	}
}
