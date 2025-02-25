package org.project.controller.product;

import java.io.IOException;

import org.project.screens.ProductScreen;

public class ProductMainController {
	public void addProductClick() throws IOException {
		new ProductScreen().addProductShow();
	}
	
	public void searchProductClick() throws IOException {
		new ProductScreen().searchProductShow();
	}
	
	public void displayProductClick() throws IOException{
		new DisplayProductController().displayProductShow();
	}
	
	public void removeProductClick() throws IOException {
		new ProductScreen().removeProductShow();
	}
}
