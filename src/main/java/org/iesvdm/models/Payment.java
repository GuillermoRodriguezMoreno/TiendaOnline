package org.iesvdm.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Payment {

    // Atributos

    private Order order;
    private Account account;
    private String id;
    private LocalDate paid;
    private BigDecimal total;
    private String details;

    // Constructores

    public Payment(Order order, Account account, String id, LocalDate paid, BigDecimal total, String details) {
        this.order = order;
        this.account = account;
        this.id = id;
        this.paid = paid;
        this.total = total;
        this.details = details;
    }


    // Getters y Setters

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

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

    // Metodos

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(id, payment.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
