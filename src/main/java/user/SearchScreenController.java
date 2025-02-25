package user;

import java.io.IOException;

import org.dnyanyog.dto.SearchUserResponse;

import common.RestUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SearchScreenController {
	// These are the "Search user" variables
	@FXML
	private TextField searchUser;

	@FXML
	private Label searchLabel;
	
	@FXML
	private Label searchId;
	
	@FXML
	private Label searchFirstName;
	
	@FXML
	private Label searchLastName;
	
	@FXML
	private Label searchEmail;
	
	@FXML
	private Label searchMobile;

	public void searchEnter() throws IOException, InterruptedException {

		String url = "http://localhost:8080/user/username/Shree";
		SearchUserResponse response = RestUtil.searchGetRequest(url, SearchUserResponse.class);
		
		if (response != null) {
			searchLabel.setText("User Found");
			searchId.setText(response.getUserId());
			searchFirstName.setText(response.getFirstName());
			searchLastName.setText(response.getLastName());
			searchEmail.setText(response.getEmail());
			searchMobile.setText(response.getMobile());
			
		} else {
			searchLabel.setText("User not Found");
		}

	}

	public void back() throws IOException {
		new UserScreen().userManagementShow();
	}
}
