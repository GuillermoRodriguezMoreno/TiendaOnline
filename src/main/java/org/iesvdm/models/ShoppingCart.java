package org.iesvdm.models;

import java.time.LocalDate;
import java.util.List;

public class ShoppingCart {

    // Atributos

    public Account account;
    public WebUser webUser;
    public LocalDate created;
    public List<LineItem> lineItemList;

    // Constructores

    public ShoppingCart(Account account, WebUser webUser, LocalDate created, List<LineItem> lineItemList) {
        this.account = account;
        this.webUser = webUser;
        this.created = created;
        this.lineItemList = lineItemList;
    }

    // Getters y Setters

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public WebUser getWebUser() {
        return webUser;
    }

    public void setWebUser(WebUser webUser) {
        this.webUser = webUser;
    }

    public List<LineItem> getLineItemList() {
        return lineItemList;
    }

    public void setLineItemList(List<LineItem> lineItemList) {
        this.lineItemList = lineItemList;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }
}
