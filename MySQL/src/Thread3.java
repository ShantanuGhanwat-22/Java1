public class Thread3  implements Runnable  
{    
    public void run()  
    {    
        System.out.println("Thread is running...");    
    }    
    public static void main(String args[])  
    {    
        Thread3  m1=new Thread3 ();    
        Thread t1 =new Thread(m1);    
        // this will call run() method  
        t1.start();    
    }    
} 