import javafx.scene.canvas.*;
import javafx.scene.paint.*;

public class Kreis extends Figur
{
    private int radius;

    public Kreis()
    { 
        radius = 5;
    }

    public void zeichnen(GraphicsContext gc,int x, int y)
    {
        gc.setStroke(Color.WHITE);
        gc.strokeOval(x,y, radius * 2, radius * 2);
    }

    public int getHoehe()
    {
        return radius * 2+2;
    }

}