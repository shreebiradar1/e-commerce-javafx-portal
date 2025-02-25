package org.project.controller;

import java.io.IOException;

import org.project.common.RestUtil;
import org.project.screens.HomeScreen;

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

		String request = "{\r\n" + "    \"loginName\": \"" + username.getText() + "\",\r\n" + "    \"password\": \""
				+ password.getText() + "\"\r\n" + "}";

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
