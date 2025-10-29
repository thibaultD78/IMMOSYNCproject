package sio.immosync.controler;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private ImageView btnEntrepreneur;
    @FXML
    private ImageView btnInspecteur;
    @FXML
    private ImageView btnProprio;
    @FXML
    private ImageView btnInscription;
    @FXML
    private ImageView btnConnexion;
    @FXML
    private TextField txtLogin;
    @FXML
    private TextField txtMdp;
    @FXML
    private Label welcomeText;

    @FXML
    private AnchorPane paneProfils;
    @FXML
    private AnchorPane paneConnexion;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Tu peux mettre ici des initialisations si besoin
    }

    public void ClickInspecteur(MouseEvent mouseEvent) {
        switchToConnexion();
    }

    public void ClickProprio(MouseEvent mouseEvent) {
        switchToConnexion();
    }



    private void switchToConnexion() {
        paneProfils.setVisible(false);
        paneProfils.setManaged(false);
        paneConnexion.setVisible(true);
        paneConnexion.setManaged(true);
    }

    public void ClickEntreppreneur(MouseEvent mouseEvent) {
    }

    public void btnSinscrire2(MouseEvent mouseEvent) {
    }

    public void btnInscriptionP1(MouseEvent mouseEvent) {
    }

    public void btnConnecterP2(MouseEvent mouseEvent) {
    }
}
