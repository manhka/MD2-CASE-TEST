package service.Player;

import config.ConfigReadAndWrite;
import model.Player;
import model.PlayerRunning;
import model.ProductCategory;
import service.PlayaerRunning.PlayerRunningServiceIMPL;
import service.ProductService.ProductCategoryServiceIMPL;

import java.util.List;

public class PlayerServiceIMPL implements IPlayerService {

    String PATH_PLAYER = "D:\\MODUL 2\\caseStudy_MD2\\src\\data\\ListPlayer";
    public List<Player> playerList = new ConfigReadAndWrite<Player>().readFromFile(PATH_PLAYER);

    @Override
    public List<Player> findAll() {
        new ConfigReadAndWrite<Player>().writeIntoFile(PATH_PLAYER, playerList);
        new ConfigReadAndWrite<Player>().writeIntoFile(PATH_PLAYER, playerList);
        return playerList;
    }


    @Override
    public void save(Player Player) {
        playerList.add(Player);
    }

    ProductCategoryServiceIMPL productCategoryServiceIMPL = new ProductCategoryServiceIMPL();
    PlayerRunningServiceIMPL playerRunningServiceIMPL = new PlayerRunningServiceIMPL();

    @Override
    public void logOut() {
        System.out.println("??????????");
//        productCategoryServiceIMPL.nameCategories123.clear();
        new ConfigReadAndWrite<String>().writeIntoFile(productCategoryServiceIMPL.PATH_ProductCatalog, productCategoryServiceIMPL.list5);
        System.out.println("size cate name="+ productCategoryServiceIMPL.list5);
        productCategoryServiceIMPL.categoryList.clear();
        new ConfigReadAndWrite<ProductCategory>().writeIntoFile(productCategoryServiceIMPL.PATH_ProductCatalog, productCategoryServiceIMPL.categoryList);
        playerRunningServiceIMPL.playerRunningList.clear();
        new ConfigReadAndWrite<PlayerRunning>().writeIntoFile(playerRunningServiceIMPL.PATH_USER_PRINCIPAL, playerRunningServiceIMPL.playerRunningList);
    }

    @Override
    public boolean existedByUsername(String account) {
        for (int i = 0; i < playerList.size(); i++) {
            if (account.equals(playerList.get(i).getFirstname() + playerList.get(i).getLastname())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean checkLogin(String username, String password) {
        for (int i = 0; i < playerList.size(); i++) {

            if (username.equals(playerList.get(i).getFirstname() + playerList.get(i).getLastname()) && password.equals(playerList.get(i).getPassword())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Player findByUsername(String account) {
        for (int i = 0; i < playerList.size(); i++) {
            if (account.equals((playerList.get(i).getFirstname()) + (playerList.get(i).getLastname()))) {
                System.out.println("player :" + playerList.get(i));
                return playerList.get(i);
            }
        }
        return null;
    }
}
