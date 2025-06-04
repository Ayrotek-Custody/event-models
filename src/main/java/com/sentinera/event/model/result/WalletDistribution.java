package com.sentinera.event.model.result;

import java.math.BigDecimal;

public class WalletDistribution {
    private BigDecimal percentage;
    private BigDecimal balance;

    public WalletDistribution(BigDecimal percentage, BigDecimal balance) {
        this.percentage = percentage;
        this.balance = balance;
    }

    public WalletDistribution() {
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
