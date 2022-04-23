package controller;

import DTO.LogInDTO;
import DTO.SignUpDTO;
import model.Player;
import model.PlayerRunning;
import model.Role;
import model.RoleName;
import service.PlayaerRunning.PlayerRunningServiceIMPL;
import service.Player.PlayerServiceIMPL;
import service.Role.RoleServiceIMLP;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PlayerController {
    PlayerServiceIMPL playerServiceIMPL = new PlayerServiceIMPL();
    RoleServiceIMLP roleServiceIMPL = new RoleServiceIMLP();
    PlayerRunningServiceIMPL playerRunningServiceIMPL = new PlayerRunningServiceIMPL();

    public void register(SignUpDTO signUpDTO) {

        int id;
        if (playerServiceIMPL.playerList.size() == 0) {
            id = 1;
        } else {
            id = playerServiceIMPL.playerList.get(playerServiceIMPL.playerList.size() - 1).getId() + 1;
        }
        Set<String> strRole = signUpDTO.getStrRole();
        Set<Role> roleSet = new HashSet<>();
        strRole.forEach(role -> {
            switch (role) {
                case "USER":
                    Role userRoll = roleServiceIMPL.findByName(RoleName.USER);
                    roleSet.add(userRoll);
                    break;
                case "MANAGER":
                    Role managerRole = roleServiceIMPL.findByName(RoleName.MANAGER);
                    roleSet.add(managerRole);
                    break;
            }
        });
        Player user = new Player(id, signUpDTO.getFirstName(), signUpDTO.getLastName(), signUpDTO.getPassword(), roleSet);
        playerServiceIMPL.save(user);
        playerServiceIMPL.findAll();
    }

    public boolean login(LogInDTO logInDTO) {
        if (playerServiceIMPL.checkLogin(logInDTO.getAccount(), logInDTO.getPassword())) {
            Player player = playerServiceIMPL.findByUsername(logInDTO.getAccount());
            PlayerRunning playerRunning = new PlayerRunning(player.getId(), player.getFirstname(), player.getLastname(), player.getPassword(), player.getRoleSet());
            playerRunningServiceIMPL.save(playerRunning);
            playerRunningServiceIMPL.findAll();
            return true;
        } else {
            return false;
        }
    }

    public void logOut() {
        new PlayerServiceIMPL().logOut();
    }
}
