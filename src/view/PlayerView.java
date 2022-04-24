package view;

import controller.ProductCategoryController;
import controller.ProductController;

import java.util.Scanner;

public class PlayerView {
    Scanner scanner=new Scanner(System.in);
    public void manageProduct(){
        System.out.println("---------WELCOME MANAGER----------");
        System.out.println("0:SEE ALL PRODUCT");
        System.out.println("1:ADD NEW PRODUCT");
        System.out.println("2:EDIT PRODUCT");
        System.out.println("3:DELETE A PRODUCT");
        System.out.println("4:SEARCH PRODUCT BY NAME PRODUCT");
        System.out.println("5:SEARCH PRODUCT BY PRICE PRODUCT");
        System.out.println("6:SEARCH PRODUCT BY TYPE PRODUCT");
        System.out.println("7: MANAGE PRODUCT CATALOG");
        System.out.println("8:LOG OUT");
        System.out.print("ENTER YOUR NUMBER: ");
        int choice= Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 0:
                new ProductController().renderAllProduct();
                manageProduct();
                break;
            case 1:
                new ProductController().addNewProduct();
                manageProduct();
                break;
            case 2:
                new ProductController().editProductByName();
                manageProduct();
                break;
            case 3:
                new ProductController().deleteProductByName();
                manageProduct();
                break;
            case 4:
                new ProductController().searchByName();
                manageProduct();
                break;
            case 5:
                new ProductController().searchByPrice();
                manageProduct();
                break;
            case 6:
                new  ProductController().searchByType();
                manageProduct();
                break;
            case 7:// quan ly danh muc sp
                System.out.println("-------------WELCOME TO PRODUCT CATEGORY -----------");
                new ProductCatalogView().manage_product_catalog();
               manageProduct();
                break;
            case 8: //home
                new Main();
                break;
            default:
                System.out.println("one of those number ---->");
                manageProduct();
                break;
        }
    }
    public void order(){
        System.out.println("--------WELCOME USER, LET SEE AND BUY PRODUCT-------------");
        System.out.println("0:SEE ALL PRODUCT");
        System.out.println("1:SEARCH PRODUCT BY NAME PRODUCT");
        System.out.println("2:SEARCH PRODUCT BY PRICE PRODUCT");
        System.out.println("3:SEARCH PRODUCT BY TYPE PRODUCT");
        System.out.println("4:BUY A PRODUCT");
        System.out.println("5: MAKE BILL");
        System.out.println("6:LOG OUT");
        System.out.print("ENTER A NUMBER: ");
        int choice= Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 0:
                new ProductController().renderAllProduct();
                order();
                break;
            case 1:
                new ProductController().searchByName();
                order();
                break;
            case 2:
                new ProductController().searchByPrice();
                order();
                break;
            case 3:
                new  ProductController().searchByType();
                order();
                break;
            case 4: // buy products
                new ProductController().buyProduct();
                order();
                break;
            case 5:  // thanh toan
                new ProductController().calculator();
                System.out.println("THANKS ! SEE YOU SOON, KK");
                order();
                break;
            case 6: // come home
                new Main();
                break;
            default:
                System.out.println("one of those number__________>");
                order();
        }
    }
}
