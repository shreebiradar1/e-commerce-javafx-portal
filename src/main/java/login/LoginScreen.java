package login;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class LoginScreen {

	public void loginShow() throws Exception {

		// Created a common stage
		// Getting stage from StageFactory class by getter()
		StageFactory.getStage().setTitle("Login Screen");
		Parent actor = FXMLLoader.load(getClass().getResource("/login/loginMain.fxml"));
		Scene scene = new Scene(actor);

		StageFactory.getStage().setScene(scene);
		StageFactory.getStage().show();
	}

}
