package org.xpdojo.bank;

public class Account {
    public int getBalance() {
        return balance;
    }


    int balance;
    protected int depositMoneyIntoAccount(int amount){
        balance =balance +amount;
        return balance;
    }

    protected int withdrawMoneyFromAccount(int amount){
        balance =balance - amount;
        return balance;
    }

    public void transferMoney(Account destinationAcct, int amnt) {
      withdrawMoneyFromAccount(amnt);
      destinationAcct.depositMoneyIntoAccount(amnt);
    }
}
