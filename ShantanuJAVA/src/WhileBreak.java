
public class WhileBreak {
public static void main(String[] args) {
	int i=1;
	while(true)
	{
	System.out.println("Hello "+i+" times");
	i++;
	if(i==40)
	{
		break;
	}
	}
	 System.out.println("last value of i is "+i);
}
}
