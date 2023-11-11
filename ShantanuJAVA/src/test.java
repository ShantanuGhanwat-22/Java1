
public class test {
	public static void main(String args[]){    
		//Converting Integer to int    
		Integer b=new Integer(3);    
		int x=b.intValue();//converting Integer to int explicitly  
		int y=b;//unboxing, now compiler will write a.intValue() internally    
		    
		System.out.println(b+" "+x+" "+y);    
		}}
