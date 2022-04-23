package service.PlayaerRunning;

import config.ConfigReadAndWrite;
import model.PlayerRunning;

import java.util.List;

public class PlayerRunningServiceIMPL implements IplayerRunningService {
    public static String PATH_USER_PRINCIPAL = "D:\\MODUL 2\\caseStudy_MD2\\src\\data\\playerLogin";
    public static List<PlayerRunning> playerRunningList = new ConfigReadAndWrite<PlayerRunning>().readFromFile(PATH_USER_PRINCIPAL);

    @Override
    public List<PlayerRunning> findAll() {
        new ConfigReadAndWrite<PlayerRunning>().writeIntoFile(PATH_USER_PRINCIPAL, playerRunningList);
        return playerRunningList;
    }

    @Override
    public void save(PlayerRunning playerRunning) {
        playerRunningList.clear();
        playerRunningList.add(playerRunning);
    }
}
