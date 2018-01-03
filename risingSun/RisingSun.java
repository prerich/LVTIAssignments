import objectdraw.*;
import java.awt.Color;

/**
 Example: RisingSun
 * 
 * @Jennifer Robles 
 * @1/2/18
 * 
 * A program that produces an animation of the sun rising.
 * The animation is driven bt clicking the mouse button
 * The faster the mouse is clicked, the faster the sun will rise
 */
public class RisingSun extends WindowController
{
        
     private FilledOval sun;
     private Text instructions;
     private Location initLocation = new Location(150, 350);
    
    //the begin method is called when the programs starts
    public void begin()
     {   
        //create  a curcle at location (150, 350) with radius 100
        sun = new FilledOval( initLocation, 100, 100, canvas);
        sun.setColor(Color.YELLOW);
        instructions = new Text( "Please Click the mouse repeatedly", 20, 20, canvas);
        
        sun.move(0, -100);

}

    public void onMouseClick(Location point)
    {
    sun.move(0, -10);
    instructions.hide();

}
    
    public void onMouseExit (Location point)
    {
        sun.moveTo(initLocation);
        instructions.show();
        
    }
    

}