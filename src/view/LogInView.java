package view;

import DTO.LogInDTO;
import DTO.SignUpDTO;
import controller.PlayerController;
import service.PlayaerRunning.PlayerRunningServiceIMPL;
import service.Player.PlayerServiceIMPL;

import java.util.Scanner;

public class LogInView {
    Scanner scanner = new Scanner(System.in);
    PlayerController playerController = new PlayerController();

    public LogInView() {
        new PlayerServiceIMPL().logOut();
        System.out.println("-------------LOGIN FORM---------------");
        System.out.println("Enter your ACCOUNT: ");
        String account = scanner.nextLine();
        System.out.println("Enter your PASSWORD: ");
        String password = scanner.nextLine();
        LogInDTO logInDTO = new LogInDTO(account, password);
        if (playerController.login(logInDTO)) {
        } else {
            System.out.println("Login failed! Please check account or password! ");
            new LogInView();
        }
    }
}
