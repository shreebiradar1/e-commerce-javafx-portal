package org.project.controller.product;

import java.io.IOException;

import org.project.common.RestUtil;
import org.project.screens.ProductScreen;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RemoveProductController {
	// These are the "Remove product" variables
	@FXML
	private TextField removeProduct;

	@FXML
	private Label removeStatus;

	public void removeEnter() throws IOException, InterruptedException {

		String url = "http://localhost:8080/product/product"+removeProduct.getText();
		
		String response = RestUtil.deleteRequest(url);
		if (response.contains("0000")) {
			
			removeStatus.setText("Product Removed");

		} else {
			removeStatus.setText("Product not Found");
		}
	}
	
	public void back() throws IOException {
		new ProductScreen().productManagementShow();
	}
}