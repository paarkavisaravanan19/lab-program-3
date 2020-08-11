/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprogram3;
import java.util.Scanner;

/**
 *
 * @author NEW
 */
public class realnumberintoint {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number of your choice:");
        double a=obj.nextDouble();
        System.out.println("round of value for the given number="+convert.nint(a));
        
    }
    
}
class convert
{
    static int nint(double data)
    {
        int value=(int)Math.round(data);
        return(value);
    }
    
        
    
}
