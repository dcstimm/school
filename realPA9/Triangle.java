/*
 * Name: Daryl Stimm
 *
 * Login: cs11feq
 *
 * Date: November 30, 2011
 *
 * File: Triangle.java
 *
 *
 * This class creates a triangle object and extends Shape. 
 *   
 */

//import classes
import java.awt.*;
import objectdraw.*;

/*
 * Name: Triangle
 * Purpose: this is a Triangle that extends Shape
 * Parameters: None
 * Return: None
 */
public class Triangle extends Shape
{   
    
    //these are used to set the points used to draw the triangle
    private Point p1;
    private Point p2;
    private Point p3;
    
    
    /*
     * Name: Triangle
     * Purpose: This is a no arg constructor that creates an empty Triangle 
     * 
     * Parameters: None
     * Return: None
     */
    public Triangle() 
    {
        super("Triangle"); //send the name to the super
        this.setP1(new Point(0, 0)); //set the first point to 0,0
        this.setP2(new Point(0, 0)); //set the second point to 0,0
        this.setP3(new Point(0, 0)); //set the third point to 0,0

    }
    
    /*
     * Name: Triangle
     * Purpose: This constructor creates a Triangle 
     * 
     * Parameters: Point p1, Point p2, Point p3
     * Return: None
     */
    public Triangle( Point p1, Point p2, Point p3 ) 
    {
        super("Triangle"); //send the name to the super
        this.setP1(p1); //set the first point
        this.setP2(p2); //set the second point
        this.setP3(p3); //set the third point

    }
    
    /*
     * Name: Triangle
     * Purpose: This is a copy constructor that copies a Triangle 
     * 
     * Parameters: Triangle tri
     * Return: None
     */
    public Triangle( Triangle tri )
    {
        super(tri.getName()); //copy the name 
        this.setP1(tri.getP1()); //copy the first point
        this.setP2(tri.getP2()); //copy the second point
        this.setP3(tri.getP3()); //copy the third point

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
        
        //calculate the new first point
        Point point1 = new Point( this.getP1().getX() + xDelta, 
                                  this.getP1().getY() + yDelta );
        
        this.setP1(point1); //set the new point
        
        //calculate the new first point
        Point point2 = new Point( this.getP2().getX() + xDelta, 
                                  this.getP2().getY() + yDelta );
        
        this.setP2(point2); //set the new point
        
        //calculate the new first point
        Point point3 = new Point( this.getP3().getX() + xDelta, 
                                  this.getP3().getY() + yDelta );
        
        this.setP3(point3); //set the new point
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
        //return the name, first point, second point, and third point
        return "" + super.getName() + ": " + getP1().toString() + ", " 
                  + getP2().toString() + ", " + getP3().toString();
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
        
        Triangle obj = ((Triangle)o);   
        
        //check that all the points are equal
        if(this.getP1() == obj.getP1() && 
           this.getP2() == obj.getP2() && 
           this.getP3() == obj.getP3())
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
     * Name: getP1
     * Purpose: This is a getter for the first point 
     * 
     * Parameters: none
     * Return: Point
     */
    public Point getP1()
    {
        return p1; //return the first point
    }
    
    /*
     * Name: setP1
     * Purpose: This is a setter for the first point 
     * 
     * Parameters: Point p1
     * Return: void
     */
    private void setP1( Point p1 )
    {
        this.p1 = p1; //set the first point
    }
    
    /*
     * Name: getP2
     * Purpose: This is a getter for the second point 
     * 
     * Parameters: none
     * Return: Point
     */
    public Point getP2()
    {
        return p2; //return the second point
    }
    
    /*
     * Name: setP2
     * Purpose: This is a setter for the second point 
     * 
     * Parameters: Point p2
     * Return: void
     */
    private void setP2( Point p2 )
    {
        this.p2 = p2; //set the second point

    }
    
    /*
     * Name: getP3
     * Purpose: This is a getter for the third point 
     * 
     * Parameters: none
     * Return: Point
     */
    public Point getP3()
    {
        return p3; //return the third point
    }
    
    /*
     * Name: setP3
     * Purpose: This is a setter for the third point 
     * 
     * Parameters: Point p3
     * Return: void
     */
    private void setP3( Point p3 )
    {
        this.p3 = p3; //set the third point
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
        
        //create the triangle using our cse11 line
        CSE11_Line newLine0 = new CSE11_Line(this.getP1(), this.getP2());
        CSE11_Line newLine1 = new CSE11_Line(this.getP2(), this.getP3());
        CSE11_Line newLine2 = new CSE11_Line(this.getP3(), this.getP1());
        
        //manually draw our triangle
        newLine0.draw( canvas, c, fill);
        newLine1.draw( canvas, c, fill);
        newLine2.draw( canvas, c, fill);
        
    }
    
}