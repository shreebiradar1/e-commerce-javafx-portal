package org.project.controller.user;

import java.io.IOException;

import org.project.screens.UserScreen;

public class UserMainScreenController {
	
	public void addUserClick() throws IOException {
		new UserScreen().addUserShow();
	}
	
	public void searchUserClick() throws IOException {
		new UserScreen().searchUserShow();
	}
	
	public void displayUserClick() throws IOException {
		new DisplayScreenController().displayUserShow();
	}
	
	public void removeUserClick() throws IOException {
		new UserScreen().removeUserShow();
	}
}
