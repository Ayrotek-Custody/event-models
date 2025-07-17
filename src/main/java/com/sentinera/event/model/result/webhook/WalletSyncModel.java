package com.sentinera.event.model.result.webhook;

import java.util.Date;

public class WalletSyncModel {
    private String walletAddress;
    private Date syncTime;

    public WalletSyncModel(String walletAddress, Date syncTime) {
        this.walletAddress = walletAddress;
        this.syncTime = syncTime;
    }

    public WalletSyncModel() {
    }

    public String getWalletAddress() {
        return walletAddress;
    }

    public void setWalletAddress(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    public Date getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Date syncTime) {
        this.syncTime = syncTime;
    }
}
