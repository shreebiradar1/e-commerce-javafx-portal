package user;

import java.io.IOException;
import java.sql.SQLException;

public class UserMainScreenController {
	
	public void addUserClick() throws IOException {
		new UserScreen().addUserShow();
	}
	
	public void searchUserClick() throws IOException {
		new UserScreen().searchUserShow();
	}
	
	public void displayUserClick() throws IOException, SQLException {
		new DisplayScreenController().displayUserShow();
	}
	
	public void removeUserClick() throws IOException {
		new UserScreen().removeUserShow();
	}
}
