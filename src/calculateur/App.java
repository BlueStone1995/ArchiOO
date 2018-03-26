package calculateur;

import calculateur.Exception.OpException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {

    Controller controller;
    Calculator calculator;

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("UI.fxml"));

        this.calculator = initCalculator();
        this.controller = new Controller(calculator);

        loader.setController(controller);

        Parent root = loader.load();

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public Calculator initCalculator() {
        Calculator calculator = new Calculator();

        try {
            calculator.addOperation("^", new Puissance());
            calculator.addOperation("+", new Addition()); //via méthode de type set : addOperation
            calculator.addOperation("-", new Soustraction());
            calculator.addOperation("*", new Multiplication());
            calculator.addOperation("/", new Division());
        } catch (OpException o) {
            System.out.println("Opération inconnue !");
        }
        return calculator;
    }


    public static void main(String[] args) {

        launch(args);

    }
}
