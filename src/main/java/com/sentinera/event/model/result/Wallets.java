package com.sentinera.event.model.result;

public class Wallets {
    private WalletDistribution hot;
    private WalletDistribution warm;
    private WalletDistribution cold;

    public Wallets(WalletDistribution hot, WalletDistribution warm, WalletDistribution cold) {
        this.hot = hot;
        this.warm = warm;
        this.cold = cold;
    }

    public Wallets() {
    }

    public WalletDistribution getHot() {
        return hot;
    }

    public void setHot(WalletDistribution hot) {
        this.hot = hot;
    }

    public WalletDistribution getWarm() {
        return warm;
    }

    public void setWarm(WalletDistribution warm) {
        this.warm = warm;
    }

    public WalletDistribution getCold() {
        return cold;
    }

    public void setCold(WalletDistribution cold) {
        this.cold = cold;
    }
}
