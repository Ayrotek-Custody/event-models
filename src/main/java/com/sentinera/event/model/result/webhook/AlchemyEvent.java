package com.sentinera.event.model.result.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class AlchemyEvent {
    private String network;

    @JsonProperty("activity")
    private List<WebhookActivity> activity;

    public AlchemyEvent(String network, List<WebhookActivity> activity) {
        this.network = network;
        this.activity = activity;
    }

    public AlchemyEvent() {
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public List<WebhookActivity> getActivity() {
        return activity;
    }

    public void setActivity(List<WebhookActivity> activity) {
        this.activity = activity;
    }
}
