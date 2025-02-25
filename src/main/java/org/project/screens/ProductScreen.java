package org.project.screens;

import java.io.IOException;

import org.project.common.StageFactory;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ProductScreen {

	// Product-Main Screen
	public void productManagementShow() throws IOException {

		Stage stage = StageFactory.getStage();
		stage.setTitle("Product Management");

		Parent actor = FXMLLoader.load(getClass().getResource("/product/productMain.fxml"));
		Scene scene = new Scene(actor);

		stage.setScene(scene);
		stage.show();
	}

	// Add-Product Screen
	public void addProductShow() throws IOException {

		Stage stage = StageFactory.getStage();
		stage.setTitle("Add Product");

		Parent actor = FXMLLoader.load(getClass().getResource("/product/addProduct.fxml"));
		Scene scene = new Scene(actor);

		stage.setScene(scene);
		stage.show();
	}

	// Search-Product Screen
	public void searchProductShow() throws IOException {
		Stage stage = StageFactory.getStage();
		stage.setTitle("Search Product");

		Parent actor = FXMLLoader.load(getClass().getResource("/product/searchProduct.fxml"));
		Scene scene = new Scene(actor);

		stage.setScene(scene);
		stage.show();

	}

	// Remove-product Screen
	public void removeProductShow() throws IOException {
		Stage stage = StageFactory.getStage();
		stage.setTitle("Remove Product");

		Parent actor = FXMLLoader.load(getClass().getResource("/product/removeProduct.fxml"));
		Scene scene = new Scene(actor);

		stage.setScene(scene);
		stage.show();
	}
}
