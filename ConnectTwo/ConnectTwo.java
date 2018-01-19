import objectdraw.*;
import java.awt.*;

// A program that displays the words "Pressed" and "Released"
// where the mouse button is pressed and released while connecting
// each such pair of points with a line.
public class ConnectTwo extends WindowController{
    private FramedRect rect;
    private Double sizex;
    private Double sizey;
    private Location rectLocation;
    private FilledRect finalRect;
    private Location firstPoint;  
    private Location finalPoint; // The location where button was pressed
   //DrawingCanvas canvas;
        
    // Display "Pressed" when the button is pressed.
    public void onMousePress(Location pressPoint){
        new Text("Pressed", pressPoint, canvas);
        firstPoint = pressPoint;
        rect = new FramedRect(firstPoint, 0, 0 ,canvas);
       
        
    }
    
      public void onMouseDrag(Location p)
    {
        rect.hide();
        rect = new FramedRect(firstPoint, p, canvas);
        
       
       
    }

    // Display "Released" and draw a line from where the mouse
    // was last pressed.
    public void onMouseRelease(Location releasePoint){
        new Text("Released", releasePoint, canvas);
        new Line(firstPoint, releasePoint, canvas);
        sizex = rect.getWidth();
        sizey = rect.getHeight();
        rectLocation = rect.getLocation();
        finalRect = new FilledRect(rectLocation, sizex, sizey, canvas);
       //rect = new FramedRect(firstPoint, releasePoint, canvas);
       finalPoint = releasePoint;
    }
    
  
    
}