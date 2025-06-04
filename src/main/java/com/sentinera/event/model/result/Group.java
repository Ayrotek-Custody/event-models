package com.sentinera.event.model.result;

public class Group {
    private String groupId;
    private Wallets walletDistribution;

    public Group(Wallets walletDistribution, String groupId) {
        this.walletDistribution = walletDistribution;
        this.groupId = groupId;
    }

    public Group() {
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Wallets getWalletDistribution() {
        return walletDistribution;
    }

    public void setWalletDistribution(Wallets walletDistribution) {
        this.walletDistribution = walletDistribution;
    }
}
