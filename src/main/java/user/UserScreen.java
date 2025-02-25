package user;

import java.io.IOException;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UserScreen {
	//User-Main Screen
	public void userManagementShow() throws IOException {
		
		Stage stage = StageFactory.getStage();
		stage.setTitle("UserManagement");
		
		Parent actor = FXMLLoader.load(getClass().getResource("/user/userMain.fxml"));
		Scene scene = new Scene(actor);
		
		stage.setScene(scene);
		stage.show();
		
	}
	
	//Add-User Screen
	public void addUserShow() throws IOException {
		Stage stage = StageFactory.getStage();
		
		Parent actor = FXMLLoader.load(getClass().getResource("/user/addUser.fxml"));
		Scene scene = new Scene(actor);
		
		stage.setScene(scene);
		stage.show();
	}
	
	//Search-User Screen
	public void searchUserShow() throws IOException {
		Stage stage = StageFactory.getStage();
		
		Parent actor = FXMLLoader.load(getClass().getResource("/user/searchUser.fxml"));
		Scene scene = new Scene(actor);
		
		stage.setScene(scene);
		stage.show();
		
	}
	
	//Display Screen will be showing on it's controller class
	
	//Remove-User Screen
	public void removeUserShow() throws IOException {
		Stage stage = StageFactory.getStage();
		
		Parent actor = FXMLLoader.load(getClass().getResource("/user/removeUser.fxml"));
		Scene scene = new Scene(actor);
		
		stage.setScene(scene);
		stage.show();
	}
}
