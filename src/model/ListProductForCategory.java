package model;

import java.io.Serializable;
import java.util.List;

public class ListProductForCategory implements Serializable {
    List<Product>productList;

    public ListProductForCategory() {
    }

    public ListProductForCategory(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public ListProductForCategory setProductList(List<Product> productList) {
        this.productList = productList;
        return null;
    }

    @Override
    public String toString() {
        return "\n-----------ProductCategory-----------\n" +
                "\nproductList:" + productList +
                "\n";
    }
}
