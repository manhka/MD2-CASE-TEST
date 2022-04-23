package service.ProductService;

import config.ConfigReadAndWrite;
import model.Product;
import model.ProductCategory;
import view.ProductCatalogView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductCategoryServiceIMPL implements IProductCategoryService {
    public String Path="D:\\MODUL 2\\caseStudy_MD2\\src\\data\\ListProductForCategory";
    public String PATH="D:\\MODUL 2\\caseStudy_MD2\\src\\data\\nameCategory";
    // list dùng để lưu các sản phẩm vào file
    public List<Product> list=new ConfigReadAndWrite<Product>().readFromFile(Path);
    // nameCategory123 dùng để lưu lại những tên của các danh mục
//   public List<String> nameCategories123=new ConfigReadAndWrite<String>().readFromFile(PATH);
   public List<String> list5=new ConfigReadAndWrite<String>().readFromFile(PATH);
   // list5 dùng để check và thêm phần tử vào nameCategory123
//   List<String> list5=new ArrayList<String>();
    Scanner scanner = new Scanner(System.in);
    public String PATH_ProductCatalog = "D:\\MODUL 2\\caseStudy_MD2\\src\\data\\productCategory";
    //  categoryList để lưu thông tin danh mục gồm có tên danh mục và các list sản phẩm cùng  loại vào file
    public List<ProductCategory> categoryList = new ConfigReadAndWrite<ProductCategory>().readFromFile(PATH_ProductCatalog);
    ProductServiceIMPL productServiceIMPL = new ProductServiceIMPL();
    // productList1 dùng để lưu sản phẩm
    List<Product> productList1=new ArrayList<>();
    List<Product>productList12345=new ProductServiceIMPL().productList;
public void WhenNameCategorySize0(){
//        list5.add(productList12345.get(0).getType());
//        System.out.println("product list= "+productServiceIMPL.productList);
        for (int i = 0; i < productServiceIMPL.productList.size(); i++) {
//            System.out.println(productServiceIMPL.productList.size());
//            System.out.println(list5.contains(productServiceIMPL.productList.get(i).getType().trim()));
            if (!(list5.contains(productServiceIMPL.productList.get(i).getType().trim()))){
                list5.add(productServiceIMPL.productList.get(i).getType().trim());
//                nameCategories123.add(productServiceIMPL.productList.get(i).getType().trim());
            }
        }
    new ConfigReadAndWrite<String>().writeIntoFile(PATH,list5);
        System.out.println("list5="+list5);
//        for (int j = 0; j < list5.size(); j++) {
////                System.out.println("list5="+list5.get(j));
//            new ConfigReadAndWrite<String>().writeIntoFile(PATH,nameCategories123);
//            for (int k = 0; k < productServiceIMPL.productList.size(); k++) {
//                if ((list5.get(j).trim()).equals(productServiceIMPL.productList.get(k).getType().trim())){
//                    if (!(productList1.contains(productServiceIMPL.productList.get(k).getProductName()))){
//                        System.out.println("k="+k);
//                        Product product=new Product(productServiceIMPL.productList.get(k).getId(),
//                                productList12345.get(k).getProductName(),
//                                productList12345.get(k).getDescription(),
//                                productList12345.get(k).getBrand(),
//                                productList12345.get(k).getType(),
//                                productList12345.get(k).getPrice());
//                        productList1.add(product);
//                        list.add(productList12345.get(j));
//                        new ConfigReadAndWrite<Product>().writeIntoFile(PATH,list);
//                    }
//
//                }
//
//            }
//            categoryList.add(new ProductCategory(categoryList.size()+1,list5.get(j),list));
//
//            new ConfigReadAndWrite<ProductCategory>().writeIntoFile(PATH_ProductCatalog, categoryList);
//        }
////        System.out.println("ok="+list);
////        System.out.println("list5="+list5);
//        System.out.println("?  "+productServiceIMPL.productList);
//        System.out.println("productlist1="+productList1);
//        System.out.println("chuan luon="+categoryList);
//
//
//



}
//    @Override
//    public void makeNameAndListForCategory(){
//    try{
//        WhenNameCategorySize0();
//
////        for (int i = 0; i < productServiceIMPL.productList.size(); i++) {
////            if (!((nameCategories123.get(i).getCategoryName()).equals((productServiceIMPL.productList.get(i).getType())))) {
////                System.out.println("vao-------------------day");
////                NameCategory nameCategories = new NameCategory().setCategoryName(productServiceIMPL.productList.get(i).getType());
////                nameCategories123.add(nameCategories);
////                new ConfigReadAndWrite<NameCategory>().writeIntoFile(PATH,nameCategories123);
////                for (int j = 0; j < productServiceIMPL.productList.size(); j++) {
////                    if (nameCategories123.get(j).getCategoryName().equals(productServiceIMPL.productList.get(j).getType())) {
////                        productList1.add(productServiceIMPL.productList.get(j));
////                        ListProductForCategory listProductForCategory1 = new ListProductForCategory().setProductList(productList1);
////                        list.add(listProductForCategory1);
////                        new ConfigReadAndWrite<ListProductForCategory>().writeIntoFile(Path, list);
////                    }
//
////                }
//
////            }
////        }
//    }catch (Exception e){};
//    }

    @Override
    public void makeProductCategory() {
        WhenNameCategorySize0();
//        System.out.println("??????/");
//        System.out.println("size="+ list5.size());

//        for (int i = 0; i <list5.size(); i++) {
////            System.out.println("nameCategory="+nameCategories123.get(i).getCategoryName());
////            if (!(categoryList.get(i).getNameCategory().equals(nameCategories123.get(i).getCategoryName()))){
////                ProductCategory productCategory1=new ProductCategory(i,nameCategories123.get(i).getCategoryName(),list.get(i).getProductList());
////                categoryList.add(productCategory1);
//                new ConfigReadAndWrite<ProductCategory>().writeIntoFile(PATH_ProductCatalog,categoryList);
////            }
//        }
    }

    @Override
    public void render() {
        System.out.println("-------------this is product catalog list----------");
        System.out.println(categoryList);
    }

   public void searchType() {

       System.out.println("----------PRODUCT CATEGORY LIST-----------------");
       System.out.println(categoryList);
        System.out.println(" ENTER TYPE PRODUCT: ");
        String type = scanner.nextLine();
        for (int i = 0; i < categoryList.size(); i++) {

            if (type.equalsIgnoreCase(categoryList.get(i).getNameCategory())) {
                System.out.println(categoryList.get(i));
                if (i==categoryList.size()-1){
                    new ProductCatalogView().manage_product_catalog();
                }
            } else if (i >= categoryList.size()-1) {
                System.err.println("WE DON'T HAVE THIS TYPE PRODUCT, TRY AN OTHER ONE!");
                searchType();
            }
        }
    }
}

