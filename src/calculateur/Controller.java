/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package calculateur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.input.InputEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;

public class Controller {

	@FXML
	private Text output;

	@FXML
	private MenuBar menuBar;
	  
	private long number1 = 0;
	private String operator = "";
	private boolean start = true;

	private Model model = new Model();

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
			number1 = Long.parseLong(output.getText());
			output.setText("");
		} else {		
			if (operator.isEmpty())
				return;
			System.out.println("n1: "+number1);
			System.out.println("out: "+output.getText());
			System.out.println("op: "+operator);
			
			output.setText(String.valueOf(model.calculate(number1, Long.parseLong(output.getText()), operator)));
			operator = "";
			start = true;
		}
	}
	
	 /**
	   * Handle action related to input (in this case specifically only responds to
	   * keyboard event CTRL-A).
	   * 
	   * @param event Input event.
	   */
	  @FXML
	  private void handleKeyInput(final InputEvent event)
	  {
	     if (event instanceof KeyEvent)
	     {
	        final KeyEvent keyEvent = (KeyEvent) event;
	        if (keyEvent.isControlDown() && keyEvent.getCode() == KeyCode.A)
	        {
	           //provideAboutFunctionality();
	        }
	     }
	  }
	  
	  /**
	   * Perform functionality associated with "About" menu selection or CTRL-A.
	   */
	  private void provideAboutFunctionality()
	  {
	     System.out.println("Calculateur version 19/12/2017");      
	  }

}
