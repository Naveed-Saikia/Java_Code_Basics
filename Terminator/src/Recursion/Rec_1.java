package Recursion;

public class Rec_1 {
	static int val=0;
	static int count=0;
	static void func(int n) {
		if(n==0) {
			return;

		}else{
			func(n-1);
			System.out.println(n);
		}
		
	}
	
	static int sum(int n) {
		
		if(n==0) {
			return 0;
		}
		else {
			return n%10 +sum(n/10);
		}
		
	}
	
	static void rev1(int n) {
		if(n==0) {
			return ;
		}
		int rem=n%10;
		Rec_1.val=val*10+rem;
		rev1(n/10);
		
	}

	static boolean pall(int n) {
		val=0;
		rev1(n);
		return n==val;
	}
	
	
	static int rev_2(int n) {
		int digits=(int)(Math.log10(n))+1;
		return helper(n,digits);
	}
	static int helper(int n,int digits) {
		if(n%10==n) {
			return n;
		}
		int rem=n%10;
		return rem* (int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
	}
	
	
	static int zeros(int n) {
		if(n==0) {
			return count;
		}
		int a=n%10;
		if(a==0) {
			count++;
		}
		return zeros(n/10);
	}
	
	public static void main(String args[]) {
		func(5);
		System.out.println(sum(155));
		rev1(6794); 
		System.out.println(val);
		System.out.println(pall(373));
		System.out.print(zeros(340890700));
	}

}
