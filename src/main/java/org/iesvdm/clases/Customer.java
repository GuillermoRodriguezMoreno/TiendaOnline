package org.iesvdm.clases;

public class Customer {

    // Atributos

    public String id;
    public String address;
    public String phone;
    public String email;

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
