
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.canvas.*;
import javafx.event.ActionEvent;

public class Controller {
    @FXML
    private Canvas canvas;

    private GraphicsContext gc;
    private Girlande girlande;

    public Controller()
    {
        girlande = new Girlande();

    }

    @FXML
    public void initialize() {
        gc = canvas.getGraphicsContext2D();
    }

    @FXML
    void kreisGeklickt(ActionEvent event) {
        girlande.untenEinfuegen(new Kreis());
        girlande.zeichnen(gc);
    }

    @FXML
    void sternGeklickt(ActionEvent event) {
        girlande.untenEinfuegen(new Stern());
        girlande.zeichnen(gc);
    }

    @FXML
    void rauteGeklickt(ActionEvent event) {
        girlande.untenEinfuegen(new Raute());
        girlande.zeichnen(gc);
    }

    @FXML
    void entfernen(ActionEvent event) {
        girlande.obenEntnehmen();
        girlande.zeichnen(gc);
    }

}