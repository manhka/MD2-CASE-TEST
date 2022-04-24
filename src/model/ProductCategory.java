package model;

import java.io.Serializable;
import java.util.List;

public class ProductCategory implements Serializable {
    int id;
    String nameCategory;
 private List<Product>  productList;
    public ProductCategory() {
    }

    public ProductCategory(int id, String nameCategory, List<Product> productList) {
        this.id = id;
        this.nameCategory = nameCategory;
        this.productList = productList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "\n--------ProductCategory-----------\n" +
                "\nid            : " + id +
                "\nnameCategory  : " + nameCategory +
                "\nproductList   : " + productList +
                "\n";
    }
}

