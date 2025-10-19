package com.sentinera.event.model.result.webhook;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
class RawContract {
    private String address;
    private int decimals;
    private String rawValue;

    public RawContract() {
    }

    public RawContract(String address, int decimals, String rawValue) {
        this.address = address;
        this.decimals = decimals;
        this.rawValue = rawValue;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDecimals() {
        return decimals;
    }

    public void setDecimals(int decimals) {
        this.decimals = decimals;
    }

    public String getRawValue() {
        return rawValue;
    }

    public void setRawValue(String rawValue) {
        this.rawValue = rawValue;
    }
}