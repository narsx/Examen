package application.control;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Control2 {
	@FXML
	public Button closeButton1;
	@FXML
	private void cerrarStage() {
		Stage stage = (Stage) closeButton1.getScene().getWindow();
	    stage.close();
	}
}
