import javafx.scene.canvas.*;

public class Abschluss extends Listenelement
{
    public void zeichnen(GraphicsContext gc, int x, int y)
    {}

    public Listenelement untenEinfuegen(Figur f)
    {
        Knoten k = new Knoten(f);
        k.setNaechster(this);
        return k;
    }

    public Listenelement getNaechster()
    {
        return this;
    }
}
