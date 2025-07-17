package com.sentinera.event.model.result.webhook;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebhookActivity {
    private String asset;
    private String blockNum;
    private String category;
    private String fromAddress;
    private String hash;
    private String toAddress;
    private Double value;

    @JsonProperty("log")
    private WebhookLog log;

    @JsonProperty("rawContract")
    private RawContract rawContract;

    public WebhookActivity(String asset, String blockNum, String category, String fromAddress, String hash, String toAddress, Double value, WebhookLog log, RawContract rawContract) {
        this.asset = asset;
        this.blockNum = blockNum;
        this.category = category;
        this.fromAddress = fromAddress;
        this.hash = hash;
        this.toAddress = toAddress;
        this.value = value;
        this.log = log;
        this.rawContract = rawContract;
    }

    public WebhookActivity() {
    }

    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    public String getBlockNum() {
        return blockNum;
    }

    public void setBlockNum(String blockNum) {
        this.blockNum = blockNum;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public WebhookLog getLog() {
        return log;
    }

    public void setLog(WebhookLog log) {
        this.log = log;
    }

    public RawContract getRawContract() {
        return rawContract;
    }

    public void setRawContract(RawContract rawContract) {
        this.rawContract = rawContract;
    }
}