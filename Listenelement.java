import javafx.scene.canvas.*;

public abstract class Listenelement
{
    public abstract void zeichnen(GraphicsContext gc, int x, int y);

    public abstract Listenelement untenEinfuegen(Figur f);

    public abstract Listenelement getNaechster();

}