//    @Override
//    public void editType() {
//        System.out.println("<-------------LIST CATEGORY------->");
//        System.out.println(categoryList);
//        System.out.println("ENTER YOUR TYPE TO SEE: ");
//        String type = scanner.nextLine();
//        for (int i = 0; i < categoryList.size(); i++) {
//            if (type.equalsIgnoreCase(categoryList.get(i).getNameCategory())) {
//                System.out.print("NEW TYPE");
//                String newType = scanner.nextLine();
//                categoryList.get(i).setNameCategory(newType);
//                new ConfigReadAndWrite<ProductCategory>().writeIntoFile(PATH_ProductCatalog, categoryList);
//                System.out.println("this is category product list after edit type");
//                System.out.println(categoryList);
//                new ProductCatalogView().manage_product_catalog();
//            } else if (i >= categoryList.size()-1) {
//                System.err.println("THIS TYPE PRODUCT IS NOT EXIT IN SHOP");
//                System.err.println("TRY AGAIN!!");
//                System.out.println("----------PRODUCT CATEGORY LIST-----------------");
//                System.out.println(categoryList);
//                editType();
//            }
//        }
//    }

    // dùng để thêm sản phẩm vào 1 danh mục cụ  thể khi đang ở quản lý danh mục
//    @Override
//    public void addProductToTypeInCategoryList() {
//        System.out.println("<-------------LIST CATEGORY------->");
//        System.out.println(categoryList);
//        System.out.println("ENTER YOUR TYPE TO SEE: ");
//        String type = scanner.nextLine();
//        for (int i = 0; i < categoryList.size(); i++) {
//            if (type.equalsIgnoreCase(categoryList.get(i).getNameCategory())) {
//                System.out.print("PRODUCT NAME:");
//                String NAME = scanner.nextLine();
//                System.out.print("PRODUCT DESCRIPTION:");
//                String DESCRIPTION = scanner.nextLine();
//                System.out.print("PRODUCT BRAND:");
//                String BRAND = scanner.nextLine();
//                System.out.print("PRODUCT TYPE:");
//                String TYPE = scanner.nextLine();
//                System.out.print("PRODUCT PRICE:");
//                double PRICE = scanner.nextDouble();
//                Product product = new Product(productServiceIMPL.productList.size() + 1, NAME, DESCRIPTION, BRAND, TYPE, PRICE);
//                ProductCategory productCategory = new ProductCategory(categoryList.size() + 1, type, product);
//                categoryList.add(productCategory);
//                new ConfigReadAndWrite<ProductCategory>().writeIntoFile(PATH_ProductCatalog, categoryList);
//                System.out.println("this is category product list after edit type");
//                System.out.println(categoryList);
//                new ProductCatalogView().manage_product_catalog();
//            } else if (i >= categoryList.size()-1) {
//                System.err.println("THIS TYPE PRODUCT IS NOT EXIT IN SHOP");
//                System.err.println("TRY AGAIN!!");
//                System.out.println("----------PRODUCT CATEGORY LIST-----------------");
//                System.out.println(categoryList);
//                addProductToTypeInCategoryList();
//            }
//        }
//    }

    // dùng để xoa sản phẩm vào 1 danh mục cụ  thể  khi đang ở quản lý danh mục
