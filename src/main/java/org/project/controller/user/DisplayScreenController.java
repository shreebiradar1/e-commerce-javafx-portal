package org.project.controller.user;

import java.io.IOException;

import org.project.common.StageFactory;
import org.project.screens.UserScreen;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class DisplayScreenController {
	
	@FXML
	private TableColumn<User,Integer> userId;
	
	@FXML
	private TableColumn<User, String> firstName;
	
	@FXML
	private TableColumn<User, String> lastName;

	@FXML
	private TableColumn<User, String> userEmail;

	@FXML
	private TableColumn<User, String> userMobile;

	@FXML
	private TableView<User> userTable;

	@FXML
	private void initialize() {
		ObservableList<User> user = FXCollections.observableArrayList();

		userId.setCellValueFactory(new PropertyValueFactory<>("userId"));
		firstName.setCellValueFactory(new PropertyValueFactory<User, String>("firstName"));
		lastName.setCellValueFactory(new PropertyValueFactory<User, String>("lastName"));
		userEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
		userMobile.setCellValueFactory(new PropertyValueFactory<>("mobile"));
		userTable.setItems(user);
	}

	public void displayUserShow() throws IOException {

		Stage stage = StageFactory.getStage();
		stage.setTitle("UserManagement");

		Parent actor = FXMLLoader.load(getClass().getResource("/user/displayUser.fxml"));
		Scene scene = new Scene(actor);

		stage.setScene(scene);
		stage.show();

//		initialize();
	}

	public void back() throws IOException {
		new UserScreen().userManagementShow();
	}

}