package org.iesvdm.models;

public class LineItem {

    // Atributos

    private Order order;
    private Product product;
    private long quantity;
    private ShoppingCart shoppingCart;

    // Constructores

    public LineItem(Order order, Product product, long quantity, ShoppingCart shoppingCart) {
        this.order = order;
        this.product = product;
        this.quantity = quantity;
        this.shoppingCart = shoppingCart;
    }


    // Getters y Setters

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    // Metodos

}
