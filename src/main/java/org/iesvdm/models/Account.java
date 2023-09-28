package org.iesvdm.models;

import java.time.LocalDate;
import java.util.List;

public class Account {

    // Atributos


    private List<Order> orderList;
    private List<Payment> paymentList;
    private String id;
    private String billingAddress;
    private boolean isClosed;
    private LocalDate open;
    private LocalDate closed;

    // Constructores

    public Account(String id, String billingAddress, boolean isClosed, LocalDate open, LocalDate closed) {

        this.id = id;
        this.billingAddress = billingAddress;
        this.isClosed = isClosed;
        this.open = open;
        this.closed = closed;
    }

    // Getters y Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public LocalDate getOpen() {
        return open;
    }

    public void setOpen(LocalDate open) {
        this.open = open;
    }

    public LocalDate getClosed() {
        return closed;
    }

    public void setClosed(LocalDate closed) {
        this.closed = closed;
    }
}
