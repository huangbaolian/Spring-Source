package com.hbl.spring5.transaction.entity;

import org.springframework.stereotype.Repository;


public class Account {
    private String id;
    private String username;
    private int money;

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public int getMoney() {
        return money;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
