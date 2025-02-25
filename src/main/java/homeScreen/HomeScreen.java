package homeScreen;

import java.io.IOException;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class HomeScreen {
	// Here the home screen will shown
	public void show() throws IOException {

		StageFactory.getStage().setTitle("Home Screen");
		Parent actor = FXMLLoader.load(getClass().getResource("/home/switch.fxml"));
		Scene scene = new Scene(actor);

		StageFactory.getStage().setScene(scene);
		StageFactory.getStage().show();
	}
}
