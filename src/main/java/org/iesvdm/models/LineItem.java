package org.iesvdm.models;

public class LineItem {

    // Atributos

    public Order order;
    public Product product;
    public long quantity;
    public double price;
    public ShoppingCart shoppingCart;

    // Constructores

    public LineItem(long quantity, double price) {

        this.quantity = quantity;
        this.price = price;

    }

    // Getters y Setters

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
