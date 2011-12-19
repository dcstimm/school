/*
 * Name: Daryl Stimm
 *
 * Login: cs11feq
 *
 * Date: November 30, 2011
 *
 * File: ARectangle.java
 *
 *
 * This class creates a generic Rectangle object and extends Shape. 
 *   
 */

//import classes
import java.awt.*;
import objectdraw.*;

/*
 * Name: ARectangle
 * Purpose: this is a generic abstract rectangle that extends Shape
 * Parameters: None
 * Return: None
 */
public abstract class ARectangle extends Shape
{   
    private Point upperLeft;
    
    /*
     * Name: Rectangle
     * Purpose: This is a no arg constructor that creates an empty ARectangle 
     * 
     * Parameters: None
     * Return: None
     */
    public ARectangle()  
    {
        super("ARectangle"); //call super and pass in the name
        this.setUpperLeft(new Point(0, 0)); //set upperleft point to 0,0
    }
    
    /*
     * Name: ARectangle
     * Purpose: This constructor creates a ARectangle from two x and y points 
     * 
     * Parameters: String name, int x, int y  
     * Return: None
     */
    public ARectangle( String name, int x, int y ) 
    {
        super(name); //pass the name to the super
        this.setUpperLeft( new Point(x, y) ); //set the upperleft to 0,0

    }
    
    /*
     * Name: ARectangle
     * Purpose: This constructor creates a ARectangle 
     * 
     * Parameters: String name, Point upperLeft  
     * Return: None
     */
    public ARectangle( String name, Point upperLeft )
    {
        super(name); //pass in the name to the super
        this.setUpperLeft( upperLeft ); //set the upperLeft point

    }
    
    /*
     * Name: ARectangle
     * Purpose: This is a copy constructor that copies a ARectangle 
     * 
     * Parameters: ARectangle r
     * Return: None
     */
    public ARectangle( ARectangle r ) 
    {
        super(r.getName()); //call super's no arg constructor
        this.setUpperLeft(r.getUpperLeft()); //copy the upperLeft and set it
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
        //generate a new point with the xDelta and yDelta added to it
        Point point1 = new Point( getUpperLeft().getX() + xDelta, 
                                  getUpperLeft().getY() + yDelta );
        this.setUpperLeft(point1); //set the new point
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
        //return the upper left corner string
        return ": Upper Left Corner: " + upperLeft.toString();
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
        
        //check if they are in the same class
        if (this.getClass() != o.getClass())
            return false;
        
        ARectangle obj = ((ARectangle)o);   
        
        //check to see if the upperleft corners are equal
        if(this.getUpperLeft() == obj.getUpperLeft())
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
        return this.toString().hashCode(); //return the poor man's hashcode
    }
    
    /*
     * Name: getUpperLeft
     * Purpose: This is a getter for the upper left point
     * 
     * Parameters: None
     * Return: Point
     */
    public Point getUpperLeft()
    {
        return this.upperLeft; //return the upperleft point
    }
    
    /*
     * Name: setUpperLeft
     * Purpose: This is a setter for the upper left point
     * 
     * Parameters: Point p 
     * Return: void
     */
    private void setUpperLeft( Point p )
    {
        this.upperLeft = p; //set the upperLeft point

    }
    
}
