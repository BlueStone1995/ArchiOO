/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package CalculatriceMVCV2;

import Exceptions.MainException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;



public class CalculatriceController {
    @FXML
    private Text output;

    private long number1 = 0;
    private String operator = "";
    private boolean start = true;
    private Inmodele map;

    @FXML
    Button bou0, bou1, bou2, bou3, bou4, bou5, bou6, bou7, bou8, bou9, opadd, opsous, opmul, opdiv,opegal ;

    public CalculatriceController(Inmodele m) {
        this.map = m;
    }
    

    public void initialize() {
        this.bou1.setOnAction(this::Nombre);
        this.bou2.setOnAction(this::Nombre);
        this.bou3.setOnAction(this::Nombre);
        this.bou4.setOnAction(this::Nombre);
        this.bou5.setOnAction(this::Nombre);
        this.bou6.setOnAction(this::Nombre);
        this.bou7.setOnAction(this::Nombre);
        this.bou8.setOnAction(this::Nombre);
        this.bou9.setOnAction(this::Nombre);
        this.bou0.setOnAction(this::Nombre);
        this.opadd.setOnAction(this::Operateur);
        this.opsous.setOnAction(this::Operateur);
        this.opmul.setOnAction(this::Operateur);
        this.opdiv.setOnAction(this::Operateur);
        this.opegal.setOnAction(this::Operateur);

    }

    @FXML
    private void Nombre(ActionEvent event) {
        if (start) {
            output.setText("");
            start = false;
        }

        String value = ((Button)event.getSource()).getText();
        output.setText(output.getText() + value);
    }


    @FXML
    private void Operateur(ActionEvent event)  {
        String value = ((Button)event.getSource()).getText();

        if (!"=".equals(value)) {



            if (!operator.isEmpty())
                return;

            operator = value;
            if(output.getText() == "") {
                return;
            }else
                number1 = Long.parseLong(output.getText());

            output.setText("");
        }
        else {
            if (operator.isEmpty())
                return;

            try {
                output.setText(String.valueOf(map.calculer(number1, Long.parseLong(output.getText()), operator)));
            }
            catch(MainException e) {
            }
            operator = "";
            start = true;
        }
    }
    }



