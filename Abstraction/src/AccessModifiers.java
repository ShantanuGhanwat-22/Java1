class AccessModifiers{  
private int data=40;  
public void msg(){System.out.println("Hello java");}  
}  
  
public class Simple extends AccessModifiers {  
 public static void main(String args[]){  
   AccessModifiers obj=new AccessModifiers ();  
   //System.out.println(obj.data);//Compile Time Error  
   obj.msg();//Compile Time Error  
 } 
 }