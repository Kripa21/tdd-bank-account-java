package org.xpdojo.bank;

public class Account {
    public int getBalance() {
        return balance;
    }


    int balance;
    protected int deposit(int amount){
        balance =balance +amount;
        return balance;
    }

    protected int withdraw(int amount){
        balance =balance - amount;
        return balance;
    }

    public void transfer(Account destinationAcct, int amnt) {
      withdraw(amnt);
      destinationAcct.deposit(amnt);
    }
}
