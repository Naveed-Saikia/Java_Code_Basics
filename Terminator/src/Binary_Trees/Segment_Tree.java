package Binary_Trees;

import java.util.*;

public class Segment_Tree {
	static Node root;
	
	public static void main(String[] args) {
		int[] nums= {7,11,13,9,2,4,6};
		
	}
	Segment_Tree(){
		
	}
	
	private static class Node{
		Node Left;
		Node Right;
		int value;
		int startI;
		int endI;
		Node(int start,int end){
			this.startI=start;
			this.endI=end;
		}
		Node(int data){
			this.value=data;
		}
		
	}
	
	
	public static void insert(int[] data) {
		if(root==null) {
			Node newNode=new Node(data[0],data[data.length-1]);
			newNode.value=Sum(newNode.startI,newNode.endI,Arrays.copyOfRange(data, newNode.startI, newNode.endI+1));
			root=newNode;
		}
		root.Left=insert(root, data, root.startI, root.endI/2);
		root.Right=insert(root, data,( root.endI+1)/2, root.endI);
	}
	
	
	public static Node insert(Node node,int[] data,int start,int end) {
		data=Arrays.copyOfRange(data, start, end+1);
		if(node==null) {
			
		}
		int i=start;
		while(i<=end) {
			
			
		}
		
	}
		
		
		public static int Sum(int a,int b,int[] c) {
			int value=0;
			for(int i=a;i<=b;i++) {
				value+=c[i];
			}
			
			return value;
		}
	
	
	
	
	

}
