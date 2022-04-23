package view;

import DTO.SignUpDTO;
import controller.PlayerController;
import service.Player.PlayerServiceIMPL;
import service.Role.RoleServiceIMLP;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class SignUpVIew {
    Scanner scanner = new Scanner(System.in);
    PlayerController playerController = new PlayerController();
    PlayerServiceIMPL playerServiceIMPL = new PlayerServiceIMPL();

    public SignUpVIew() {
        new RoleServiceIMLP().findAll();
        System.out.println("-------MAKE AN ACCOUNT AROUND 6 TO 20 CHARACTER AND NOT SPECIAL CHARACTER-------");
        System.out.print("Enter first name: ");
        String firstname = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastname = scanner.nextLine();
        String account = firstname + lastname;
        boolean checkAccount;
        while (true) {
            checkAccount = Pattern.matches("[a-z0-9A-Z]{6,20}", account);
            if (!checkAccount) {
                System.out.println("ACCOUNT IS NOT INVALID! Please try again!");
                new SignUpVIew();

            } else if (playerServiceIMPL.existedByUsername(account)) {
                System.err.println("ACCOUNT is existed! Please try again!");
                System.out.println("1 TO LOG IN OR 2 TO SIGN UP AGAIN");
                System.out.print("ENTER your number : ");
                int choice = scanner.nextInt();
                if (choice == 1) {
                    new LogInView();
                } else if (choice == 2) {
                    new SignUpVIew();
                }
            } else {
                break;
            }
        }
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.print("Enter your role, MANAGER OR USER ");
        String role = scanner.nextLine();
        boolean checkRole;
        while (true) {
            checkRole = Pattern.matches("USER|MANAGER", role);
            if (!checkRole) {
                System.out.println("DON'T HAVE THIS KIND OF ROLE ,TRY AGAIN !");
                new SignUpVIew();
            } else {
                break;
            }
        }
        Set<String> strRole = new HashSet<>();
        strRole.add(role);
        SignUpDTO signUpDTO = new SignUpDTO(firstname, lastname, password, strRole);
        playerController.register(signUpDTO);
        new Main().Main1();
    }
}
