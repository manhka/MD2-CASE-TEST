package controller;

import model.Role;
import service.Role.RoleServiceIMLP;

import java.util.List;

public class RoleController {
    RoleServiceIMLP roleServiceIMPL = new RoleServiceIMLP();

    public List<Role> showListRole() {
        return roleServiceIMPL.findAll();
    }
}
