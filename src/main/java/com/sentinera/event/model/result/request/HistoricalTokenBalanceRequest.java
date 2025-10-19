package com.sentinera.event.model.result.request;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class HistoricalTokenBalanceRequest {
    private String symbol;
    private long startTime;
    private long endTime;

    public HistoricalTokenBalanceRequest(String symbol) {
        Instant now = Instant.now();
        Instant oneHourAgo = now.minus(1, ChronoUnit.HOURS);

        long epochNow = now.getEpochSecond();
        long epochOneHourAgo = oneHourAgo.getEpochSecond();

        this.symbol = symbol;
        this.endTime = epochNow;
        this.startTime = epochOneHourAgo;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "HistoricalTokenBalanceRequest{" + "symbol='" + symbol + '\'' + ", startTime=" + startTime + ", endTime=" + endTime + '}';
    }
}
