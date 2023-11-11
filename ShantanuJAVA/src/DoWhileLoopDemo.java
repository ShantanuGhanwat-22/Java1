import java.util.*;
public class DoWhileLoopDemo {
	int i,j;
	public static void main(String[] args) 
	{
		  a:  
	            for(int i=1;i<=3;i++){    
	                    b:  
	                    for(int j=1;j<=3;j++){    
	                        if(i==2&&j==2){    
	                            //using break statement with label  
	                            break b;    
	                        }    
	                        System.out.println(i+" "+j);    
	                    }    
	            }    
	}  
	
	}
	