import javafx.scene.canvas.*;
public class Girlande
{
    private Listenelement erster;

    public Girlande()
    {
        erster = new Abschluss();
    }

    public void untenEinfuegen(Figur f)
    {
        erster = erster.untenEinfuegen(f);        
    }

    public void obenEntnehmen()
    {
        erster = erster.getNaechster();

    }

    public void obenEinfuegen(Figur f)
    {
        Knoten k = new Knoten(f);
        k.setNaechster(erster);
        erster = k;
    }

    public void zeichnen(GraphicsContext gc)
    {
        gc.clearRect(0,0,310,274);
        erster.zeichnen(gc,150,0);
    }
}
