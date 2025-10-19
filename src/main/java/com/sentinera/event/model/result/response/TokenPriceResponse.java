package com.sentinera.event.model.result.response;


import java.util.List;

public class TokenPriceResponse {
    private String symbol;
    private String currency;
    private List<TokenPriceData> data;

    public TokenPriceResponse(String symbol, String currency, List<TokenPriceData> data) {
        this.symbol = symbol;
        this.currency = currency;
        this.data = data;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<TokenPriceData> getData() {
        return data;
    }

    public void setData(List<TokenPriceData> data) {
        this.data = data;
    }
}
