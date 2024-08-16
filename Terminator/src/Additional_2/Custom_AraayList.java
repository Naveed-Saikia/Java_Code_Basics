package Additional_2;

import java.util.Arrays;

public class Custom_AraayList {
	private int[] arr;
	private int DEFAULT_SIZE=10;
	private int size=0;
	
	public Custom_AraayList() {
	this.arr=new int[DEFAULT_SIZE];
	
	}
	void add(int num) {
		if(IsFull()) {
			resize();
		}
		arr[size++]=num;
		
	}
	boolean IsFull() {
		return size==arr.length;
	}
	int[] resize() {
		int i=0;
		int[] temp=new int[2*arr.length];
		while(i<arr.length) {
			temp[i]=arr[i];
			i++;
		}
		arr=temp;
		return arr;
	}
	
	public int remove() {
		int removed=arr[--size];
		return removed;
		
	}
	public int get(int i) {
		return arr[i];
	}
	
	public int set(int index,int element) {
		int temp1=arr[index];
		arr[index]=element;
		return temp1;
	}
	public int size() {
		return size;
	}
	public String toString() {
		return Arrays.toString(arr);
		}
		
	
	public static void main(String[] args) {
		Custom_AraayList list=new Custom_AraayList();
		
		list.add(7);
		list.add(11);
		list.add(4);
		list.add(19);
		list.add(7);
		list.add(11);
		list.add(4);
		list.add(19);
		list.add(7);
		list.add(11);
		
		
		list.size();
		list.remove();
		list.remove();
		
		System.out.print(list);
		
		
		
	}

}
