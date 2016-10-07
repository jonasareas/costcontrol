package com.wimm.model;

import java.awt.*;
import java.math.BigDecimal;
import java.util.Date;

public class Account {
    private String name;
    private String description;
    private Color  color;
    private BigDecimal balance;
    private Date closure;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Date getClosure() {
        return closure;
    }

    public void setClosure(Date closure) {
        this.closure = closure;
    }

    public BigDecimal doTransaction(BigDecimal value) {
        setBalance(getBalance().add(value));
        return getBalance();
    }
}
