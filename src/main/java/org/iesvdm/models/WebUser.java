package org.iesvdm.models;

public class WebUser {

    // Enum
    public enum UserState {NEW, ACTIVE, BLOCKED, BANNED};

    // Atributos

    public Customer customer;
    public String loginId;
    public String password;
    public UserState state;

    // Constructores

    public WebUser(Customer customer, String loginId, String password, UserState state) {
        this.customer = customer;
        this.loginId = loginId;
        this.password = password;
        this.state = state;
    }


    // Getters y Setters

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserState getState() {
        return state;
    }

    public void setState(UserState state) {
        this.state = state;
    }
}
