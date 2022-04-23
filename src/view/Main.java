package view;

import controller.PlayerController;
import controller.ProductCategoryController;
import model.PlayerRunning;
import model.ProductCategory;
import model.Role;
import model.RoleName;
import service.PlayaerRunning.PlayerRunningServiceIMPL;
import service.ProductService.ProductCategoryServiceIMPL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public void Main1() {
        System.out.println("1:SIGN UP");
        System.out.println("2:LOG IN");
        System.out.print("ENTER YOUR NUMBER: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            // sign up
            new SignUpVIew();
        } else if (choice == 2) {
            // log in
            if (new PlayerRunningServiceIMPL().playerRunningList.size() != 0) {
                new PlayerController().logOut();
            }
            if (PlayerRunningServiceIMPL.playerRunningList.size() == 0) {
                new LogInView();
            }
            List<PlayerRunning> playerRunningList = PlayerRunningServiceIMPL.playerRunningList;
            Set<Role> roleSet = playerRunningList.get(0).getRoleSet();
            System.out.println("role: " + playerRunningList.get(0).getRoleSet());
            List<Role> roleList = new ArrayList<>(roleSet);
            System.out.println("roleList: " + roleList);
            boolean checkUser = roleList.get(0).getName() == RoleName.USER;
            if (checkUser) {
                new PlayerView().order();
            } else {
                new PlayerView().manageProduct();
            }

        } else {
            System.out.println("1 or 2 , Broooooooooo???");
        }
        new PlayerController().logOut();
    }

    public static void main(String[] args) {
        // sợ chạy nhiêuf lần bị ghi vào file nhiều lần

        new Main().Main1();

    }
}
