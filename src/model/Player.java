package model;

import java.io.Serializable;
import java.util.Set;

public class Player implements Serializable {
    private int id;
    private String firstname;
    private String lastname;
    private String password;
    private String email;
    private String avatar;
    private Set<Role> roleSet;

    public Player() {
    }

    public Player(int id, String firstname, String lastname, String password, String email, String avatar, Set<Role> roleSet) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.email = email;
        this.avatar = avatar;
        this.roleSet = roleSet;
    }

    public Player(int id, String firstname, String lastname, String password, Set<Role> roleSet) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Set<Role> getRoleSet() {
        return roleSet;
    }

    public void setRoleSet(Set<Role> roleSet) {
        this.roleSet = roleSet;
    }

    @Override
    public String toString() {
        return "\n---------------Player---------\n" +
                "\nid" + id +
                " \nfirstname: " + firstname +
                " \nlastname : " + lastname +
                " \npassword : " + password +
                " \nemail    : " + email +
                " \navatar   : " + avatar +
                " \nroleSet  : " + roleSet +
                "\n";
    }
}
