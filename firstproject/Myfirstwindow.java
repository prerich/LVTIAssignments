import objectdraw.*;
import java.awt.Color;

/**
 * Write a description of class Myfirstwindow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Myfirstwindow extends WindowController
{
    // instance variables - replace the example below with your own
    private Line line1;
    private Text text1;
    private FramedRect rect1;
    private FilledOval oval1;
    private FramedOval framedoval1;
    
    
    public void begin ()
    {
     line1 = new Line(0,0,50,45,canvas);
     text1 = new Text("Hello Java",100,100,canvas);
     rect1 = new FramedRect(95,100,75,15,canvas);
     oval1 = new FilledOval(200,200,25,25,canvas);
     oval1.setColor(Color.RED);
     
     framedoval1 = new FramedOval(175,175,75,75,canvas);

    }
    
    
    public void onMouseClick(Location p)
    {
        
        
    }
}
