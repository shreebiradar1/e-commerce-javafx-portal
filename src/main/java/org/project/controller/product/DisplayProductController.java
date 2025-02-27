package org.project.controller.product;

import java.io.IOException;

import org.project.common.StageFactory;
import org.project.screens.ProductScreen;

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

public class DisplayProductController {
	
	@FXML
	private TableView<Product> productTable;
	
	@FXML
	private TableColumn<Product, String> colName;
	
	@FXML
	private TableColumn<Product, Integer> colPrice;
	
	@FXML
	private TableColumn<Product, Integer> colQuantity;
	
	
	@FXML
	private void initialize() {
		ObservableList<Product> product = FXCollections.observableArrayList();

		colName.setCellValueFactory(new PropertyValueFactory<>("name"));
		colPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
		colQuantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
		productTable.setItems(product);
	}
	
	public void displayProductShow() throws IOException {

			Stage stage = StageFactory.getStage();
			stage.setTitle("Display Product");

			Parent actor = FXMLLoader.load(getClass().getResource("/product/displayProduct.fxml"));
			Scene scene = new Scene(actor);

			stage.setScene(scene);
			stage.show();
			
	}
	
	public void back() throws IOException {
		new ProductScreen().productManagementShow();
	}
}
