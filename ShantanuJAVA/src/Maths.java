
public class Maths {
	public static void main(String[] args)     
    {    
        double x = 2;    
        double y = 4;    
          
        // return the maximum of two numbers  
        System.out.println("Maximum number of x and y is: " +Math.max(x, y));   
          
        // return the square root of y   
        System.out.println("Square root of y is: " + Math.sqrt(y));   
          
        //returns 28 power of 4 i.e. 28*28*28*28    
        System.out.println("Power of x and y is: " + Math.pow(x, y));      
  
        // return the logarithm of given value       
        System.out.println("Logarithm of x is: " + Math.log(x));   
        System.out.println("Logarithm of y is: " + Math.log(y));  
          
        // return the logarithm of given value when base is 10      
        System.out.println("log10 of x is: " + Math.log10(x));   
        System.out.println("log10 of y is: " + Math.log10(y));    
          
        // return the log of x + 1  
        System.out.println("log1p of x is: " +Math.log1p(x));    
  
        // return a power of 2    
        System.out.println("exp of a is: " +Math.exp(x));    
          
        // return (a power of 2)-1  
        System.out.println("expm1 of a is: " +Math.expm1(x));
        
        System.out.println();
        
        double j = 4;    
        
        // converting values to radian    
        double k = Math.toRadians(j);   
          
        // return the trigonometric sine of a      
        System.out.println("Sine value of j is: " +Math.sin(j));    
          
        // return the trigonometric cosine value of a  
        System.out.println("Cosine value of j is: " +Math.cos(j));  
          
        // return the trigonometric tangent value of a  
        System.out.println("Tangent value of j is: " +Math.tan(j));  
          
        // return the trigonometric arc sine of a      
        System.out.println("Sine value of j is: " +Math.asin(j));    
          
        // return the trigonometric arc cosine value of a  
        System.out.println("Cosine value of j is: " +Math.acos(j));  
          
        // return the trigonometric arc tangent value of a  
        System.out.println("Tangent value of a is: " +Math.atan(j));  
  
        // return the hyperbolic sine of a      
        System.out.println("Sine value of j is: " +Math.sinh(j));    
          
        // return the hyperbolic cosine value of a  
        System.out.println("Cosine value of j is: " +Math.cosh(j));  
          
        // return the hyperbolic tangent value of a  
        System.out.println("Tangent value of j is: " +Math.tanh(j));  
    }    
}

