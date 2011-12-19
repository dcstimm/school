/*
 * Name: Daryl Stimm
 *
 * Login: cs11feq
 *
 * Date: November 30, 2011
 *
 * File: CSE11_Line.java
 *
 *
 * This class creates a Line object and extends Shape. 
 *   
 */

//import classes
import java.awt.*;
import objectdraw.*;

/*
 * Name: CSE11_Line
 * Purpose: this is a Line that extends Shape
 * Parameters: None
 * Return: None
 */
public class CSE11_Line extends Shape
{   
    //these are used to store the start and end points
    private Point start; 
    private Point end;
    
    
    /*
     * Name: CSE11_Line
     * Purpose: This is a no arg ctor that creates a zero length CSE11_Line 
     * 
     * Parameters: None
     * Return: None
     */
    public CSE11_Line() 
    {
        super("CSE11_Line"); //send the name to the super
        this.setStart(new Point(0, 0)); //set the start to 0,0
        this.setEnd(new Point(0, 0)); //set the end to 0,0
    }
    
    /*
     * Name: CSE11_Line
     * Purpose: This constructor creates a CSE11_Line 
     * 
     * Parameters: Point start, Point end  
     * Return: None
     */
    public CSE11_Line( Point start, Point end ) 
    {
        super("CSE11_Line"); //send the name to the super
        this.setStart(start); //set the start
        this.setEnd(end); //set the end

    }
    
    /*
     * Name: CSE11_Line
     * Purpose: This is a copy constructor that copies a CSE11_Line 
     * 
     * Parameters: CSE11_Line line
     * Return: None
     */
    public CSE11_Line( CSE11_Line line ) 
    {
        super(line.getName()); //send the name to the super
        this.setStart(line.getStart()); //set the start from the line object
        this.setEnd(line.getEnd()); //set the end from the line object

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

        //calculate the new start point
        Point point1 = new Point( this.getStart().getX() + xDelta, 
                                  this.getStart().getY() + yDelta );

        setStart(point1); //set the new start point
        
        //calculate the new end point
        Point point2 = new Point( this.getEnd().getX() + xDelta, 
                                  this.getEnd().getY() + yDelta );

        setEnd(point2); //set the new end point
        
        
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
        //return the name, start and end points
        return "" + super.getName() + ": " + getStart().toString() + " to " + 
                                             getEnd().toString();

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
        
        //check if they are the same class
        if (this.getClass() != o.getClass())
            return false;
        
        CSE11_Line obj = ((CSE11_Line)o);   
        
        //check if the start and end points are equal
        if(this.getStart() == obj.getStart() && this.getEnd() == obj.getEnd())
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
        // return the poor man's hashcode
        return this.toString().hashCode(); 
    }
    
    /*
     * Name: getStart
     * Purpose: This is a getter for the Start point
     * 
     * Parameters: None
     * Return: Point
     */
    public Point getStart()
    {
        return this.start; //return the start point
    }
    
    /*
     * Name: getEnd
     * Purpose: This is a getter for the End point
     * 
     * Parameters: None
     * Return: Point
     */
    public Point getEnd()
    {
        return this.end; //return the end point

    }
    
    /*
     * Name: setStart
     * Purpose: This is a setter for the Start point
     * 
     * Parameters: Point p
     * Return: void
     */
    private void setStart( Point p )
    {
        this.start = p; //set the start point
    }
    
    /*
     * Name: setEnd
     * Purpose: This is a setter for the end point
     * 
     * Parameters: Point p
     * Return: void
     */
    private void setEnd( Point p )
    {
        this.end = p; //set the end point
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
        //check if fill is true or false, if true set the color
        if(fill)
        {
            //draw the line
            Line newLine = new Line(this.getStart().getX(), 
                                    this.getStart().getY(), 
                                    this.getEnd().getX(), 
                                    this.getEnd().getY(), canvas);
            
            //check if the color is null, set to black if it is
            if(c == null)
            {
                newLine.setColor(Color.BLACK); 

            }else
            {
                newLine.setColor(c); 
            }
            
        } else
        {
            //draw the line
            Line newLine = new Line(this.getStart().getX(), 
                                    this.getStart().getY(), 
                                    this.getEnd().getX(), 
                                    this.getEnd().getY(), canvas);
            //set the color
            newLine.setColor(c); 
        }

    }
    
}
