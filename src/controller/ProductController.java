package controller;

import service.ProductService.ProductServiceIMPL;

public class ProductController {
    public void renderAllProduct() {
        new ProductServiceIMPL().render();
    }

    public void addNewProduct() {
        new ProductServiceIMPL().add();
    }

    public void editProductByName() {
        new ProductServiceIMPL().editByName();
    }

    public void deleteProductByName() {
        new ProductServiceIMPL().delete();
    }

    public void searchByName() {
        new ProductServiceIMPL().searchByName();
    }

    public void searchByPrice() {
        new ProductServiceIMPL().searchByPrice();
    }

    public void searchByType() {
        new ProductServiceIMPL().searchByType();
    }

    public void buyProduct() {
        new ProductServiceIMPL().buy();
    }

    public void calculator() {
        new ProductServiceIMPL().makeBills();
    }
}
