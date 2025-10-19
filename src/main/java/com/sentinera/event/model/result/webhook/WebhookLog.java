package com.sentinera.event.model.result.webhook;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
class WebhookLog {
    private String address;
    private String blockHash;
    private String blockNumber;
    private String data;
    private String logIndex;
    private boolean removed;
    private List<String> topics;
    private String transactionHash;
    private String transactionIndex;

    public WebhookLog(String address, String blockHash, String blockNumber, String data, String logIndex, boolean removed, List<String> topics, String transactionHash, String transactionIndex) {
        this.address = address;
        this.blockHash = blockHash;
        this.blockNumber = blockNumber;
        this.data = data;
        this.logIndex = logIndex;
        this.removed = removed;
        this.topics = topics;
        this.transactionHash = transactionHash;
        this.transactionIndex = transactionIndex;
    }

    public WebhookLog() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(String blockHash) {
        this.blockHash = blockHash;
    }

    public String getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLogIndex() {
        return logIndex;
    }

    public void setLogIndex(String logIndex) {
        this.logIndex = logIndex;
    }

    public boolean isRemoved() {
        return removed;
    }

    public void setRemoved(boolean removed) {
        this.removed = removed;
    }

    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public String getTransactionHash() {
        return transactionHash;
    }

    public void setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
    }

    public String getTransactionIndex() {
        return transactionIndex;
    }

    public void setTransactionIndex(String transactionIndex) {
        this.transactionIndex = transactionIndex;
    }
}