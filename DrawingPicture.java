/**
 * Write a description of class LoopDrawing here.
 *
 * @author (MaryKate Sullivan)
 * @version (January 22)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;

public class DrawingPicture extends JComponent
{
    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D)g;
        // comment this out once you have finished
        drawGrid(g2);
	/******** Put your code here  *********/
//        Ellipse2D.Double circle = new Ellipse2D.Double(100, 100, 200, 100);
//        g2.fill(circle);
        g2.setColor(Color.red);
        int x[] = { 100, 200, 300};
        
        // y coordinates of vertices
        int y[] = { 100, 250, 100 };
        
        // number of vertices
        int numberofpoints = 3;
        g2.drawPolygon(x, y, numberofpoints);
         g2.fillPolygon(x, y, numberofpoints);
        
        
        Arc2D arc1 = new Arc2D.Float(100, 25, 100, 150, 0, 180, Arc2D.CHORD);
        g2.fill(arc1);

        Arc2D arc2 = new Arc2D.Float(200, 25, 100, 150, 0, 180, Arc2D.CHORD);
        g2.fill(arc2);
    }
    public void drawGrid(Graphics g2){
        g2.setColor(new Color(211, 211, 211));
        
        // Draw vertical lines
        for(int x = 0; x < 1000; x += 50){
            g2.drawLine(x, 0, x, 1000);
            g2.drawString("" + x, x, 10);
        }
        
        // Draw horizontal lines
        for(int y = 50; y < 1000; y += 50){
            g2.drawLine(0, y, 1000, y);
            g2.drawString("" + y, 0, y);
        }
    }
}
