/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprogram3;

/**
 *
 * @author NEW
 */
public class counter {
    public static void main(String args[]){
        System.out.println("First Increment");
        counter1 obj=new counter1();
        obj.incre();
        System.out.println("Second Increment");
        counter1 obj1=new counter1();
        obj1.incre();
    }
}
    class counter1
    {
        static int i=0;
        int j=0;
        void incre()
        {
            i=i+1;
            j=j+1;
            System.out.println("static counter="+i);
            System.out.println("counter="+j);
        }
    }
            
        
       
       
      
        
        
    
    

