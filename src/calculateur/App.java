package calculateur;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Chargement Model, Vue et Controller
        GestionnaireApp gestionnaireApp = new GestionnaireApp(primaryStage);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
