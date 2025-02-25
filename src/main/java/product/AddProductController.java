package product;

import java.io.IOException;

import common.RestUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class AddProductController {
	// These are the "Add Product" variables

	@FXML
	private TextField productName;

	@FXML
	private TextField productPrice;

	@FXML
	private TextField productQuantity;
	
	@FXML
	private TextField productCategory;

	@FXML
	private Label addLabel;
	
	public void addEnter() throws IOException, InterruptedException {
		String url = "http://localhost:8080/product/product";
		
		String body = "{\r\n" + "    \"productName\": \"" + productName.getText() + "\",\r\n" + "    \"price\": \""
				+ productPrice.getText() + "\",\r\n" + "    \"quantity\": \"" + productQuantity.getText() + "\",\r\n"
				+ "    \"category\": \"" + productCategory.getText() + "\"\r\n" + "}";
		
		System.out.println(productName.getText());	//-> here it show the value
		String response = RestUtil.postRequest(url, body);

		if (response.contains("0000")) {
			addLabel.setTextFill(Color.GREEN);
			addLabel.setText("New Product Added Successfully");
		} else {
			addLabel.setTextFill(Color.RED);
			addLabel.setText("Something error occurred");
		}
	}
	public void back() throws IOException {
		new ProductScreen().productManagementShow();
	}
}
