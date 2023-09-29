package org.iesvdm.models;

import java.util.Objects;

public class WebUser {

    // Enum
    public enum UserState {NEW, ACTIVE, BLOCKED, BANNED};

    // Atributos

    private Customer customer;
    private String loginId;
    private String password;
    private UserState state;

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

    // Metodos

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WebUser webUser = (WebUser) o;
        return Objects.equals(loginId, webUser.loginId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loginId);
    }
}
