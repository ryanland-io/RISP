module RISP {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	
	opens main.java to javafx.graphics, javafx.fxml;
	opens main.java.controllers to javafx.graphics, javafx.fxml;
}
