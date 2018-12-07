package application.control;

import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Control1 {
	@FXML
	ImageView logoLabel;
	@FXML
	public Button openButton;

	public void initialize() {
		openButton.setTooltip(new Tooltip("Tooltip Button"));
		FadeTransition fadeTransition = new FadeTransition(
			Duration.seconds(2), logoLabel);
			logoLabel.setVisible(true);
			fadeTransition.setFromValue(0);
			fadeTransition.setToValue(1);
			fadeTransition.play();
					
	}
	
	private Stage stage;
	@FXML
	private void sendStage() {
		try {
	        FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(getClass().getResource("OffView.fxml"));
	        AnchorPane mypane = (AnchorPane) loader.load();
	        Scene scene= new Scene(mypane);
	        stage = new Stage();
	        stage.setTitle("Fernando Olmedo");
	        stage.setScene(scene);
	        stage.show();
	          
	    } catch (IOException e) {
	        
	    }
	}
	
	
}
