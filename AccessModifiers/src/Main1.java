    import java.awt.*;  
    import java.awt.event.*;  
    class Main1 extends Frame{  
    TextField tf;  
    Main1(){  
    //create components  
    tf=new TextField();  
    tf.setBounds(60,50,170,20);  
    Button b=new Button("click me");  
    b.setBounds(100,120,80,30);  
    //register listener  
    Main2 o=new Main2(this);  
    b.addActionListener(o);//passing outer class instance  
    //add components and set size, layout and visibility  
    add(b);add(tf);  
    setSize(300,300);  
    setLayout(null);  
    setVisible(true);  
    }  
    public static void main(String[] args){  
    new Main1();  
    }  
    }  

   
    
   
   
   
   
   
   
   
   