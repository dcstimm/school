/*
 * Test program for classes Point and Circle for Shapes inheritance
 * exercise - CSE 11 Fall 2009.
 *
 * Program draws a Random Polygon figures.
 */

import java.awt.*;
import objectdraw.*;

public class TestPolygon extends WindowController
{
    public void begin()
    {
        makeStar();
        makePoly();
        makeTrap();
    }
    
    public void makeStar()
    {
        Point p1 = new Point( 250, 100 );
        Point p2 = new Point( 275, 200 );
        Point p3 = new Point( 400, 200 );
        Point p4 = new Point( 300, 250 );
        Point p5 = new Point( 325, 350 );
        Point p6 = new Point( 250, 275 );
        Point p7 = new Point( 175, 350 );
        Point p8 = new Point( 200, 250 );
        Point p9 = new Point( 100, 200 );
        Point p10 = new Point( 225, 200 );

        Point[] points = new Point[10];
        
        points[0] = p1;
        points[1] = p2;
        points[2] = p3;
        points[3] = p4;
        points[4] = p5;
        points[5] = p6;
        points[6] = p7;
        points[7] = p8;
        points[8] = p9;
        points[9] = p10;

        CSE11_Polygon fun = new CSE11_Polygon(points);
        fun.draw( canvas, Color.RED, true );
        CSE11_Polygon newShape = new CSE11_Polygon(fun);
        if ( fun.equals( newShape ) )
        {
            newShape.move( 5, 5 );
            newShape.draw( canvas, Color.GREEN, true );
            
        }

        Text text1 = new Text( "Center Star : " + fun.toString(), p1.getX(),
                              p1.getY(),
                              canvas );
        
        text1.move( -text1.getWidth()/2, -100 );
        
        Text text2 = new Text( "HashCode : " + fun.hashCode(), p1.getX(),
                              p1.getY(),
                              canvas );
        text2.move( -text2.getWidth()/2, -75 );
        
        CSE11_Polygon testNoArg = new CSE11_Polygon();

        
    }  // End of makeStar()
    
    
    public void makePoly()
    {
        Point p1 = new Point( 150, 25 );
        Point p2 = new Point( 125, 100 );
        Point p3 = new Point( 50, 200 );
        Point p4 = new Point( 75, 100 );

        
        Point[] points = new Point[4];
        
        points[0] = p1;
        points[1] = p2;
        points[2] = p3;
        points[3] = p4;
        
        CSE11_Polygon fun = new CSE11_Polygon(points);
        fun.draw( canvas, Color.BLUE, true );
        
        CSE11_Polygon newShape = new CSE11_Polygon(fun);
        if ( fun.equals( newShape ) )	
        {
            newShape.move( 0, 300 );
            newShape.draw( canvas, Color.ORANGE, true );
     
        }
        
        
        Point p1Flip = new Point( canvas.getWidth() - 150, 25 );
        Point p2Flip = new Point( canvas.getWidth() - 125, 100 );
        Point p3Flip = new Point( canvas.getWidth() - 50, 200 );
        Point p4Flip = new Point( canvas.getWidth() - 75, 100 );
        
        
        Point[] points2 = new Point[4];
        

        points2[0] = p1Flip;
        points2[1] = p2Flip;
        points2[2] = p3Flip;
        points2[3] = p4Flip;
        
        CSE11_Polygon fun2 = new CSE11_Polygon(points2);
        fun2.draw( canvas, Color.PINK, true );
        
        CSE11_Polygon newShape2 = new CSE11_Polygon(fun2);
        if ( fun2.equals( newShape2 ) )	
        {
            newShape2.move( 0, 300 );
            newShape2.draw( canvas, Color.MAGENTA, true );
            
        }

    }
    
    public void makeTrap()
    {
        Point p1 = new Point( 200, 400 );
        Point p2 = new Point( 300, 400 );
        Point p3 = new Point( 325, 475 );
        Point p4 = new Point( 175, 475 );
        
        
        Point[] points = new Point[4];
        
        points[0] = p1;
        points[1] = p2;
        points[2] = p3;
        points[3] = p4;
        
        CSE11_Polygon fun = new CSE11_Polygon(points);
        fun.draw( canvas, Color.GRAY, true );
        
    }
    
} // End of class 