/*
 * Name: Daryl Stimm
 *
 * Login: cs11feq
 *
 * Date: November 30, 2011
 *
 * File: Point.java
 *
 *
 * This class creates a Point to be used by the different Shape objects
 *   
 */

//import classes
import java.awt.*;
import objectdraw.*;

/*
 * Name: Point
 * Purpose: Creates a new Point
 * Parameters: None
 * Return: None
 */
public class Point
{   
    private int x; //this is used to store the x point
    private int y; //this is used to store the y point
    
    /*
     * Name: Point
     * Purpose: This is a no arg constructor that creates an generic Point 
     * 
     * Parameters: None
     * Return: None
     */
    public Point() 
    {
        this.setX(0); //set x to 0
        this.setY(0); //set y to 0
    }
    
    /*
     * Name: Point
     * Purpose: This constructor creates a Point
     * 
     * Parameters: int x, int y 
     * Return: None
     */
    public Point( int x, int y ) 
    {
        this.setX(x); //store the x point
        this.setY(y); //store the y point

    }
    
    /*
     * Name: Point
     * Purpose: This is a copy constructor that copies a Point 
     * 
     * Parameters: Point point
     * Return: None
     */
    public Point( Point point )
    {
        this.setX(point.getX()); //store the x point
        this.setY(point.getY()); //store the y point
    }
    
    /*
     * Name: getX
     * Purpose: This is a getter for the X point
     * 
     * Parameters: None
     * Return: int
     */
    public int getX() 
    {
        return this.x; //return the x point
    } 
    
    /*
     * Name: getY
     * Purpose: This is a getter for the Y point
     * 
     * Parameters: None
     * Return: int
     */
    public int getY()
    {
        return this.y; //return the y point
    }
    
    /*
     * Name: setX
     * Purpose: This is a setter for the X point
     * 
     * Parameters: int x
     * Return: void
     */
    private void setX( int x ) 
    {
        this.x = x; //store the x point
    }
    
    /*
     * Name: setY
     * Purpose: This is a setter for the Y point
     * 
     * Parameters: int y
     * Return: void
     */
    private void setY( int y )
    {
        this.y = y; //store the y point
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
        //adjust the x and y points by adding the x and y delta.  
        this.setX(this.getX() + xDelta);
        this.setY(this.getY() + yDelta);
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
        //return the x and y point string
        return "Point: (" + this.getX() + ", " + this.getY() + ")";
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
        //check if the object is null
        if( o == null )
            return false;
        if (this.getClass() != o.getClass()) //check if the same class
            return false;
        
        Point obj = ((Point)o);   
        
        //check if the X and Y points are equal
        if(this.getX() == obj.getX() && this.getY() == obj.getY())
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
        //this returns the poor man's hashcode
        return this.toString().hashCode(); 
    }
    
}