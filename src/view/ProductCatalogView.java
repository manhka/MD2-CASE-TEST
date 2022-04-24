package view;

import controller.ProductCategoryController;

import java.util.Scanner;

public class ProductCatalogView {
    Scanner scanner = new Scanner(System.in);

    public void manage_product_catalog() {
        new ProductCategoryController().copy();
//        System.out.println("0:SEARCH PRODUCT CATEGORY BY TYPE");
//        System.out.println("1:RENDER PRODUCT CATALOG LIST");
//        System.out.println("2:ADD A NEW PRODUCT WHILE MANAGING PRODUCT");
//        System.out.println("3:EDIT PRODUCT WHILE MANAGING PRODUCT");
//        System.out.println("4:DELETE PRODUCT WHILE MANAGING PRODUCT");
//        System.out.println("5:CHANGE PRODUCT CATEGORY WHILE MANAGING PRODUCT");
//        System.out.println("6: COME HOME");
//        System.out.print("ENTER YOUR NUMBER: ");
//        int choice = scanner.nextInt();
//        switch (choice) {
//            case 0:
//                new ProductCategoryController().searchByTypeOnCategoryList();
//                manage_product_catalog();
//                break;
//            case 1:
//                new ProductCategoryController().render();
//                manage_product_catalog();
//                break;
//            case 2:
////                new ProductCategoryController().addNewProductOnCategoryList();
//                manage_product_catalog();
//                break;
//            case 3:
////                new ProductCategoryController().editProductOnCategoryList();
//                manage_product_catalog();
//                break;
//            case 4:
////                new ProductCategoryController().deleteProductOnCategory();
//                manage_product_catalog();
//                break;
//            case 5:
//                new ProductCategoryController().editType();
//                manage_product_catalog();
//            case 6:
//                new Main();
//                break;
//            default:
//                break;
//        }
    }
}
