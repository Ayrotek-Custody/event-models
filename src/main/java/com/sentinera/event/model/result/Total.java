package com.sentinera.event.model.result;

import java.math.BigDecimal;
//Percentage
public class Total {
    private BigDecimal totalHotBalance;
    private BigDecimal totalHotBalancePercentage;
    private BigDecimal totalWarmBalance;
    private BigDecimal totalWarmBalancePercentage;
    private BigDecimal totalColdBalance;
    private BigDecimal totalColdBalancePercentage;
    private BigDecimal totalOverallBalance;

    public BigDecimal getTotalHotBalancePercentage() {
        return totalHotBalancePercentage;
    }

    public BigDecimal getTotalWarmBalancePercentage() {
        return totalWarmBalancePercentage;
    }

    public BigDecimal getTotalColdBalancePercentage() {
        return totalColdBalancePercentage;
    }

    public Total(BigDecimal totalHotBalance, BigDecimal totalHotBalancePercentage, BigDecimal totalWarmBalance, BigDecimal totalWarmBalancePercentage, BigDecimal totalColdBalance, BigDecimal totalColdBalancePercentage, BigDecimal totalOverallBalance) {
        this.totalHotBalance = totalHotBalance;
        this.totalHotBalancePercentage = totalHotBalancePercentage;
        this.totalWarmBalance = totalWarmBalance;
        this.totalWarmBalancePercentage = totalWarmBalancePercentage;
        this.totalColdBalance = totalColdBalance;
        this.totalColdBalancePercentage = totalColdBalancePercentage;
        this.totalOverallBalance = totalOverallBalance;
    }

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
