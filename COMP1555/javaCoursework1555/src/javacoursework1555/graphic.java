/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoursework1555;

/**
 *
 * @author barnabe - modifed by barnabe but original code from https://stackoverflow.com/questions/43970030/graphing-functions
 */

import java.awt.Graphics;
import java.awt.*;
import static java.lang.Double.NaN;
import java.util.ArrayList;
import static javacoursework1555.Functions.F1;
import javax.swing.JComponent;
import javax.swing.JFrame;


public class graphic extends JComponent {

    static void main() {
            JFrame frame = new JFrame();
            frame.setSize(800, 600);
            frame.setTitle("Graphs");
            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            frame.setLocationRelativeTo(null); 
   
            graphic draw = new graphic();
            frame.add(draw);
            frame.setVisible(true);
    }
    
//    
//    public ArrayList<ArrayList<Double>> getList()
//    {
//        return javacoursework1555.GUI.XYlist;
//    }
    
    
    

public void paintComponent( Graphics g )
{   
    
    ArrayList<ArrayList<Double>> try1 = GUI.XYlist;
    
//    if(try1.get(0).contains(NaN))
//    {
//        int n = 0;
//        while(try1.get(0).get(n) == NaN)
//        {
//            try1.get(0).get(n) = -1.0;
//        }
//    }
    
    
    
    int zoom = 50;
     //w is x, and h is y (as in x/y values in a graph)
     int w = this.getWidth()/2;
     int h = this.getHeight()/2;

 Graphics2D g1 = (Graphics2D) g;
 g1.setStroke(new BasicStroke(2));
 g1.setColor(Color.black);
 g1.drawLine(0,h,w*2,h);
 g1.drawLine(w,0,w,h*2); 
 g1.drawString("0", w - 7 , h + 13);
 
 
 /// X axis
  
 g1.drawString("0.5", (int) (w + 0.5 * zoom), h - 0 * zoom + 13);
 g1.drawString("-0.5", (int) (w - 0.5 * zoom), h - 0 * zoom + 13);
 
 g1.drawString("1", w + 1 * zoom, h - 0 * zoom + 13);
 g1.drawString("-1", w - 1 * zoom, h - 0 * zoom + 13);
 
 g1.drawString("1.5", (int) (w + 1.5 * zoom), h - 0 * zoom + 13);
 g1.drawString("-1.5", (int) (w - 1.5 * zoom), h - 0 * zoom + 13);
  
 g1.drawString("2", w + 2 * zoom, h - 0 * zoom + 13);
 g1.drawString("-2", w - 2 * zoom, h - 0 * zoom + 13);
 
  g1.drawString("2.5", (int) (w + 2.5 * zoom), h - 0 * zoom + 13);
 g1.drawString("-2.5", (int) (w - 2.5 * zoom), h - 0 * zoom + 13);
 
 
 //Y axis
  
 g1.drawString("0.5", w + 0 * zoom, (int) (h - 0.5 * zoom + 13));
 g1.drawString("-0.5", w - 0 * zoom, (int) (h + 0.5 * zoom + 13));
 
 g1.drawString("1", w + 0 * zoom, h - 1 * zoom + 13);
 g1.drawString("-1", w - 0 * zoom, h + 1 * zoom + 13);
 
 g1.drawString("1.5", w + 0 * zoom, (int) (h - 1.5 * zoom + 13));
 g1.drawString("-1.5", w - 0 * zoom, (int) (h + 1.5 * zoom + 13));
  
 g1.drawString("2", w + 0 * zoom, h - 2 * zoom + 13);
 g1.drawString("-2", w - 0 * zoom, h + 2 * zoom + 13);
  
 g1.drawString("2.5", w + 0 * zoom, (int) (h - 2.5 * zoom + 13));
 g1.drawString("-2.5", w - 0 * zoom, (int) (h + 2.5 * zoom + 13));

 Graphics2D g2 = (Graphics2D) g;
 g2.setStroke(new BasicStroke(2));
  g2.setColor(Color.red);
  
  
  
   Polygon p = new Polygon();
  
   for (int i = 0; i < try1.get(0).size(); i++) 
   {
          double x = try1.get(0).get(i)*zoom;
          double y = try1.get(1).get(i)*zoom;
          int xint = (int) x;
          int yint = (int) y;
                  
          p.addPoint( w + xint  , h - yint);

  
   }
   
   
  
  g2.drawPolyline(p.xpoints, p.ypoints, p.npoints);

 
}

  








public static void main(String[] args) 

    {
    JFrame frame = new JFrame();
    frame.setSize(800, 600);
    frame.setTitle("Graphs");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null); 
   
    graphic draw = new graphic();
    frame.add(draw);
    frame.setVisible(true);
    }
}