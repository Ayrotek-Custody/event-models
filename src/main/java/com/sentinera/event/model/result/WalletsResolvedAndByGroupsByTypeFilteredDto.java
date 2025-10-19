package com.sentinera.event.model.result;


import com.sentinera.event.model.result.response.WalletsResolvedAndByTypeFiltered;

import java.util.UUID;

public class WalletsResolvedAndByGroupsByTypeFilteredDto {
    private UUID groupId;
    private String groupName;
    private WalletsResolvedAndByTypeFiltered wallets;

    public WalletsResolvedAndByGroupsByTypeFilteredDto() {
    }

    public WalletsResolvedAndByGroupsByTypeFilteredDto(UUID groupId, String groupName) {
        this.groupId = groupId;
        this.groupName = groupName;

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

    public WalletsResolvedAndByTypeFiltered getWallets() {
        return wallets;
    }

    public void setWallets(WalletsResolvedAndByTypeFiltered wallets) {
        this.wallets = wallets;
    }
}
