package calculateur;

import calculateur.Exception.DivisionException;
import calculateur.Exception.ModelException;
import calculateur.Exception.OpException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class GestionnaireApp {

    private Controller controller;

    GestionnaireApp(Stage primaryStage) throws Exception {

        // Initialise controller et vue
        this.controller = new Controller(); // Crée Controller

        FXMLLoader loader = new FXMLLoader(getClass().getResource("UI.fxml"));
        Parent root = loader.load();

        loader.setController(this.controller);

        primaryStage.setScene(new Scene(root));
        primaryStage.show();


        try {
            this.controller.addModele("calculator", new Calculator()); // Crée InterfaceModel
        } catch (ModelException o) {
            System.out.println("InterfaceModel inconnue !");
        }
    }

}
