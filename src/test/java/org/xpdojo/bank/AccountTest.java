package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void depositMoney() {
        Account a =new Account();
        a.deposit(10);
        assertThat(a.getBalance()).isEqualTo(10);

    }
    @Test
    public void withdrawMoney() {
        Account a =new Account();
        a.withdraw(10);
        assertThat(a.getBalance()).isEqualTo(-10);

    }

}
