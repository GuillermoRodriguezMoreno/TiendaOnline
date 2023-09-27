package org.iesvdm.clases;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Order {

    // Enum

    public enum OrderStatus {NEW, HOLD, SHIPPED, DELIVERED, CLOSED};

    // Atributos

    public String number;
    public LocalDate ordered;
    public LocalDate shipped;
    public String shipTo;
    public OrderStatus status;
    public BigDecimal total;

    // Constructores

    public Order(String number, LocalDate ordered, LocalDate shipped, String shipTo, OrderStatus status, BigDecimal total) {

        this.number = number;
        this.ordered = ordered;
        this.shipped = shipped;
        this.shipTo = shipTo;
        this.status = status;
        this.total = total;

    }

    // Getters y Setters

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getOrdered() {
        return ordered;
    }

    public void setOrdered(LocalDate ordered) {
        this.ordered = ordered;
    }

    public LocalDate getShipped() {
        return shipped;
    }

    public void setShipped(LocalDate shipped) {
        this.shipped = shipped;
    }

    public String getShipTo() {
        return shipTo;
    }

    public void setShipTo(String shipTo) {
        this.shipTo = shipTo;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
