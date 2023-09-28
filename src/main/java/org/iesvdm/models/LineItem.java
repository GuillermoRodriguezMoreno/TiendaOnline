package org.iesvdm.models;

public class LineItem {

    // Atributos

    private Order order;
    private Product product;
    private long quantity;
    private double price;
    private ShoppingCart shoppingCart;

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
