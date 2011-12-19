/*
 * Name: Daryl Stimm
 *
 * Login: cs11feq
 *
 * Date: November 30, 2011
 *
 * File: CSE11_Polygon.java
 *
 *
 * This class creates a Polygon object and extends Shape. 
 *   
 */

//import classes
import java.awt.*;
import objectdraw.*;

/*
 * Name: CSE11_Polygon
 * Purpose: this is a Polygon that extends Shape
 * Parameters: None
 * Return: None
 */
public class CSE11_Polygon extends Shape
{   
    private Point[] points; //this is used for the points of the polygon
    
    /*
     * Name: CSE11_Polygon
     * Purpose: This is a no arg constructor that creates an empty polygon 
     * 
     * Parameters: None
     * Return: None
     */
    public CSE11_Polygon() 
    {
        super("CSE11_Polygon"); //set the name
        Point p0 = new Point(0,0); //create a point 0,0
        Point[] points = new Point[1]; //pass the point into the array
        this.setArray(points); //set the array
        this.setPoint(p0, 0); //set the first point

    }
    
    /*
     * Name: CSE11_Polygon
     * Purpose: This constructor creates a Polygon 
     * 
     * Parameters: Point[] points 
     * Return: None
     */
    public CSE11_Polygon( Point[] points ) 
    {
        super("CSE11_Polygon"); //set the name
        this.setArray(points); //create the array of points

    }
    
    /*
     * Name: CSE11_Polygon
     * Purpose: This is a copy constructor that copies a polygon 
     * 
     * Parameters: CSE11_Polygon tri
     * Return: None
     */
    public CSE11_Polygon( CSE11_Polygon tri )
    {
        super(tri.getName()); //copy the name
        this.setArray(tri.getArray()); //copy the array from tri

        //copy each point in the array
        for(int i = 0; i < this.getArray().length; i++) 
        {
            this.setPoint(tri.getPoint(i), i);
        }

    }
    
    /*
     * Name: move
     * Purpose: This method will move the Shape
     * 
     * Parameters: int xDelta, int yDelta 
     * Return: void
     */
    public void move( int xDelta, int yDelta ) 
    {
        //update each point in the array
        for(int i = 0; i < this.getArray().length; i++)
        {
            Point point1 = new Point( this.getPoint(i).getX() + xDelta, 
                                      this.getPoint(i).getY() + yDelta );
            
            //set the new points
            this.setPoint(point1, i);
        }


    } 
    
    /*
     * Name: toString
     * Purpose: This method will return the characteristics of the shape
     * 
     * Parameters: None
     * Return: String
     */
    public String toString()
    {
        //return the name, and first and last point
        return "" + super.getName() + ": First and Last " 
                                    + getPoint(1).toString();
    }
    
    /*
     * Name: equals
     * Purpose: This method compares two objects
     * 
     * Parameters: Object o
     * Return: boolean
     */
    public boolean equals( Object o ) 
    {
        //check if o is null
        if( o == null )
            return false;
        
        //check if the classes are the same
        if (this.getClass() != o.getClass())
            return false;
        
        CSE11_Polygon obj = ((CSE11_Polygon)o);   
        
        
        //check each point in the array to verify they are equal
        int counter = 0;
        for(int i = 0; i < this.getArray().length; i++)
        {
            if(this.getPoint(i) == obj.getPoint(i))
            {
                counter++;
            }
        }
        //if the counter is equal to the length they are equal
        if(counter == this.getArray().length)
        {
            return true;
        }

        return false;
    }
    
    /*
     * Name: hashCode
     * Purpose: This method returns the HashCode of the shape
     * 
     * Parameters: None
     * Return: int
     */
    public int hashCode()
    {
        //return the poor man's hashcode
        return this.toString().hashCode(); 
    }
    
    /*
     * Name: getPoint
     * Purpose: This method is the point getter
     * 
     * Parameters: int position
     * Return: Point
     */
    public Point getPoint( int position )
    {        
        return points[position]; //return the point at the given position
    }
    
    /*
     * Name: setPoint
     * Purpose: This method is the point setter
     * 
     * Parameters: Point point, int position
     * Return: void
     */
    private void setPoint( Point point, int position )
    {
        this.points[position] = point; //set the point at the given position
    }
    
    /*
     * Name: getArray
     * Purpose: This method is the array getter
     * 
     * Parameters: None
     * Return: Point[]
     */
    public Point[] getArray()
    {
       return this.points; //return the array of points
    }
    
    /*
     * Name: setPoint
     * Purpose: This method is the array setter
     * 
     * Parameters: Point[] points
     * Return: void
     */
    private void setArray( Point[] points )
    {
        this.points = points; //set the array of points
    }

    /*
     * Name: draw
     * Purpose: This method draws the shape on the canvas
     * 
     * Parameters: DrawingCanvas canvas, Color c, boolean fill
     * Return: void
     */
    public void draw( DrawingCanvas canvas, Color c, boolean fill )
    {
        
        //get each point in the array and draw the polygon
        for(int i = 0; i < this.getArray().length; i++)
        {
            if(this.getArray().length - 1 == i)
            {
                //draw the CSE11 Line between each point
                CSE11_Line newLine0 = new CSE11_Line(this.getPoint(i), 
                                                     this.getPoint(0));
                //draw the lines manually 
                newLine0.draw( canvas, c, fill);                
                break;
            }
            //join the last point to the first point
            CSE11_Line newLine0 = new CSE11_Line(this.getPoint(i), 
                                                 this.getPoint(i + 1));
            
            //draw the last line
            newLine0.draw( canvas, c, fill);
        
        }
        
    }
    
}