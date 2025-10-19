package com.sentinera.event.model.result.response;

public class WalletDataCache {

    private String walletAddress;  // Redis'te birincil anahtar (ID) olarak kullanılacak

    private String webhookId;
    private String balance;

    public WalletDataCache(String walletAddress, String webhookId, String balance) {
        this.walletAddress = walletAddress;
        this.webhookId = webhookId;
        this.balance = balance;
    }

    public WalletDataCache() {
    }

    public String getWalletAddress() {
        return walletAddress;
    }

    public void setWalletAddress(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    public String getWebhookId() {
        return webhookId;
    }

    public void setWebhookId(String webhookId) {
        this.webhookId = webhookId;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
