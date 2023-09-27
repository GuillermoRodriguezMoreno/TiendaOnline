package org.iesvdm.clases;

import java.time.LocalDate;

public class ShoppingCart {

    // Atributos

    public LocalDate created;

    // Constructores

    public ShoppingCart(LocalDate created) {

        this.created = created;
    }

    // Getters y Setters

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }
}
