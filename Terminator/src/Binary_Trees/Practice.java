package Binary_Trees;
import java.util.*;



public class Practice {
	Node root=null;
	static class Node{
		int value;
		Node Left;
		Node Right;
		int Height;
		
		Node(int val){
			this.value=val;
		}
	
		public int getValue() {
			return value;
		}
	}
		public Node insert(Scanner sc) {
			System.out.println("Enter the root value:-- ");
			int val=sc.nextInt();
			if(root==null) {
				Node newnode=new Node(val);
				root=newnode;
			}
			return insert(root,sc);
			
		}
		public Node insert(Node node,Scanner sc) {
			System.out.println("Do you want to enter left value of " + node.value + "? (true/false)");
	        boolean isLeft = sc.nextBoolean();
	        if (isLeft) {
	            System.out.println("Enter left value of " + node.value + ":");
	            int val = sc.nextInt();
	            Node leftNode = new Node(val);
	            node.Left = leftNode;
	            insert(leftNode,sc);
	        }

	        System.out.println("Do you want to enter right value of " + node.value + "? (true/false)");
	        boolean isRight = sc.nextBoolean();
	        if (isRight) {
	            System.out.println("Enter right value of " + node.value + ":");
	            int val = sc.nextInt();
	            Node rightNode = new Node(val);
	            node.Right = rightNode;
	            insert(rightNode,sc);
	        }
	        
	        return node;
					
		}
		
		public void display(Node node) {
			if(node==null) {
				return;
			}
			System.out.print(node.value +" ");
			display(node.Left);
			display(node.Right);
		}
		public static void main(String[] args) {
			Practice BT=new Practice();
			Scanner sc=new Scanner(System.in);
			BT.insert(sc);
			BT.display(BT.root);
			
			
		}
		
	}
	
