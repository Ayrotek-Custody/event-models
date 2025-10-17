package com.sentinera.event.model.result;

import java.util.UUID;

public class WalletsByGroupsByTypeFilteredDto {
    private UUID groupId;
    private String groupName;
    private WalletsByTypeFilteredDto wallets;

    public WalletsByGroupsByTypeFilteredDto(UUID groupId, String groupName, WalletsByTypeFilteredDto wallets) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.wallets = wallets;
    }

    public UUID getGroupId() {
        return groupId;
    }

    public void setGroupId(UUID groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public WalletsByTypeFilteredDto getWallets() {
        return wallets;
    }

    public void setWallets(WalletsByTypeFilteredDto wallets) {
        this.wallets = wallets;
    }

    @Override
    public String toString() {
        return "WalletsByGroupsByTypeFilteredDto{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", wallets=" + wallets +
                '}';
    }
}
