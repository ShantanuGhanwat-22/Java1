
public class WrapperClass {
	public double sum()
    {
 
        double num1 = 10e+10;
        double num2 = 6e+08;
 
        // Returning the sum
        return (num1 + num2);
    }
 
    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating object of class in main() method
        WrapperClass t = new WrapperClass();
 
        // Here we have error of putting strictfp and
        // error is not found public static void main method
        System.out.println(t.sum());
    }
}
