package org.iesvdm.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {

    // Enum

    public enum OrderStatus {NEW, HOLD, SHIPPED, DELIVERED, CLOSED};

    // Atributos

    private List<LineItem> lineItemList;

    private List<Payment> paymentList;

    private Account account;
    private String number;
    private LocalDate ordered;
    private LocalDate shipped;
    private String shipTo;
    private OrderStatus status;
    private BigDecimal total;

    // Constructores

    public Order(List<Payment> paymentList, Account account, String number, LocalDate ordered, LocalDate shipped, String shipTo, OrderStatus status, BigDecimal total) {
        this.lineItemList = new ArrayList<LineItem>();
        this.paymentList = new ArrayList<Payment>();
        this.account = account;
        this.number = number;
        this.ordered = ordered;
        this.shipped = shipped;
        this.shipTo = shipTo;
        this.status = status;
        this.total = total;
    }


    // Getters y Setters

    public List<LineItem> getLineItemList() {
        return lineItemList;
    }

    public void setLineItemList(List<LineItem> lineItemList) {
        this.lineItemList = lineItemList;
    }

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

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
