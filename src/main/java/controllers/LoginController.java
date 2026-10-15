package main.java.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;

public class LoginController {
	
	@FXML
	private TextField loginUsernameField;
	
	@FXML
	private PasswordField loginPasswordField;
	
	public void login(ActionEvent event) throws IOException {
		String username = loginUsernameField.getText();
		String password = loginPasswordField.getText();
		
		// TODO: handle login
		System.out.println(String.format("Username: %s | Password: %s", username, password));
		
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();		
		Parent root = FXMLLoader.load(getClass().getResource("/main/resources/views/Main.fxml"));
		stage.setScene(new Scene(root));			
	}
}
