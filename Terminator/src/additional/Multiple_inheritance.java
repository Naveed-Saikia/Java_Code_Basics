package additional;

public class Multiple_inheritance {
	
	public class junior extends child{
		String extra;
		junior(String s,int n,String gen,String ex){
			super(n,s,gen);
			this.extra=ex;
			
		}
		
		junior(junior other){
			
		}
	}
	public static void main(String args[]) {
		
		/// Way of creating and accesing inner insatnces(inner classes) inside the main class.
		
		Multiple_inheritance instance=new Multiple_inheritance();
		junior newbie=instance.new junior("Raaj",25,"Male","Chubby");
	}

}
