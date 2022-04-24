package controller;

import service.ProductService.ProductCategoryServiceIMPL;


public class ProductCategoryController {
    public void copy() {
        new ProductCategoryServiceIMPL().makeProductCategory();
    }

//    public void render() {
//        new ProductCategoryServiceIMPL().render();
//    }

//    public void editType() {
//        new ProductCategoryServiceIMPL().editType();
    }

    // dùng để thêm sản phẩm vào 1 danh mục cụ  thể
//    public void addNewProductOnCategoryList() {
//        new ProductCategoryServiceIMPL().addProductToTypeInCategoryList();
//    }

//    public void deleteProductOnCategory() {
//        new ProductCategoryServiceIMPL().deleteProductInCategory();
//    }

//    public void editProductOnCategoryList() {
//        new ProductCategoryServiceIMPL().editProductInCategory();
//    }
//    public void searchByTypeOnCategoryList(){
//        new ProductCategoryServiceIMPL().searchType();
//    }

