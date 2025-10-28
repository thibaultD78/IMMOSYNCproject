package sio.immosync.controler;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public ImageView btnEntrepreneur;
    public ImageView btnInspecteur;
    public ImageView btnProprio;
    public ImageView btnInscription;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void ClickEntreppreneur(MouseEvent mouseEvent) {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        
    }

    public void ClickInspecteur(MouseEvent mouseEvent) {
    }

    public void ClickProprio(MouseEvent mouseEvent) {
    }

    public void ClickInscription(MouseEvent mouseEvent) {
    }
}
