package org.project.controller.user;

import java.io.IOException;

import org.project.common.RestUtil;
import org.project.screens.UserScreen;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class AddScreenController {
	// These are the "Add User" variables

	@FXML
	private TextField firstName;

	@FXML
	private TextField lastName;

	@FXML
	private TextField userEmail;

	@FXML
	private TextField userNumber;

	@FXML
	private Label label;

	public void addEnter() throws IOException, InterruptedException {

		String url = "http://localhost:8080/user/user";
		String body = "{\r\n" + "    \"firstName\": \"" + firstName.getText() + "\",\r\n" + "    \"lastName\": \""
				+ lastName.getText() + "\",\r\n" + "    \"email\": \"" + userEmail.getText() + "\",\r\n"
				+ "    \"mobile\": \"" + userNumber.getText() + "\"\r\n" + "}";
		String response = RestUtil.postRequest(url, body);

		if (response.contains("0000")) {
			label.setTextFill(Color.GREEN);
			label.setText("New User Added Successfully");
		} else {
			label.setTextFill(Color.RED);
			label.setText("Something error occurred");
		}
	}

	public void back() throws IOException {
		new UserScreen().userManagementShow();
	}
}
