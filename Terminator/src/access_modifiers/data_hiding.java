package access_modifiers;

public class data_hiding {
		// int num;-------------- Now lets try making it private
		protected int num;
		private String name;
		int[] arr;
		static int population;
		
	data_hiding(int a,String b){
			this.num=a;
			this.name=b;
			this.arr=new int[this.num];
			data_hiding.population++;
			System.out.println("This is a constructor");
			
		}
	
	//GETTERS AND SETTERS----------------------------------------
	
	
	String getString() {
		return name;
	}
	
	void setString(String s) {
		this.name=s;
	}
	
	
	
	public static void main(String[] args) {
		data_hiding b=new data_hiding(11,"Hello");
		b.name="Rizz";
		b.num=7;
	
	
	}
	
	
}
