package com.sentinera.event.model.result.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WebhookEvent {
    private String id;
    private String type;

    @JsonProperty("webhookId")
    private String webhookId;

    @JsonProperty("createdAt")
    private String createdAt;

    @JsonProperty("event")
    private AlchemyEvent event;

    public WebhookEvent(String id, String type, String webhookId, String createdAt, AlchemyEvent event) {
        this.id = id;
        this.type = type;
        this.webhookId = webhookId;
        this.createdAt = createdAt;
        this.event = event;
    }

    public WebhookEvent() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWebhookId() {
        return webhookId;
    }

    public void setWebhookId(String webhookId) {
        this.webhookId = webhookId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public AlchemyEvent getEvent() {
        return event;
    }

    public void setEvent(AlchemyEvent event) {
        this.event = event;
    }
}