package application.control;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
/**
 * 
 * @author 21743715
 *
 */


public class Main extends Application {
private AnchorPane mypane;


	
	@Override
	public void start(Stage stage) throws IOException {

		// cargas la vista fxml en FXMLLloader
		FXMLLoader loader = new FXMLLoader(getClass().getResource("MainView.fxml"));
	
		mypane = (AnchorPane) loader.load();
		
		// add scene y titulo
		stage.setTitle("Fernando Olmedo");
		stage.setScene(new Scene(mypane));
		
		stage.show();
		
		Font.loadFont(
				getClass().getResourceAsStream(
						"assets/PoiretOne-Regular.ttf"), 20);
		
		
		
	}

	
	public static void main(String[] args) {
		launch(args);
		
	}
}
