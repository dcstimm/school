/*
 * Name: Daryl Stimm
 *
 * Login: cs11feq
 *
 * Date: November 30, 2011
 *
 * File: Shape.java
 *
 *
 * This class creates a generic Shape object and is abstract. 
 *   
 */

//import classes
import java.awt.*;
import objectdraw.*;

/*
 * Name: Shape
 * Purpose: other objects can extend Shape, this class is abstract
 * Parameters: None
 * Return: None
 */
public abstract class Shape
{   
    private String name;
    
    /*
     * Name: Rectangle
     * Purpose: This is a no arg constructor that creates an generic Shape 
     * 
     * Parameters: None
     * Return: None
     */
    public Shape() 
    {
        this.setName("Shape"); //set name
    }
    
    /*
     * Name: Shape
     * Purpose: This constructor creates a Shape Object
     * 
     * Parameters: String name 
     * Return: None
     */
    public Shape( String name ) 
    {
        this.setName(name); //set the name to the passed in name
    }
    
    /*
     * Name: getName
     * Purpose: This is a getter for the name
     * 
     * Parameters: None
     * Return: String
     */
    public String getName() 
    {
        return name; //return the name
    }
    
    /*
     * Name: setName
     * Purpose: This is a setter for the name
     * 
     * Parameters: String name
     * Return: void
     */
    private void setName( String name ) 
    {
        this.name = name; //set and store the name
    } 
    
    /*
     * Name: move
     * Purpose: This abstract method will move the Shape
     * 
     * Parameters: int xDelta, int yDelta 
     * Return: void
     */
    public abstract void move( int xDelta, int yDelta );
    
    /*
     * Name: draw
     * Purpose: This abstract method draws the shape on the canvas
     * 
     * Parameters: DrawingCanvas canvas, Color c, boolean fill
     * Return: void
     */
    public abstract void draw( DrawingCanvas canvas, Color c, boolean fill );
}

