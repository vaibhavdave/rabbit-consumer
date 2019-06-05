package com.microservice.consumer.model;

import java.io.Serializable;

public class AccountOpenedEvent implements Serializable {

    private String accountNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public AccountOpenedEvent(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public AccountOpenedEvent() {
    }


}
