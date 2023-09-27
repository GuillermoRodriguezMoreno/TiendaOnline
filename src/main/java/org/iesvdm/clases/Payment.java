package org.iesvdm.clases;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Payment {

    // Atributos

    public String id;
    public LocalDate paid;
    public BigDecimal total;
    public String details;

    // Constructores

    public Payment(String id, LocalDate paid, BigDecimal total, String details) {

        this.id = id;
        this.paid = paid;
        this.total = total;
        this.details = details;

    }

    // Getters y Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getPaid() {
        return paid;
    }

    public void setPaid(LocalDate paid) {
        this.paid = paid;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
