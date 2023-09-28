package org.iesvdm.models;

public class Customer {

    // Atributos

    private Account account;
    private WebUser webUser;
    private String id;
    private String address;
    private String phone;
    private String email;

    // Constructores

    public Customer(String id, String address, String phone, String email) {

        this.id = id;
        this.address = address;
        this.phone = phone;
        this.email = email;

    }

    // Getters y Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
