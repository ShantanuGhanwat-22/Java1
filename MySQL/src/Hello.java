public class Hello extends Thread  
{    
    public void run()  
    {    
        System.out.println("Thread is running...");    
    }    
    public static void main(String args[])  
    {    
        Hello t1=new Hello();    
        // this will call run() method  
        t1.start();    
    }    
}    
