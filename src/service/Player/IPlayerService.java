package service.Player;

import model.Player;
import model.Product;
import service.IGenericService;

public interface IPlayerService extends IGenericService<Player> {


    void logOut();

    boolean existedByUsername(String username);

    boolean checkLogin(String username, String password);

    Player findByUsername(String username);
}
