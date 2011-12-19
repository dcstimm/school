/*
 * Name: Daryl Stimm
 *
 * Login: cs11feq
 *
 * Date: November 30, 2011
 *
 * File: Circle.java
 *
 *
 * This class creates a circle object and extends Shape. 
 *   
 */

//import classes
import java.awt.*;
import objectdraw.*;


/*
 * Name: Circle
 * Purpose: extends Shape and creates a Circle
 * Parameters: None
 * Return: None
 */
public class Circle extends Shape
{   
    private Point center; //used to store the center point
    private int radius; //used to store the radius
    
    /*
     * Name: Circle
     * Purpose: This is a no arg constructor that creates an generic Circle 
     * 
     * Parameters: None
     * Return: None
     */
    public Circle()  
    {
        super("Circle"); //send the name to the super class
        Point zero = new Point(0, 0);
        this.setCenter(zero); //set center to 0,0
        this.setRadius(0); //set radius to 0
    }
    
    /*
     * Name: Circle
     * Purpose: This constructor creates a Circle
     * 
     * Parameters: Point center, int radius 
     * Return: None
     */
    public Circle( Point center, int radius ) 
    {
        super("Circle"); //send the name to the super class
        this.setCenter(center); //set the center from the passed in params
        this.setRadius(radius); //set the radius from the passed in params      
        
    }
    
    /*
     * Name: Circle
     * Purpose: This is a copy constructor that copies a Circle 
     * 
     * Parameters: Circle c
     * Return: None
     */
    public Circle( Circle c ) 
    {
        super(c.getName()); //send the name to the super class
        this.setCenter(c.getCenter()); //set the center from the passed in param
        this.setRadius(c.getRadius()); //set the radius from the passed in param

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
        
        //create the new center point
        Point point1 = new Point( this.getCenter().getX() + xDelta, 
                                  this.getCenter().getY() + yDelta );
        
        //store the new center
        this.setCenter(point1);


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
        //return the name, center and radius string
        return "" + super.getName() + ": Center: " + 
                                      this.getCenter().toString() + 
                                      "; Radius: " + this.getRadius();

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
        if( o == null )//check if null
            return false;
        
        //see if the are the same class
        if (this.getClass() != o.getClass())
            return false;
        
        Circle obj = ((Circle)o);   
        
        //check to see if the center and radius are equal
        if(this.getCenter() == obj.getCenter() && 
           this.getRadius() == obj.getRadius())
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
     * Name: getCenter
     * Purpose: This is a getter for the Center point
     * 
     * Parameters: None
     * Return: Point
     */
    public Point getCenter()
    {
        //return the center
        return this.center;
    }
    
    /*
     * Name: getCenter
     * Purpose: This is a getter for the Radius
     * 
     * Parameters: None
     * Return: int
     */
    public int getRadius()
    {
        //return the radius
        return this.radius;
    }
    
    /*
     * Name: setCenter
     * Purpose: This is a setter for the Center point
     * 
     * Parameters: Point center
     * Return: void
     */
    private void setCenter( Point center )
    {
        //set the center
        this.center = center;
    }
    
    /*
     * Name: setRadius
     * Purpose: This is a setter for the radius
     * 
     * Parameters: int radius
     * Return: void
     */
    private void setRadius( int radius )
    {
        //set the radius
        this.radius = radius;
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
        //create a temp Location with the center values
        Location temp = new Location (center.getX(), center.getY()); 
        
        //calculate the new center location
        double centerX = temp.getX() - (this.getRadius());
        double centerY = temp.getY() - (this.getRadius());

        //this location represents the new center
        Location newCenter = new Location(centerX, centerY);
         
        //check if filled param has been passed in and draw the circle
        if(fill)
        {
            FilledOval newFilledOval = new FilledOval(newCenter, 
                                                      this.getRadius() * 2, 
                                                      this.getRadius() * 2, 
                                                      canvas);
            newFilledOval.setColor(c); //set the color

        } else
        {
            FramedOval newFramedOval = new FramedOval(newCenter, 
                                                      this.getRadius() * 2, 
                                                      this.getRadius() * 2, 
                                                      canvas);
        }
    }
    
}
