package calculateur;

import calculateur.Exception.DivisionException;
import calculateur.Exception.ModelException;
import calculateur.Exception.OpException;
import calculateur.InterfaceModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private Text output;

    @FXML
    Button zero, un, deux, trois, quatre, cinq, six, sept, huit, neuf, egal, plus, moins, div, multi, puiss;

    private long number1 = 0;
    private String operator = "";
    private boolean start = true;
    private InterfaceModel interfaceModel;


    Controller(InterfaceModel interfaceModel) {
        this.interfaceModel = interfaceModel;
    }

    public void initialize() {
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
        this.egal.setOnAction(this::processOperator);
    }

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
    private void processOperator(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();

        if (!"=".equals(value)) {


            if (!operator.isEmpty())
                return;

            operator = value;
            if (output.getText().equals("")) {
                return;
            } else
                number1 = Long.parseLong(output.getText());

            output.setText("");
        } else {
            if (operator.isEmpty())
                return;

            // Calcul
            try {
                output.setText(String.valueOf(interfaceModel.calculer(number1, Long.parseLong(output.getText()), operator)));
            } catch (DivisionException d) {
                System.out.println("Division par O interdite...");
            } catch (OpException o) {
                System.out.println("Opération non définis...");
            }
            operator = "";
            start = true;
        }
    }
}
