package model;

import java.io.Serializable;

public class Product implements Serializable {
    int id,quantify;
    String productName, description, brand, type;
    double price;

    public Product() {
    }

    public Product(int id, int quantify, String productName, String description, String brand, String type, double price) {
        this.id = id;
        this.quantify = quantify;
        this.productName = productName;
        this.description = description;
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantify() {
        return quantify;
    }

    public void setQuantify(int quantify) {
        this.quantify = quantify;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n-------------------------------------------\n"+
                "\nid         : " + id +
                "\nquantify   : " + quantify +
                "\nproductName: " + productName +
                "\ndescription: " + description +
                "\nbrand      : " + brand +
                "\ntype       : " + type +
                "\nprice      : " + price
                ;
    }
}
