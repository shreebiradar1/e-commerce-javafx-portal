package ecomMain;

import common.StageFactory;
import javafx.application.Application;
import javafx.stage.Stage;
import login.LoginScreen;

public class EcommerceMain extends Application{
	 public static void main(String[] args) {
		Application.launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Setting on only one stage and reusing that stage (primaryStage)
		StageFactory.setStage(primaryStage);
		//Showing LoginScreen
		new LoginScreen().loginShow();
		
	}
}
