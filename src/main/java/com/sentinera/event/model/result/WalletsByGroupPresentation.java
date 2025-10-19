package com.sentinera.event.model.result;

import java.util.List;
import java.util.UUID;

public class WalletsByGroupPresentation {
    private UUID groupId;
    private String groupName;
    private List<String> address;

    public WalletsByGroupPresentation(UUID groupId, String groupName, List<String> address) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.address = address;
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

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "WalletsByGroupPresentation{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", address=" + address +
                '}';
    }
}
