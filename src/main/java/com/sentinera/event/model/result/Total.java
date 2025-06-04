package com.sentinera.event.model.result;

import java.math.BigDecimal;

public class Total {
    private BigDecimal totalHotBalance;
    private BigDecimal totalWarmBalance;
    private BigDecimal totalColdBalance;
    private BigDecimal totalOverallBalance;

    public Total(BigDecimal totalHotBalance, BigDecimal totalWarmBalance, BigDecimal totalColdBalance, BigDecimal totalOverallBalance) {
        this.totalHotBalance = totalHotBalance;
        this.totalWarmBalance = totalWarmBalance;
        this.totalColdBalance = totalColdBalance;
        this.totalOverallBalance = totalOverallBalance;
    }

    public Total(BigDecimal totalOverallBalance) {
        this.totalOverallBalance = totalOverallBalance;
    }

    public Total() {
    }

    public BigDecimal getTotalHotBalance() {
        return totalHotBalance;
    }

    public void setTotalHotBalance(BigDecimal totalHotBalance) {
        this.totalHotBalance = totalHotBalance;
    }

    public BigDecimal getTotalWarmBalance() {
        return totalWarmBalance;
    }

    public void setTotalWarmBalance(BigDecimal totalWarmBalance) {
        this.totalWarmBalance = totalWarmBalance;
    }

    public BigDecimal getTotalColdBalance() {
        return totalColdBalance;
    }

    public void setTotalColdBalance(BigDecimal totalColdBalance) {
        this.totalColdBalance = totalColdBalance;
    }

    public BigDecimal getTotalOverallBalance() {
        return totalOverallBalance;
    }

    public void setTotalOverallBalance(BigDecimal totalOverallBalance) {
        this.totalOverallBalance = totalOverallBalance;
    }
}
