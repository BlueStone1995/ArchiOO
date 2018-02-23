package Calculatrice;

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
    private void processOperator(ActionEvent event) {
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

            if ("x2".equals(operator)) {
                output.setText(String.valueOf(calculator.calculateUnary(number1, operator)));
            } else {
                // Implémentation classe Exo3

                // Ajoute opérations
                calculator.addOperation("+", new Addition());
                calculator.addOperation("-", new Soustraction());
                calculator.addOperation("*", new Multiplication());
                calculator.addOperation("/", new Division());

                // Initialise Calculator
                calculator.init(number1, Long.parseLong(output.getText()), operator);

                // Renvoie résultat
                try {
                    calculator.calc();
                    output.setText(String.valueOf(calculator.calc()));
                } catch (Error e) {
                    output.setText("Division par 0 interdite...");
                }
            }

            operator = "";
            start = true;
        }
    }
}
