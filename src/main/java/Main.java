package main.java;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	
	// TODO: Configure to show login on startup based on configuration
	Boolean isLoggedIn = false;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Parent root;
			
			// TODO: temp for testing
			if (!isLoggedIn) {
				root = FXMLLoader.load(getClass().getResource("/main/resources/views/Login.fxml"));
			} else {
				root = FXMLLoader.load(getClass().getResource("/main/resources/views/Main.fxml"));
			}
			
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/main/resources/css/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
