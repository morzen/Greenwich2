/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoursework1555;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import static javacoursework1555.Functions.F1;
import static javacoursework1555.Functions.F2;
import static javacoursework1555.Functions.F3;

/**
 *
 * @author barnabe
 */





public class rootFinder {
    
    public static void main(String[] args) 
    {
        
    
        System.out.println(Secant1(4.0, 9.0));
        
        System.out.println(Secant2(4.0, 9.0));
        
        System.out.println(Secant3(4.0, 9.0));
        
        
        //System.out.println(MyWay(-1.0, 1.0, 0));
        
    
    }
    
    
    
  
    // for f(x)= x-x^2
    static double Secant1( double x1 , double x2)
    {
        
        double[] listSecant1 = {x1 , x2};
        
        
        
        
        int i = 2;
        
        while(x1 != x2)
        {
            
            
           double x3 = (F1(x2) / ( (F1(x2) - F1(x1)) / (x2 - x1) ) );
           
           String sx1 = df4.format(x1);
           x1 = Double.parseDouble(sx1);
           
           String sx2 = df4.format(x2);
           x2 = Double.parseDouble(sx2);
           
           String sx3 = df4.format(x3);
           x3 = Double.parseDouble(sx3);
           
           x1 = x2;
           x2 = x3;
           
           listSecant1[0] = x2;
           listSecant1[1] = x3;
           
           System.out.println("x1: "+ x1);
           System.out.println("x2: "+ x2);
           
            
            
                    
        }
        System.out.println(Arrays.toString(listSecant1));
        
        
        
        
    return x1;
    }
    
    
    
    
    
    
    
    // for f(x)=ln(x+1)+1
        static double Secant2( double x1 , double x2)
    {
        
        double[] listSecant2 = {x1 , x2};
        
        
        
        try{
            
            while(x1 != x2)
        
            {
                double x3 = (F2(x2) / ( (F2(x2) - F2(x1)) / (x2 - x1) ) );
           
                String sx1 = df4.format(x1);
                x1 = Double.parseDouble(sx1);
           
                String sx2 = df4.format(x2);
                x2 = Double.parseDouble(sx2);
                
                String sx3 = df4.format(x3);
                x3 = Double.parseDouble(sx3);
           
                listSecant2[0] = x2;
                listSecant2[1] = x3;
                
                        
                x1 = x2;
                x2 = x3;
           
                System.out.println("x1: "+ x1);
                System.out.println("x2: "+ x2);
               
            }
        
            System.out.println(Arrays.toString(listSecant2));
        
        }catch(Exception e)
        {
            System.out.println("oops it seem there is not root for this function");
        }
        
        
        
        
        
        
    return x1;
    }
    
    
        
        
        
        
        
        static double Secant3( double x1 , double x2)
    {
        
        double[] listSecant3 = {x1 , x2};
        
      
        while(x1 != x2)
        {
            
            
           double x3 = (F3(x2) / ( (F3(x2) - F3(x1)) / (x2 - x1) ) );
           
           String sx1 = df4.format(x1);
           x1 = Double.parseDouble(sx1);
           
           String sx2 = df4.format(x2);
           x2 = Double.parseDouble(sx2);
           
           String sx3 = df4.format(x3);
           x3 = Double.parseDouble(sx3);
           
           
           
           listSecant3[0] = x2;
           listSecant3[1] = x3;
           
           
           x1 = x2;
           x2 = x3;
           
           System.out.println("x1: "+ x1);
           System.out.println("x2: "+ x2);
           
            
            
                    
        }
        System.out.println(Arrays.toString(listSecant3));
        
        
        
        
    return x1;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    
   
    //I did it myyyyyy wwwaaayyy 
    // way to find root for square function
    static double MyWay(double a, double b, double c)
    {
        //f(x)=x-x2
        // a = -1 b = 1 c = 0
        
        double deltat = Delta(a, b, c);
        
        if(deltat > 0)
        {
           double rootD = Math.sqrt(deltat);
           
           double answer1 = ((-b + rootD) / 2*a);
           System.out.println("root1: "+answer1);
           
           double answer2 = ((-b - rootD) / 2*a);
           System.out.println("root2: "+answer2);
            
        
        }else if(deltat == 0)
        {
         
            double rootD = Math.sqrt(deltat);
           
            System.out.println("technicaly root1 and root2 should be equal since delta = 0 ");
            
            double answer1 = ((-b + rootD) / 2*a);
            System.out.println("root1: "+answer1);
           
            double answer2 = ((-b - rootD) / 2*a);
            System.out.println("root2: "+answer2);
            
        }else
        {
        
            System.out.println("delta is inferior to zero that mean there is no roots");
            
        }
     
    
        return(deltat);
    }
    
    
    
    
    
  
    static double Delta(double a, double b, double c)
    {
        double answer = (b*b)-4*a*c ;
        
        return answer;
    }
    
    
    
    
    private static DecimalFormat df4 = new DecimalFormat("#.####");
   
}
