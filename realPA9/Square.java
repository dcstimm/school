/*
 * Name: Daryl Stimm
 *
 * Login: cs11feq
 *
 * Date: November 30, 2011
 *
 * File: Square.java
 *
 *
 * This class creates a square object and extends ARectangle. 
 *   
 */

//import classes
import java.awt.*;
import objectdraw.*;

/*
 * Name: Square
 * Purpose: this is a Square that extends ARectangle
 * Parameters: None
 * Return: None
 */
public class Square extends ARectangle
{   
    private int side; //this is used to store the side
    
    /*
     * Name: Square
     * Purpose: This is a no arg constructor that creates an empty Square 
     * 
     * Parameters: None
     * Return: None
     */
    public Square()  
    {
        super("Square", 0, 0); //pass in the name and the upperleft
        this.setSide(0); //set the side to 0
    } 
    
    /*
     * Name: Square
     * Purpose: This constructor creates a Square from two x an y points
     * 
     * Parameters: int x, int y, int side
     * Return: None
     */
    public Square( int x, int y, int side ) 
    {
        super("Square", x, y); //pass in the name and the upperleft
        this.setSide(side); //set the side
    }
    
    /*
     * Name: Square
     * Purpose: This constructor creates a Square from a Point
     * 
     * Parameters: Point upperLeft, int side
     * Return: None
     */
    public Square( Point upperLeft, int side )
    {
        super("Square", upperLeft); //pass in the name and the upperleft
        this.setSide(side); //set the side

    }
    
    /*
     * Name: Square
     * Purpose: This is a copy constructor that copies a Square 
     * 
     * Parameters: Square r
     * Return: None
     */
    public Square( Square r ) 
    {
        super(r.getName(), r.getUpperLeft()); //copy name and the upperleft
        this.setSide(r.getSide()); //copy the side from r

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
        //return the name, upperleft and side string
        return "" + super.getName() + super.toString() + 
                                            " Sides: " + this.getSide();
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
        
        //check if the upper left point is the same
        super.equals(o);
        
        //check if the classes are equal
        if (this.getClass() != o.getClass())
            return false;
        
        Square obj = ((Square)o);   
        
        //check the side to see if they are equal
        if(this.getSide() == obj.getSide())
        {
            return true;
        }
        return false;
    }
    
    /*
     * Name: getSide
     * Purpose: This is a getter for the side 
     * 
     * Parameters: None
     * Return: int
     */
    public int getSide()
    {
        return this.side; //return the side
    }
    
    /*
     * Name: setSide
     * Purpose: This is a setter for the side 
     * 
     * Parameters: int side
     * Return: void
     */
    private void setSide( int side )
    {
        this.side = side; //set the side
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
        //calculate the upperleft point
        Location temp = new Location (super.getUpperLeft().getX(), 
                                      super.getUpperLeft().getY()); 
        
        //if the fill is true, use a filled rect, otherwise use a framed rect
        if(fill)
        {
            //draw a square
            FilledRect newFilledRect = new FilledRect(temp, this.getSide(), 
                                                      this.getSide(), canvas);
            //set the color
            newFilledRect.setColor(c);
            
            
        } else
        {
            //draw a square
            FramedRect newFramedRect = new FramedRect(temp, this.getSide(), 
                                                      this.getSide(), canvas);
            //set the color
            newFramedRect.setColor(c);

        }
    }

}
