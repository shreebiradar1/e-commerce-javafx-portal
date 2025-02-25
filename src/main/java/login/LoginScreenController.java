package login;

import java.io.IOException;

import common.RestUtil;
import homeScreen.HomeScreen;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class LoginScreenController {

	@FXML
	private TextField username;

	@FXML
	private PasswordField password;

	@FXML
	private Label errorMessage;

	public void loginButtonClick() throws IOException, InterruptedException {

//		String query = "Select * from login where username = '" + username.getText() + "'and password = '"
//				+ password.getText() + "';";
//
//		ResultSet result = DatabaseUtil.resultQuery(query);

		String request = "{\r\n" + "    \"loginName\": \"" + username.getText() + "\",\r\n" + "    \"password\": \""
				+ password.getText() + "\"\r\n" + "}";
//		String request = "{\r\n"
//				+ "    \"loginName\": \"shree\",\r\n"
//				+ "    \"password\": \"Shree@123\"\r\n"
//				+ "}";
//		String request = "\"loginName\": "+"\""+username.getText()+"\""
//				+ "		\"password\":"+"\""+password.getText()+"\"";

		String url = "http://localhost:8080/auth/login";

		String response = RestUtil.postRequest(url, request);

		if (response.contains("0000")) {
			// Showing Home Screen
			new HomeScreen().show();

		} else {
			errorMessage.setTextFill(Color.RED);
			errorMessage.setText("Login Fail");
		}
	}

}
