package Binary_Trees;
import java.util.*;

class Practice_BST{
	
	static Node root;
	public class Node{
		private int value;
		private Node Left;
		private Node Right;
		
		Node(int data){
			this.value=data;
		}
		int GetValue() {
			return this.value;
		
		}
	}
	
	void insert(int index, int[] arr) {
        for (int i = index; i < arr.length; i++) {
            root = insert(root, arr[i]);
        }
    }

    // Helper method to insert a value into the BST recursively
    Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.value) {
            node.Left = insert(node.Left, value);
        } else if (value > node.value) {
            node.Right = insert(node.Right, value);
        }
        return node;
    }
	 
	 
	 
	 void display(Node node) {
		 if(node==null) {
			 System.out.print("Null ");
			 return;
		 }
		 System.out.print(node.GetValue()+"--->");
		 display(node.Left);
		 display(node.Right);
		
	 } 
	 
	
	
	public static void main(String[] args) {
		Practice_BST BST=new Practice_BST();
		int[] nums= {7,8,11,3,45,19,3};
		BST.insert(0,nums);
		BST.display(root);
		
	}
	
	

	
}
	
		
		/*public Node insertion(int value) {
			root=insertion(nums,root);
			
		}
		
		public Node insertion(int data,Node node) {
			if(node==null) {
				Node newNode=new Node(data);
				node=newNode;
				return node;
			}
			
			if(data<node.value) {
				node.Left=insertion(data,node.Left);
			}
			if(data>node.value) {
				node.Right=insertion(data,node.Right);
			}
			return node;
		}
		
		*/
		
		
		