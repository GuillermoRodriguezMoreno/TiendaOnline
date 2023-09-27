package org.iesvdm.clases;

public class Product {

    // Atributos

    public String id;
    public String name;
    public String supplier;

    // Constructores

    public Product(String id, String name, String supplier) {

        this.id = id;
        this.name = name;
        this.supplier = supplier;

    }

    // Getters y Setters

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
