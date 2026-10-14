package main.java.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
	
	@FXML
	private TextField loginUsernameField;
	
	@FXML
	private PasswordField loginPasswordField;
	
	public void login(ActionEvent event) {
		
		String username = loginUsernameField.getText();
		
		String password = loginPasswordField.getText();
		
		System.out.println(String.format("Username: %s | Password: %s", username, password));
	}
	

}
