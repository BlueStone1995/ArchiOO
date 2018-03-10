package Calculatrice;

import Calculatrice.Exception.DivisionException;
import Calculatrice.Exception.OpException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private Text output;

    private long number1 = 0;
    private String operator = "";
    private boolean start = true;

    private Calculator calculator = new Calculator();

    @FXML
    private void processNumpad(ActionEvent event) {
        if (start) {
            output.setText("");
            start = false;
        }

        String value = ((Button) event.getSource()).getText();
        output.setText(output.getText() + value);
    }

    @FXML
    private void processDelete(ActionEvent event) {
        output.setText("");
        start = false;
    }

    @FXML
    private void processOperator(ActionEvent event) throws OpException, DivisionException {
        String value = ((Button) event.getSource()).getText();

        if (!"=".equals(value)) {
            if (!operator.isEmpty())
                return;

            operator = value;
            number1 = Long.parseLong(output.getText());
            output.setText("");
        } else {
            if (operator.isEmpty())
                return;
            System.out.println("n1: " + number1);
            System.out.println("out: " + output.getText());
            System.out.println("op: " + operator);


            // Implémentation classe Exo3

            // Ajoute opérations
            try {
                calculator.addOperation("+", new Addition()); //via méthode de type set : addOperation
                calculator.addOperation("-", new Soustraction());
                calculator.addOperation("*", new Multiplication());
                calculator.addOperation("/", new Division());
                calculator.addOperation("^", new Puissance());
            } catch (OpException o) {
                System.out.println("Opération inconnue !");
            }

            // Initialise Calculator
            calculator.init(number1, Long.parseLong(output.getText()), operator);

            // Renvoie résultat
            try {
                calculator.calc();
                output.setText(String.valueOf(calculator.calc()));
            } catch (DivisionException e) {
                output.setText("Division par 0 interdite...");
            }


            operator = "";
            start = true;
        }
    }
}
