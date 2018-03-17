package Calculatrice;

import Calculatrice.Exception.OpException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class App extends Application {

    // Classe à charger
    private ControllerApp controllerApp; // Controller
    private FXMLLoader fxmlLoader; // Vue
    private Calculator calculator; // Modele

    App() {
        this.controllerApp = new ControllerApp();
        this.fxmlLoader = new FXMLLoader(getClass().getResource("UI.fxml"));
        this.calculator = new Calculator();
    }

    public void start(Stage primaryStage) throws Exception {
        App app = new App();

        // Initialise la Vue
        Pane root = (Pane) this.fxmlLoader.load();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        // Initialise Modele
        try {
            calculator.addOperation("+", new Addition()); //via méthode de type set : addOperation
            calculator.addOperation("-", new Soustraction());
            calculator.addOperation("*", new Multiplication());
            calculator.addOperation("/", new Division());
        } catch (OpException o) {
            System.out.println("Opération inconnue !");
        }

        // Initialise ControllerApp
        this.controllerApp.initController();
        // calculator.init(a, b, op);
        float result = calculator.calc();
    }

    public static void main(String[] args) {
        launch(args);
    }
}