import java.util.Scanner;

public class LOOPS {
public static void main (String[] args) {
	int r,reverse=0,n;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Number");
	n= s.nextInt();
	
	while(n!=0) {
		r = n%10;
		System.out.print(r+" ");
	n=n/10;
	}
}}
