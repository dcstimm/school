/*
 * Name: Daryl Stimm
 *
 * Login: cs11feq
 *
 * Date: November 30, 2011
 *
 * File: TestPolygon.java
 *
 *
 * This program draws a Random Polygon figures. 
 *   
 */

//import classes
import java.awt.*;
import objectdraw.*;

/*
 * Name: TestPolygon
 * Purpose: extends WindowController
 * Parameters: None
 * Return: None
 */
public class TestPolygon extends WindowController
{
    
    /*
     * Name: begin
     * Purpose: this method is started when the 
     * application is ran for the first time.
     *
     * Parameters: None
     * Return: void
     */
    public void begin()
    {
        makeStar(); //create the center star
        makePoly(); //create the four polygons
        makeTrap(); //create the trapezoid 
    }
    
    /*
     * Name: makeStar
     * Purpose: This method draws the large star in the middle of the canvas 
     * and tests all the various methods in the CSE11_Polygon class
     *
     * Parameters: None
     * Return: void
     */
    public void makeStar()
    {
        
        //set the points for the large star
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
        
        //create an array to hold the points and pass in the points
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

        //create the star by passing in the points 
        CSE11_Polygon fun = new CSE11_Polygon(points);
        
        //draw the star and color it red
        fun.draw( canvas, Color.RED, true );
        
        //copy the star
        CSE11_Polygon newShape = new CSE11_Polygon(fun);
        
        //check if they are equal
        if ( fun.equals( newShape ) )
        {
            //if they are equal, move 5 pixels left and 5 pixels down
            newShape.move( 5, 5 );
            
            //set the copy to green
            newShape.draw( canvas, Color.GREEN, true );
            
        }

        //display the text for the center star
        Text text1 = new Text( "Center Star : " + fun.toString(), p1.getX(),
                              p1.getY(),
                              canvas );
        
        //position the text
        text1.move( -text1.getWidth()/2, -100 );
        
        //display the hashcode for the center star
        Text text2 = new Text( "Center Star's HashCode : " + fun.hashCode(), 
                              p1.getX(),
                              p1.getY(),
                              canvas );
        
        //position the text
        text2.move( -text2.getWidth()/2, -75 );
        
        //test the no arg polygon
        CSE11_Polygon testNoArg = new CSE11_Polygon();

        
    }  // End of makeStar()
    
    /*
     * Name: makePoly
     * Purpose: This method draws the 4 polygon shapes on the canvas 
     * and tests all the various methods in the CSE11_Polygon class
     *
     * Parameters: None
     * Return: void
     */
    public void makePoly()
    {
        
        //create the points for the top left polygon
        Point p1 = new Point( 150, 25 );
        Point p2 = new Point( 125, 100 );
        Point p3 = new Point( 50, 200 );
        Point p4 = new Point( 75, 100 );

        //create an array that holds the points
        Point[] points = new Point[4];
        
        points[0] = p1;
        points[1] = p2;
        points[2] = p3;
        points[3] = p4;
        
        //create the top left polygon with the array of points
        CSE11_Polygon fun = new CSE11_Polygon(points);
        
        //draw the polygon and color it blue
        fun.draw( canvas, Color.BLUE, true );
        
        //copy the top left polygon using the copy ctor
        CSE11_Polygon newShape = new CSE11_Polygon(fun);
        
        //check if they are equal
        if ( fun.equals( newShape ) )	
        {
            //move the copy to the bottom left corner of the canvas
            newShape.move( 0, 300 );
            
            //color the new polygon orange
            newShape.draw( canvas, Color.ORANGE, true );
     
        }
        
        //create the points for the top right polygon
        Point p1Flip = new Point( canvas.getWidth() - 150, 25 );
        Point p2Flip = new Point( canvas.getWidth() - 125, 100 );
        Point p3Flip = new Point( canvas.getWidth() - 50, 200 );
        Point p4Flip = new Point( canvas.getWidth() - 75, 100 );
        
        
        //create an array that holds the points
        Point[] points2 = new Point[4];
        
        points2[0] = p1Flip;
        points2[1] = p2Flip;
        points2[2] = p3Flip;
        points2[3] = p4Flip;
        
        
        //create the top right polygon with the array of points
        CSE11_Polygon fun2 = new CSE11_Polygon(points2);
        
        //draw the polygon and set it to Pink
        fun2.draw( canvas, Color.PINK, true );
        
        //copy the top right polygon
        CSE11_Polygon newShape2 = new CSE11_Polygon(fun2);
        
        //check if they are equal
        if ( fun2.equals( newShape2 ) )	
        {
            newShape2.move( 0, 300 ); //move the polygon to the bottom right
            
            //draw the polygon and set the color to magenta
            newShape2.draw( canvas, Color.MAGENTA, true );
            
        }

    }
    
    /*
     * Name: makePoly
     * Purpose: This method draws the trapizod shape on the bottom of the canvas 
     * and tests all the various methods in the CSE11_Polygon class
     *
     * Parameters: None
     * Return: void
     */
    public void makeTrap()
    {
        
        //create the points for the center trapezoid
        Point p1 = new Point( 200, 400 );
        Point p2 = new Point( 300, 400 );
        Point p3 = new Point( 325, 475 );
        Point p4 = new Point( 175, 475 );
        
        //create an array that holds the points
        Point[] points = new Point[4];
        
        points[0] = p1;
        points[1] = p2;
        points[2] = p3;
        points[3] = p4;
        
        //create the trapezoid with the array of points
        CSE11_Polygon fun = new CSE11_Polygon(points);
        
        //draw and set the color to gray 
        fun.draw( canvas, Color.GRAY, true );
        
    }
    
} // End of class 