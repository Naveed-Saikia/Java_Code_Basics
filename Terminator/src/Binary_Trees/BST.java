package Binary_Trees;
import java.util.*;;

public class BST {
	Node Root;
	class Node{
		int val;
		Node Left;
		Node Right;
		int Height;
		
		Node(int value){
			this.val=value;
		}
		
		Node(int val,Node l,Node r){
			this.val=val;
			this.Left=l;
			this.Right=r;
		}
	}
	
	public int getHeight(Node a) {
		if(a==null) {
			return -1;
		}
		return a.Height;
	}
	
	public boolean isEmpty(Node a) {
		return a==null;
	}
	
	public void Root(Scanner sc) {
		System.out.println("Enter The Value of root Node:---");
		int val=sc.nextInt();
		Root=new Node(val);
		insertion(Root,sc);
	}
		
	
	public void insertion(Node a,Scanner sc) {
		System.out.println("Want to insert more  values:--");
		boolean isAnswer=sc.nextBoolean();
		if(!isAnswer) {
			return;
		}
		System.out.println("Enter the value to be inserted:-- ");
		int val=sc.nextInt();
		Node temp=new Node(val);
		
		if(val<a.val) {
			a.Left=temp;
			insertion(temp,sc);
		}
		else {
			a.Right=temp;
			insertion(temp,sc);
		}
		
		
}
	public void display(Node node) {
		if(node==null) {
			return;
		}
		System.out.print(node.val+ "\t");
		display(node.Left);
		display(node.Right);
	}
	
	
	public static void main(String[] args) {
		BST tree=new BST();
		Scanner sc=new Scanner(System.in);
		tree.Root(sc);
		System.out.println("Tree traversal is---- ");
		tree.display(tree.Root);
		
	}
}
