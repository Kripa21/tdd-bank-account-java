package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void testDepositMoneyIntoAccount() {
        Account a =new Account();
        a.depositMoneyIntoAccount(10);
        assertThat(a.getBalance()).isEqualTo(10);

    }
    @Test
    public void testWithdrawMoneyIntoAccount() {
        Account a =new Account();
        a.withdrawMoneyFromAccount(10);
        assertThat(a.getBalance()).isEqualTo(-10);

    }

    @Test
    public void testTransferMoneyFromOneAccountToAnother() {
        Account sourceAcct =new Account();
        Account destinationAcct =new Account();
        sourceAcct.transferMoney(destinationAcct,10);
        assertThat(sourceAcct.getBalance()).isEqualTo(-10);
        assertThat(destinationAcct.getBalance()).isEqualTo(10);

    }



}
