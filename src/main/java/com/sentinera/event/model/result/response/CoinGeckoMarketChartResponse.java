package com.sentinera.event.model.result.response;

import java.util.List;

public class CoinGeckoMarketChartResponse {
    private List<List<Double>> prices;
    private List<List<Double>> market_caps;
    private List<List<Double>> total_volumes;

    // Getters and Setters
    public List<List<Double>> getPrices() {
        return prices;
    }

    public void setPrices(List<List<Double>> prices) {
        this.prices = prices;
    }

    public List<List<Double>> getMarket_caps() {
        return market_caps;
    }

    public void setMarket_caps(List<List<Double>> market_caps) {
        this.market_caps = market_caps;
    }

    public List<List<Double>> getTotal_volumes() {
        return total_volumes;
    }

    public void setTotal_volumes(List<List<Double>> total_volumes) {
        this.total_volumes = total_volumes;
    }
}
