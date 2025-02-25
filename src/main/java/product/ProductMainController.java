package product;

import java.io.IOException;
import java.sql.SQLException;

public class ProductMainController {
	public void addProductClick() throws IOException {
		new ProductScreen().addProductShow();
	}
	
	public void searchProductClick() throws IOException {
		new ProductScreen().searchProductShow();
	}
	
	public void displayProductClick() throws IOException, SQLException {
		new DisplayProductController().displayProductShow();
	}
	
	public void removeProductClick() throws IOException {
		new ProductScreen().removeProductShow();
	}
}
