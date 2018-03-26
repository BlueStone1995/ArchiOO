/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package CalculatriceMVCV2;


import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class App extends Application {
    CalculatriceController c;
    Calculator m;


    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("View.fxml"));

        this.m = initCalculatrice();
        this.c = new CalculatriceController(m);

        loader.setController(c);

        Parent root  = loader.load();

        Scene sc = new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.show();
    }

    public Calculator initCalculatrice() {
        Calculator m = new Calculator();
        m.addOperation("+", new Addition());
        m.addOperation("-", new Soustraction());
        m.addOperation("*", new Multiplication());
        m.addOperation("/", new Division());
        return m;
    }


    public static void main( String args[]){

        launch(args);

    }

}
