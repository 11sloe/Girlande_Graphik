import javafx.scene.canvas.*;
public abstract class Figur
{

    public abstract void zeichnen(GraphicsContext gc, int x, int y);
    public abstract int getHoehe();
}
