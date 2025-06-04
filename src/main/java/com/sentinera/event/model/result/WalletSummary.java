package com.sentinera.event.model.result;

import java.util.List;

public class WalletSummary {
    private List<Group> groups;
    private Total totals;

    public WalletSummary(List<Group> groups, Total totals) {
        this.groups = groups;
        this.totals = totals;
    }

    public WalletSummary() {
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public Total getTotals() {
        return totals;
    }

    public void setTotals(Total totals) {
        this.totals = totals;
    }
}
