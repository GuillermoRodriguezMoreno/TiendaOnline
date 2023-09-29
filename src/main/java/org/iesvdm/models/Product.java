package org.iesvdm.models;

import java.util.Objects;

public class Product {

    // Atributos

    private String id;
    private String name;
    private double precio;
    private String supplier;

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

    // Metodos

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
