package access_modifiers;
import java.util.*;

class b extends data_hiding{
	b(int c,String o){
		
		//super(o,c);------------------Wrong implementation of super
		
		super(c,o);// Order of the parent  constructor must be mantained
	}
	
}

public class additional_main {
	public static void main(String[] args) {
		data_hiding a=new data_hiding(11,"Hello");
		
		
		System.out.println(data_hiding.population);///---Test use of static variable
		data_hiding.population++;
		
		
		a.num=7;/// Protected accessible in same package outside the  main class
		
		//a.name="Rahul"----Private only accessible inside the main class
		
		b obj_new=new b(27,"varun");
		
		b.population++;
		System.out.println(b.population);
		
		int n=obj_new.num;// even in the new subclass value of integer b is accessible
		
		a.arr=new int[11];
		a.getString();
		a.setString("Varun");
		a.num=7;
		
		System.out.print(a.getClass());
	
	
	}

}
