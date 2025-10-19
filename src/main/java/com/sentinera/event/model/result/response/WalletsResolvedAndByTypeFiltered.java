package com.sentinera.event.model.result.response;


import com.sentinera.event.model.result.TokenData;

import java.util.List;

public class WalletsResolvedAndByTypeFiltered {
    private List<TokenData> hotWallet;
    private List<TokenData> warmWallet;
    private List<TokenData>coldWallet;

    public WalletsResolvedAndByTypeFiltered(List<TokenData> hotWallet, List<TokenData> warmWallet, List<TokenData> coldWallet) {
        this.hotWallet = hotWallet;
        this.warmWallet = warmWallet;
        this.coldWallet = coldWallet;
    }

    public WalletsResolvedAndByTypeFiltered() {
    }

    public List<TokenData> getHotWallet() {
        return hotWallet;
    }

    public void setHotWallet(List<TokenData> hotWallet) {
        this.hotWallet = hotWallet;
    }

    public List<TokenData> getWarmWallet() {
        return warmWallet;
    }

    public void setWarmWallet(List<TokenData> warmWallet) {
        this.warmWallet = warmWallet;
    }

    public List<TokenData> getColdWallet() {
        return coldWallet;
    }

    public void setColdWallet(List<TokenData> coldWallet) {
        this.coldWallet = coldWallet;
    }
}
