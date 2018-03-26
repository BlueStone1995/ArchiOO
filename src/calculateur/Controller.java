package calculateur;

import calculateur.Exception.DivisionException;
import calculateur.Exception.ModelException;
import calculateur.Exception.OpException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.util.HashMap;

public class Controller {

    @FXML
    Button zero, un, deux, trois, quatre, cinq, six, sept, huit, neuf, egal, plus, moins, div, multi, puiss;
    private javafx.scene.text.Text output;
    private boolean start;
    private long number1;
    private String operator;

    private HashMap<String, InterfaceModel> model;
    private String mod;

    Controller() {
        this.mod = "calculator";
        this.model = new HashMap<String, InterfaceModel>();
    }

    public float calculer(float a, float b, String op) throws OpException, DivisionException {
        InterfaceModel calculator = this.model.get("calculator");

        try {
            calculator.addOperation("+", new Addition()); //via méthode de type set : addOperation
            calculator.addOperation("-", new Soustraction());
            calculator.addOperation("*", new Multiplication());
            calculator.addOperation("/", new Division());
            calculator.addOperation("^", new Puissance());
        } catch (OpException o) {
            System.out.println("Opération inconnue !");
        }

        calculator.init(a, b, op);
        return calculator.calc();
    }

    public void addModele(String sym, InterfaceModel model) throws ModelException {
        if (this.mod.equals("calculator")) {
            this.model.put(sym, model); // Ajoute model dans map
        } else {
            new ModelException();
        }
    }

    public void initialize() {

        // Initialise données vue
        this.start = true;
        this.number1 = 0;
        this.operator = "";

        this.zero.setOnAction(this::processNumpad);
        this.un.setOnAction(this::processNumpad);
        this.deux.setOnAction(this::processNumpad);
        this.trois.setOnAction(this::processNumpad);
        this.quatre.setOnAction(this::processNumpad);
        this.cinq.setOnAction(this::processNumpad);
        this.six.setOnAction(this::processNumpad);
        this.sept.setOnAction(this::processNumpad);
        this.huit.setOnAction(this::processNumpad);
        this.neuf.setOnAction(this::processNumpad);
        this.plus.setOnAction(this::processOperator);
        this.moins.setOnAction(this::processOperator);
        this.div.setOnAction(this::processOperator);
        this.puiss.setOnAction(this::processOperator);
        this.multi.setOnAction(this::processOperator);
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
    private void processOperator(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();

        if (!"egal".equals(value)) {
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
                float result = this.calculer(this.number1, Long.parseLong(output.getText()), this.operator);
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
