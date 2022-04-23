package model;

import java.io.Serializable;
import java.util.Set;

public class PlayerRunning implements Serializable {
    private int id;
    private String firstname;
    private String lastname;
    private String password;
    private Set<Role> roleSet;

    public PlayerRunning() {
    }

    public PlayerRunning(int id, String firstname, String lastname, String password, Set<Role> roleSet) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.roleSet = roleSet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoleSet() {
        return roleSet;
    }

    public void setRoleSet(Set<Role> roleSet) {
        this.roleSet = roleSet;
    }
}
