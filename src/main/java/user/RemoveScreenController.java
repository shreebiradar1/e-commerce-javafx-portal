package user;

import java.io.IOException;

import common.RestUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RemoveScreenController {

	// These are the "Remove user" variables
	@FXML
	private TextField removeUser;

	@FXML
	private Label removeStatus;

	public void removeEnter() throws IOException, InterruptedException {	
		
		String url = "http://localhost:8080/user/user/"+removeUser.getText();
		
		String response = RestUtil.deleteRequest(url);
		
		if (response.contains("0000")) {
			
			removeStatus.setText("User Removed");

		} else {
			removeStatus.setText("User not Found");
		}
	}
	public void back() throws IOException {
		new UserScreen().userManagementShow();
	}
}
