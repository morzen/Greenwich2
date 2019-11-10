/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoursework1555;

import static java.lang.Double.NEGATIVE_INFINITY;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
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
        
    
        // Secant
        //System.out.println(Secant1(4.0, 9.0));
        
        //System.out.println(Secant2(4.0, 9.0));
        
        //System.out.println(Secant3(4.0, 9.0));
        
        // Bisection
        //System.out.println(Bisection1(0.1, 0.9));
        
        
        
        //MyWay
        //System.out.println(MyWay(-1.0, 1.0, 0));
        System.out.println("the roots are: "+MyWay2(-10.0, 10.0, 3));
        
    
    }
    
    
 
/////////////////////////////////////////////////////////////////////////////////  
    
    
    
    
    //SECANT METHOD
    
    
    
    
/////////////////////////////////////////////////////////////////////////////////
  
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
           System.out.println("x3: "+ x3);
           
            
            
                    
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
                System.out.println("x3: "+ x3);
               
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
           System.out.println("x3: "+ x3);
           
            
            
                    
        }
        System.out.println(Arrays.toString(listSecant3));
        
        
        
        
    return x1;
    }
    
/////////////////////////////////////////////////////////////////////////////////  
    
    
    
    
    //BISECTION METHOD
    
    
    
    
/////////////////////////////////////////////////////////////////////////////////    
    
    
 
        //for f(x)=x-x^2  
 static double Bisection1(double a, double b)// the interval
 {
     
     double y1 = F1(a);
     double y2 = F1(b);
     double aF = a;
     double bF = b;
     
     
     
     System.out.println("for x "+a+" first y1: "+y1);
     System.out.println("for x "+b+" first y2: "+y2);
     
     if(a < b)
     {
         
         // if f(a)=- and f(b)=+ 
         if(y1 < 0 || y2 > 0 && y1 > 0 || y2 < 0)
         {
             while(y1 != 0 || y2 != 0)
             {
                
                 if(y1 != 0)
                 {
                      y1 = F1(a);
                      a = a + 0.25;
                      String sy1 = df4.format(y1);
                      y1 = Double.parseDouble(sy1);
                      System.out.println("y1: "+y1);
                 }
                
                 if(y1 == 0)
                 {
                   System.out.println(" y1: "+ y1 + " for a = " + (a -0.25));
                 }
 
                 
                 
                 if(y2 != 0)
                 {
                     y2 = F1(b);
                     b = b - 0.25;
                     String sy2 = df4.format(y2);
                     y2 = Double.parseDouble(sy2);
                     System.out.println("y2: "+y2);
                 }
                 
                  
                 if(y2 == 0)
                 {
                   System.out.println(" y2: "+ y2 + " for b = " + (b +0.25));
                 }
                 
                 
                 if(b <= aF || a >= bF && b <= aF && a >= bF)
                 {
                     
                     System.out.println(" there don't seem to be any root in between the inteval choosen ");
                     break;
                 }

                 
                 
                 
                 
                 
             }
               
         
         }else if (y1 < 0 || y2 < 0 && y1 > 0 || y2 >0) // if f(a)=- and f(b)=- or f(a)=+ and f(b)=+
         {
             
             
              while(y1 != 0 || y2 != 0)
             {
                
                 if(y1 != 0)
                 {
                      y1 = F1(a);
                      a = a + 0.25;
                      String sy1 = df4.format(y1);
                      y1 = Double.parseDouble(sy1);
                      System.out.println("y1: "+y1);
                 }
                
                 if(y1 == 0)
                 {
                   System.out.println(" y1: "+ y1 + " for a = " + (a -0.25));
                 }
                 
                 if(y2 != 0)
                 {
                     y2 = F1(b);
                     b = b - 0.25;
                     String sy2 = df4.format(y2);
                     y2 = Double.parseDouble(sy2);
                     System.out.println("y2: "+y2);
                 }
                 
                  
                 if(y2 == 0)
                 {
                   System.out.println(" y2: "+ y2 + " for b = " + (b +0.25));
                 }
                 
                 
                                                  
                 if(b <= aF || a >= bF && b <= aF && a >= bF)
                 {
                     
                     System.out.println(" there don't seem to be any root in between the inteval choosen ");
                     break;
                 }
                 
                
                 
                 
                 
             }
             
         }else {System.out.println("this shouldn't be triggered technically ");}
         
         
         
     }else 
     {
         System.out.println(" the interval entered isn't good you can't go from a higher number to a lower ");
     }
     
     
     
     
 
     

     return a-0.25;
 }   
    
    
    
    
    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    
/////////////////////////////////////////////////////////////////////////////////  
    
    
    
    
    //my way
    
    
    
    
/////////////////////////////////////////////////////////////////////////////////
        
        
        
        
        
        
        
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
    
    
    private static DecimalFormat df1 = new DecimalFormat("#.#");
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    private static DecimalFormat df4 = new DecimalFormat("#.####");
   


    static LinkedList<Double> MyWay2(double a, double b, int c)
    {
       LinkedList<Double> roots1 = new LinkedList<Double>();
       
       
               
       if(a >= b)
       {
           System.out.println("the interval entered is wrong");
           
       }
        
       if(c == 1)
       {
           while(a < b)
           {
               double answer1 = F1(a);
               String Sanswer1 = df2.format(answer1);
               answer1 = Double.parseDouble(Sanswer1);
               //System.out.println("answer1: "+answer1);
               if(answer1 == 0)
               {
                   String Sa = df2.format(a);
                   a = Double.parseDouble(Sa);
                   roots1.add(a);
               }
               
               a = a + 0.25;
           }
          
       
       
       
       }else if(c == 2)
       {
        
           while(a < b)
           {
            
               double answer1 = F2(a);
               
               if(answer1 == NEGATIVE_INFINITY)
               {
                   while(answer1 == NEGATIVE_INFINITY)
                   {
                       answer1 = F2(a);
                       a = a + 0.25;
                   }
                  
               }
               
               String Sanswer1 = df2.format(answer1);
               answer1 = Double.parseDouble(Sanswer1);
               //System.out.println("answer1: "+answer1);
               
               if(answer1 == 0)
               {
                   String Sa = df2.format(a);
                   a = Double.parseDouble(Sa);
                   roots1.add(a);
               }
               
               a = a + 0.0025;
           }
        

        
           
       }else if(c == 3)
       {
           while(a < b)
           {
               double answer1 = F3(a);
               
               System.out.println("answer1: "+answer1);
               
               
               if(answer1 == 0)
               {
                   roots1.add(a);
               }
               
               a = a + 0.25;
           }
     
       
       }else
       {
           System.out.println(" there is a problem ");
       }
     
        
        //System.out.println(roots1);
        return roots1; 
    }



}
