import javafx.scene.canvas.*;
import javafx.scene.paint.*;

public class Stern extends Figur
{

    public Stern()
    { 
    }

    public void zeichnen(GraphicsContext gc,int x, int y)
    {
        gc.setStroke(Color.WHITE);
        gc.strokePolygon( 
            new double[] {
                5 +x,5+x, 10+x,5+x, 8+x,5+x, 2+x,5+x, 0+x,5+x},
            new double []
            { 0+y, 5+y,3+y,5+y, 10+y,5+y, 10+y,5+y, 3+y,5+y}, 
            10);

    }

    public int getHoehe()
    {
        return 12;
    }

}