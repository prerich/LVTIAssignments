import objectdraw.*;
import java.awt.*;
/**
 * Example: DrawingExample 
 * 
 * @Jennifer Robles
 * @1/2/18
 * 
 * A program that allows the user to draw by dragging the mouse.
 */
public class DrawingExample extends WindowController 
{
    
    private Location initPoint; 
    public void onMousePress(Location pressPoint)
   {
       //new Text("Pressed", pressPoint, canvas);
       initPoint = pressPoint;
    }  
    
    public void onMouseDrag(Location releasePoint)
   {
       //new Text("Released", releasePoint, canvas);
       new Line(initPoint, releasePoint, canvas);
       
       initPoint = releasePoint;
    }  

    
       
    
}
