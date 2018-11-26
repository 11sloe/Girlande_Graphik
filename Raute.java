import javafx.scene.canvas.*;
import javafx.scene.paint.*;

public class Raute extends Figur
{

    public Raute()
    { 
    }

    public void zeichnen(GraphicsContext gc,int x, int y)
    {
        gc.setStroke(Color.WHITE);
        gc.strokePolygon( 
            new double[] {
                5+x,8+x,5+x,2+x},
            new double []
            { 0+y,5+y,10+y,5+y}, 
            4);

    }

    public int getHoehe()
    {
        return 12;
    }

}