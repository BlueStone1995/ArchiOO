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

    @FXML
    private javafx.scene.text.Text output;
    private boolean start;
    private long number1;
    private String operator;

    private Controller controller;

    GestionnaireApp(Stage primaryStage) throws Exception {

        // Crée Vue
        Parent root = FXMLLoader.load(getClass().getResource("UI.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        // Initialise données vue
        this.start = true;
        this.number1 = 0;
        this.operator = "";

        // // Initialise controller
        this.controller = new Controller(); // Crée Controller
        try {
            controller.addModele("calculator", new Calculator()); // Crée Model
        } catch (ModelException o) {
            System.out.println("Model inconnue !");
        }


    }


    @FXML
    private void processNumpad(ActionEvent event) {
        if (this.start) {
            output.setText("");
            this.start = false;
        }

        String value = ((Button) event.getSource()).getText();
        output.setText(output.getText() + value);
    }

    @FXML
    private void processOperator(ActionEvent event) throws DivisionException {
        String value = ((Button) event.getSource()).getText();

        if (!"=".equals(value)) {
            if (!this.operator.isEmpty())
                return;

            this.operator = value;
            this.number1 = Long.parseLong(output.getText());
            output.setText("");
        } else {
            if (this.operator.isEmpty())
                return;
            System.out.println("n1: " + this.number1);
            System.out.println("out: " + output.getText());
            System.out.println("op: " + this.operator);

            // Calcul
            try {
                float result = this.controller.calculer(this.number1, Long.parseLong(output.getText()), this.operator);
                String resultatString = String.valueOf(result);
                output.setText(resultatString);
            } catch (DivisionException d) {
                System.out.println("Division par O interdite...");
            } catch (OpException o) {
                System.out.println("Opération non définis...");
            }
            this.operator = "";
            this.start = true;
        }
    }
}
