package org.iesvdm.models;

public class Product {

    // Atributos

    public String id;
    public String name;
    public double precio;
    public String supplier;

    // Constructores

    public Product(String id, String name, double precio, String supplier) {
        this.id = id;
        this.name = name;
        this.precio = precio;
        this.supplier = supplier;
    }


    // Getters y Setters

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
}
