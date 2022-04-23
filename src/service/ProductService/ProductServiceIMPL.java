package service.ProductService;

import config.ConfigReadAndWrite;
import jdk.swing.interop.SwingInterOpUtils;
import model.Product;
import view.LogInView;
import view.PlayerView;

import java.util.List;
import java.util.Scanner;

public class ProductServiceIMPL implements IProductService {
    Scanner scanner = new Scanner(System.in);
    private String PATH = "D:\\MODUL 2\\caseStudy_MD2\\src\\data\\product";
    List<Product> productList = new ConfigReadAndWrite<Product>().readFromFile(PATH);
    private String PATH_CART = "D:\\MODUL 2\\caseStudy_MD2\\src\\data\\cart";
    List<Product> cart = new ConfigReadAndWrite<Product>().readFromFile(PATH_CART);

    @Override
    public void render() {
        System.out.println("THERE ARE ALL PRODUCT IN THIS SHOP");
        System.out.println(productList);
    }

    @Override
    public void add() {
        boolean check=true;
        if (productList.size()==0){
            System.out.println("NAME PRODUCT :");
            String name = scanner.nextLine();
            System.out.println("DESCRIPTION PRODUCT: ");
            String description = scanner.nextLine();
            System.out.println("BRAND: ");
            String brand = scanner.nextLine();
            System.out.println("TYPE PRODUCT: ");
            String type = scanner.nextLine();
            System.out.println("PRICE PRODUCT: ");
            double price = scanner.nextDouble();
            Product products = new Product(productList.size() , name, description, brand, type, price);
            productList.add(products);
            new ConfigReadAndWrite<Product>().writeIntoFile(PATH, productList);
            System.out.println("LIST AFTER ADD NEW PRODUCT=========>");
            System.out.println(productList);

        }
        System.out.println("NAME PRODUCT :");
       String name = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if ((name.equalsIgnoreCase(productList.get(i).getProductName().trim()))) {
                System.out.println("??????");
                System.out.println("THIS PRODUCT IS EXIT , TRY AGAIN");
                System.out.println("PRODUCT LIST :" + productList);
                add();
            }else {
                check=false;
            }
        }
            if (!check) {
                System.out.println("DESCRIPTION PRODUCT: ");
                String  description = scanner.nextLine();
                System.out.println("BRAND: ");
                String  brand = scanner.nextLine();
                System.out.println("TYPE PRODUCT: ");
                String type = scanner.nextLine();
                System.out.println("PRICE PRODUCT: ");
                double price = scanner.nextDouble();
                Product products = new Product(productList.size() , name, description, brand, type, price);
                productList.add(products);
                new ConfigReadAndWrite<Product>().writeIntoFile(PATH, productList);
                System.out.println("LIST AFTER ADD NEW PRODUCT=========>");
                System.out.println(productList);
                new PlayerView().manageProduct();
//                PlayerView  playerView=new PlayerView();
//                playerView.manageProduct();
                System.out.println("vao day ");
            }
    }




    @Override
    public void editByName() {boolean check=true;
        System.out.println("PRODUCT LIST :"+productList);
        System.out.println("ENTER PRODUCT NAME TO EDIT: ");
        String name = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (name.equals(productList.get(i).getProductName())){
                System.out.println("NEW NAME: ");
                String newName = scanner.nextLine();
                for (int j = 0; j < productList.size(); j++) {
                    if (newName.equalsIgnoreCase(productList.get(i).getProductName().trim())){
                        System.out.println("THis product is exit , try again!!");
                        editByName();
                    }else {
                        check=false;
                    }
                }
                    if (!check){
                        System.out.print("NEW DESCRIPTION: ");
                        String description = scanner.nextLine();
                        System.out.print("NEW BRAND: ");
                        String brand = scanner.nextLine();
                        System.out.print("NEW TYPE: ");
                        String type = scanner.nextLine();
                        System.out.print("NEW PRICE: ");
                        double price = scanner.nextDouble();
                        productList.get(i).setId(i);
                        productList.get(i).setProductName(newName);
                        productList.get(i).setDescription(description);
                        productList.get(i).setBrand(brand);
                        productList.get(i).setType(type);
                        productList.get(i).setPrice(price);
                        new ConfigReadAndWrite<Product>().writeIntoFile(PATH, productList);
                          new PlayerView().manageProduct();
                }
            }else if (i>= productList.size()-1){
                System.out.println("DON'T HAVE THIS PRODUCT , PLEASE !! TRY AGAIN");
                editByName();}
        }
            }



    @Override
    public void delete() {
        boolean check=true;
        System.out.println("PRODUCT LIST :"+productList);
        System.out.println("ENTER NAME TO FIND PRODUCT TO DELETE: ");
        String name = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (name.equalsIgnoreCase(productList.get(i).getProductName().trim())){
                productList.remove(productList.get(i));
                new ConfigReadAndWrite<Product>().writeIntoFile(PATH, productList);
                new PlayerView().manageProduct();
            }else {
                check=false;
            }
        }
            if (!check){
                System.err.println("WE DON'T HAVE THIS PRODUCT ! PLEASE, TRY AGAIN ");
                delete();}
    }

    @Override
    public void searchByName() {
        System.out.println("PRODUCT LIST :"+productList);
        System.out.println("ENTER NAME TO SEARCH: ");
        String name = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (name.equals(productList.get(i).getProductName().trim())) {
                System.out.println(" THIS IS YOUR PRODUCT");
                System.out.println(productList.get(i));
                new PlayerView().manageProduct();
            } else if (i>=productList.size()-1){
                System.out.println("WE DON'T HAVE THIS PRODUCT ! PLEASE, TRY AGAIN");
                searchByName();
            }
        }

    }

    @Override
    public void searchByPrice() {
        System.out.println("PRODUCT LIST :"+productList);
        System.out.println("WE HAVE 3 LEVEL PRICE ");
        System.out.println("1: HIGH PRICE >= 5000000");
        System.out.println("2: 2000000<= NORMAL PRICE < 5000000");
        System.out.println("3: LOW PRICE< 2000000");
        System.out.print("ENTER YOUR NUMBER: ");
        int priceSelect = Integer.parseInt(scanner.nextLine());

            switch (priceSelect) {
                case 1:
                    for (int i = 0; i <productList.size() ; i++) {
                        if (productList.get(i).getPrice() >= 5000000.0) {
                            System.out.println("this is yours");
                            System.out.println(productList.get(i));
                            if (i==productList.size()-1){
                                break;}
                        }
                       else if (i>=productList.size()-1){
                            System.out.println("WE DONT HAVE THIS PRICE PRODUCT");
                            searchByPrice();}
                    }

                    break;
                case 2:
                    for (int i = 0; i < productList.size(); i++) {
                        if (productList.get(i).getPrice() >= 2000000.0 && productList.get(i).getPrice() < 5000000.0) {
                            System.out.println("this is yours");
                            System.out.println(productList.get(i));
                            if (i==productList.size()-1){
                                break;}
                    }else if (i>=productList.size()-1) {
                            System.out.println("WE DONT HAVE THIS PRICE PRODUCT");
                            searchByPrice();
                        }
                    }

                    break;
                case 3:
                    for (int i = 0; i < productList.size(); i++) {
                        if (productList.get(i).getPrice() < 2000000.0) {
                            System.out.println("this is yours");
                            System.out.println(productList.get(i));
                            if (i==productList.size()-1){
                                break;}
                    }else if (i>=productList.size()-1) {
                            System.out.println("WE DONT HAVE THIS PRICE PRODUCT");
                            searchByPrice();
                        }
                    }
                    break;

                default:
                    System.out.println("<---------------fail to find---------------->");
                    searchByPrice();
                    break;
            }
        }


    @Override
    public void searchByType() {
        boolean check=true;
        System.out.println("PRODUCT LIST :"+productList);
        System.out.println("ENTER TYPE PRODUCT: ");
        String type = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (type.equals(productList.get(i).getType().trim())) {
                System.out.println("------there are all of product for this type---------");
                System.out.println(productList.get(i));
                if (i==productList.size()-1){
                    break;
            }
           }else{
                check=false;
            }
        }
        if (!check){
            System.out.println("WE DON'T HAVE THIS PRODUCT ! PLEASE , TRY AGAIN!!");
            searchByType();
        }

    }

    public void buy() {
        System.out.println("PRODUCT LIST :"+productList);
        System.out.println("PRODUCT TO BUY: ");
        String name = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (name.equals(productList.get(i).getProductName().trim())) {
                cart.add(productList.get(i));
                new ConfigReadAndWrite<Product>().writeIntoFile(PATH_CART, cart);
                productList.remove(productList.get(i));
                new ConfigReadAndWrite<Product>().writeIntoFile(PATH, productList);
                System.out.println("------THIS IS YOUR CART -------");
                System.out.println(cart);
//                new PlayerView().order();
if (i==productList.size()-1){
    break;
}
            }else if(i>= productList.size()-1){ System.err.println("WE DONT HAVE THIS PRODUCT , PLEASE, TRY ANOTHER ONE");
                buy();}
        }
}


    public void makeBills() {
        double total = 0;
        for (int i = 0; i < cart.size(); i++) {
            total += cart.get(i).getPrice();
        }
        cart.clear();
        new ConfigReadAndWrite<Product>().writeIntoFile(PATH_CART, cart);
        System.out.println("TOTAL = " + total);
        System.out.println("YOUR CART AFTER DOING PAYMENT: ");
        System.out.println(cart);
    }

}
