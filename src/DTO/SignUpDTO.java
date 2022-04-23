package DTO;

import java.util.Set;

public class SignUpDTO {
    private String firstName;
    private String lastName;
    private String password;
    private Set<String> strRole;
    public SignUpDTO() {
    }

    public SignUpDTO(String firstName, String lastName, String password, Set<String> strRole) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.strRole = strRole;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getStrRole() {
        return strRole;
    }

    public void setStrRole(Set<String> strRole) {
        this.strRole = strRole;
    }

    @Override
    public String toString() {
        return "SignUpDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", strRole=" + strRole +
                '}';
    }
}
