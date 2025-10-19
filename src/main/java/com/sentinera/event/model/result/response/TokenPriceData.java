package com.sentinera.event.model.result.response;

import java.time.Instant;

public class TokenPriceData {
    private String value;
    private Instant timestamp;

    public TokenPriceData(String value, Instant timestamp) {
        this.value = value;
        this.timestamp = timestamp;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }
}