//    @Override
//    public void deleteProductInCategory() {
//        System.out.println("<-------------LIST CATEGORY------->");
//        System.out.println(categoryList);
//        System.out.println("ENTER YOUR TYPE TO SEE: ");
//        String type = scanner.nextLine();
//        for (int i = 0; i < categoryList.size(); i++) {
//            if (type.equalsIgnoreCase(categoryList.get(i).getNameCategory())) {
//                categoryList.remove(categoryList.get(i));
//                new ConfigReadAndWrite<ProductCategory>().writeIntoFile(PATH_ProductCatalog, categoryList);
//                System.out.println("this is category product list after edit type");
//                System.out.println(categoryList);
//                new ProductCatalogView().manage_product_catalog();
//                new PlayerView().order();
//            }else if (i >= categoryList.size()-1) {
//                System.err.println("THIS TYPE PRODUCT IS NOT EXIT IN SHOP");
//                System.err.println("TRY AGAIN!!");
//                System.out.println("----------PRODUCT CATEGORY LIST-----------------");
//                System.out.println(categoryList);
//                deleteProductInCategory();
//            }
//        }
//    }

    // dùng để chỉnh sửa sản phẩm khi đang ở danh mục
    //chưa chắc
//    @Override
//    public void editProductInCategory() {
//        System.out.println("<-------------LIST CATEGORY------->");
//        System.out.println(categoryList);
//        System.out.println("ENTER YOUR TYPE TO SEE: ");
//        String type = scanner.nextLine();
//        System.out.println(new ProductServiceIMPL().productList);
//        for (int i = 0; i < categoryList.size(); i++) {
//            if (type.equalsIgnoreCase(categoryList.get(i).getNameCategory())) {
//                System.out.println("NEW ID: ");
//                int ID = scanner.nextInt();
//                System.out.print("NEW PRODUCT NAME:");
//                String NAME = scanner.nextLine();
//                System.out.print("NEW PRODUCT DESCRIPTION:");
//                String DESCRIPTION = scanner.nextLine();
//                System.out.print("NEW PRODUCT BRAND:");
//                String BRAND = scanner.nextLine();
//                System.out.print("NEW PRODUCT TYPE:");
//                String TYPE = scanner.nextLine();
//                System.out.print("NEW PRODUCT PRICE:");
//                double PRICE = scanner.nextDouble();
//                categoryList.get(i).setProduct(new Product(ID, NAME, DESCRIPTION, BRAND, TYPE, PRICE));
//                new ConfigReadAndWrite<ProductCategory>().writeIntoFile(PATH_ProductCatalog, categoryList);
//                System.out.println("this is category product list after edit type");
//                System.out.println(categoryList);
//                new ProductCatalogView().manage_product_catalog();
//                new PlayerView().order();
//            }else if (i >= categoryList.size()-1) {
//                System.err.println("THIS TYPE PRODUCT IS NOT EXIT IN SHOP");
//                System.err.println("TRY AGAIN!!");
//                System.out.println("----------PRODUCT CATEGORY LIST-----------------");
//                System.out.println(categoryList);
//                editProductInCategory();
//            }
//        }
//    }
//}
