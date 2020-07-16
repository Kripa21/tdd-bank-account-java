package org.xpdojo.bank;

public class Account {
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    int balance;
    protected int deposit(int amount){
        balance =balance +amount;
        return balance;
    }
}
