package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void checkAccountHealth() {
        Account a =new Account();
        assertThat(a.getState()).isEqualTo("New");
    }
}
