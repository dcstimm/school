/*
 * Name: Daryl Stimm
 *
 * Login: cs11feq
 *
 * Date: November 30, 2011
 *
 * File: Rectangle.java
 *
 *
 * This class creates a Rectangle object and extends ARectangle. 
 *   
 */

//import classes
import java.awt.*;
import objectdraw.*;


/*
 * Name: Rectangle
 * Purpose: this is a Rectangle that extends ARectangle
 * Parameters: None
 * Return: None
 */
public class Rectangle extends ARectangle
{   
    //these are used to store the width and height
    private int width;
    private int height;
    
    /*
     * Name: Rectangle
     * Purpose: This is a no arg constructor that creates an empty Rectangle 
     * 
     * Parameters: None
     * Return: None
     */
    public Rectangle() 
    {
        super("Rectangle", 0, 0); //set the name and upperleft point to 0,0
        this.setWidth(0); //set the width to 0
        this.setHeight(0); //set the height to 0
    }
    
    /*
     * Name: Rectangle
     * Purpose: This constructor creates a Rectangle from two x an y points
     * 
     * Parameters: int x, int y, int width, int height
     * Return: None
     */
    public Rectangle(int x, int y, int width, int height) 
    {
        super("Rectangle", x, y); //set the name and upperleft point
        this.setWidth(width); //set the width
        this.setHeight(height); //set the height
    }
    
    /*
     * Name: Rectangle
     * Purpose: This constructor creates a Rectangle from a Point
     * 
     * Parameters: Point upperLeft, int width, int height
     * Return: None
     */
    public Rectangle(Point upperLeft, int width, int height)
    {
        super("Rectangle", upperLeft); //set the name and upperleft point
        this.setWidth(width); //set the width
        this.setHeight(height); //set the height
    }
    
    /*
     * Name: Rectangle
     * Purpose: This is a copy constructor that copies a Rectangle 
     * 
     * Parameters: Rectangle r
     * Return: None
     */
    public Rectangle(Rectangle r) 
    {
        super(r.getName(), r.getUpperLeft()); //copy the name, upperleft point
        this.setWidth(r.getWidth()); //copy the width
        this.setHeight(r.getHeight()); //copy the height

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
        //return the name, upperpoint, width, and height strings
        return "" + super.getName() + super.toString() + " Width: " + 
                    this.getWidth() + " Height: " + this.getHeight();
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
        //check that o is not null
        if( o == null )
            return false;
        
        //check if the upperleft point is equal
        super.equals(o);
        
        //check if the classes are the same
        if (this.getClass() != o.getClass())
            return false;
        
        Rectangle obj = ((Rectangle)o);   
        
        //check that the height and width are equal
        if(this.getHeight() == obj.getHeight() && 
           this.getWidth() == obj.getWidth())
        {
            return true;
        }
        return false;
        
    }
    
    /*
     * Name: getHeight
     * Purpose: This is a getter for the height 
     * 
     * Parameters: None
     * Return: int
     */
    public int getHeight()
    {
        return this.height; //return the height
    }
    
    /*
     * Name: setHeight
     * Purpose: This is a setter for the height 
     * 
     * Parameters: int h
     * Return: void
     */
    private void setHeight( int h )
    {
        this.height = h; //set the height
    }
    
    /*
     * Name: getWidth
     * Purpose: This is a getter for the width 
     * 
     * Parameters: None
     * Return: int
     */
    public int getWidth()
    {
        return this.width; //return the width
    }
    
    /*
     * Name: setWidth
     * Purpose: This is a setter for the width 
     * 
     * Parameters: int w
     * Return: void
     */
    private void setWidth( int w )
    {
        this.width = w; //set the width
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
        //calculate the rectangle upperleft location
        Location temp = new Location (super.getUpperLeft().getX(), 
                                      super.getUpperLeft().getY()); 
          
        //check if fill is true or false, if true use a filled rect
        if(fill)
        {
            //draw the filled rect
            FilledRect newFilledRect = new FilledRect(temp, this.getWidth(), 
                                                      this.getHeight(), canvas);
            //set the color
            newFilledRect.setColor(c);
            
            
        } else
        {
            //draw the filled rect
            FramedRect newFramedRect = new FramedRect(temp, this.getWidth(), 
                                                      this.getHeight(), canvas);
            //set the color
            newFramedRect.setColor(c);

        }
    }
    
}
