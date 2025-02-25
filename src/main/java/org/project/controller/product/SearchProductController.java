package org.project.controller.product;

import java.io.IOException;

import org.project.common.RestUtil;
import org.project.dto.SearchProductResponse;
import org.project.screens.ProductScreen;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SearchProductController {

	@FXML
	private TextField searchProduct;

	@FXML
	private Label searchLabel;

	@FXML
	private Label searchId;

	@FXML
	private Label searchName;

	@FXML
	private Label searchPrice;

	@FXML
	private Label searchQuantity;

	@FXML
	private Label searchCategory;

	public void searchEnter() throws IOException, InterruptedException {

		String url = "http://localhost:8080/product/product/" + searchProduct.getText();

		SearchProductResponse response = RestUtil.searchGetRequest(url, SearchProductResponse.class);

		if (response != null) {
			searchLabel.setText("Product Found");
			searchId.setText(response.getProduct_id());
			searchName.setText(response.getProdName());
			searchPrice.setText(response.getPrice());
			searchQuantity.setText(response.getQuantity());
			searchCategory.setText(response.getCategory());
		} else {
			searchLabel.setText("Product not Found");
		}

	}

	public void back() throws IOException {
		new ProductScreen().productManagementShow();
	}
}
