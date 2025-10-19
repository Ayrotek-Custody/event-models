package com.sentinera.event.model.result;

import java.time.Instant;

public class TransactionRecordCache {

    private String fromAddress;
    private String toAddress;
    private String asset;
    private double value;
    private Instant timestamp;

    public TransactionRecordCache() {
    }

    public TransactionRecordCache(String fromAddress, String toAddress, String asset, double value, Instant timestamp) {
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
        this.asset = asset;
        this.value = value;
        this.timestamp = timestamp;
    }

    // Getters and Setters

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "TransactionRecord{" +
                "fromAddress='" + fromAddress + '\'' +
                ", toAddress='" + toAddress + '\'' +
                ", asset='" + asset + '\'' +
                ", value=" + value +
                ", timestamp=" + timestamp +
                '}';
    }
}