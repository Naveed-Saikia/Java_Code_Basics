package LList;



public class Helloworld {
	private Node head;
	private Node tail;
	int size;
	private Object elseif;
	Helloworld(){
		this.size=0;
		
	}
	public void remove() {
		if(size==0) {
			System.out.print("Empty list");
		}
		if(size==1) {
			head=null;
			tail=null;
		}else {
		Node temp=head;
		Node temp2=temp.next;
		while(temp2.next!=null) {
			temp=temp.next;
			temp2=temp2.next;
		}
		tail=temp;
		temp.next=null;
		}
		size--;
	}
	public int size() {
		return size;
	}
	
	public void addFirst(int val) {
		Node newNode=new Node(val);
		if(size==0) {// We must also consider the possibility of an empty list.
			head=newNode;
			tail=newNode;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
		size+=1;
	}
	
	public void dispaly() {
		Node temp=head;
		System.out.print("\n");
		if(size==0) {
			System.out.print("Empty list");
		}else {
	        while (temp != null) {
	            System.out.print(temp.val + " -> ");
	            temp = temp.next;
	        }
	        System.out.print("null");
	    }
	}
	
	 
	public void addLast(int val) {
		Node newNode=new Node(val);
		if(size==0) {// We must also consider the possibility of an empty list.
			head=newNode;
			tail=newNode;
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
			tail=newNode;
		}
		size+=1;
	}
	
	public void DeleteAt(int index) {
		if(size==1) {
			if(index==0) {
				head=null;
				tail=null;
			}
			else {
				System.out.print("Wrong index given");
			}
		}
		Node temp=head;
		
		int count=0;
		while(count!=index-1) {
			temp=temp.next;
			count++;
			
			
		}
		Node temp2=temp.next;
		temp2=temp2.next;
		temp.next=temp2;
		size--;
		
	}
	public void addatIndex(int val,int index) {
		
		
		Node temp=head;
		Node newNode=new Node(val);
		int count=0;
		while(count!=index-1) {
			temp=temp.next;
			count++;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		if(index==size-1) {
			newNode.next=null;
		}
		size++;
	}
	
	
	 private class Node{ /// only this LL class will be able to access it
		 
		 private Node next;
		 private int val;
		
		 Node(int val){
			 this.val=val;
			 
		 }
		 Node(int val,Node next){
			 this.val=val;
			 this.next=next;
		 }
	 }
	 
	 public static void main(String[] args) {
		 Helloworld list=new Helloworld();
			list.addFirst(7);
			list.addLast(77);
			list.remove();
			list.addFirst(7);
			list.addLast(52);
			list.dispaly();
			list.addatIndex(8, 1);
			list.DeleteAt(2);
			list.DeleteAt(2);
			list.dispaly();
			System.out.println(list.size());
			
			
		}
	 }



