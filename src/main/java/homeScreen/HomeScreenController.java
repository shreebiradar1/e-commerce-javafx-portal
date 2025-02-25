package homeScreen;

import java.io.IOException;


import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import product.ProductScreen;
import user.UserScreen;

public class HomeScreenController {
//	There are two button present in HomeScreen 
	
//	- UserManagement
//	- productManagement
	
//	As you can see the below method will just show the screen to the user 
//	The implementation is in different packages with respected class
	
	public void userManagementClick() throws IOException {
		//Showing screen from UserMainScreen class calling userManagementShow method
		new UserScreen().userManagementShow();
	}
	
	public void productManagementClick() throws IOException {
		new ProductScreen().productManagementShow();
	}
}
