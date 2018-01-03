import objectdraw.*;
import java.awt.Color;

/**
 * Assignment: Pacman Draw
 * drawing pacman
 * 
 * @Jennifer Robles 
 * 1/3/18
 *
 */
public class pacman extends WindowController 
{
    // instance variables 
    private FilledArc pacman;
    private Location pacLocation = new Location(40, 40);
    private FramedRect food;
    
    private FilledOval circle;
    
    private Text intro;
    private Location introLocation = new Location(150, 300);
    
    private Line underline;
    private Location lineStart = new Location(150, 315);
    private Location lineEnd = new Location(210, 315);
    
    
    
    public void begin ()
    {
      pacman = new FilledArc( pacLocation, 
                             100, 100, 
                             40, 270, 
                             canvas);
              pacman.setColor(Color.YELLOW);
      food = new FramedRect(150, 70, 30, 30, canvas);
     
      circle = new FilledOval(130, 260, 100, 100, canvas);
        circle.setColor(Color.ORANGE);
        
      intro = new Text("hello there!",
                  introLocation,
                  canvas);
          intro.setColor(Color.WHITE);
                  
      underline = new Line(lineStart, lineEnd, canvas);
     
        
    }
                 


}
