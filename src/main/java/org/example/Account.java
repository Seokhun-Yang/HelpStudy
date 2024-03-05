package org.example;

public class Account {

    private final String accountNumber;
    private final String ownerName;
    private long currentMoney;

    public Account(String accountNum, String name) {
        accountNumber = accountNum;
        this.ownerName = name;
        currentMoney = 0;
    }

    public Account(String name) {
        accountNumber = String.valueOf(System.currentTimeMillis());
        this.ownerName = name;
        currentMoney = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public long getCurrentMoney() {
        return currentMoney;
    }

    public String setAccountNumber() {
        return accountNumber;
    }

    public String setOwnerName() {
        return ownerName;
    }

    public void setCurrentMoney(long currentMoney) {
        this.currentMoney = currentMoney;
    }
}
