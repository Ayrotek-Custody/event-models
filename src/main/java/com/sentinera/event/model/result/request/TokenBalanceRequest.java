package com.sentinera.event.model.result.request;

import java.util.List;

public class TokenBalanceRequest {
    private List<AddressNetwork> addresses;

    public TokenBalanceRequest(List<AddressNetwork> addresses) {
        this.addresses = addresses;
    }

    // Getter ve Setter
    public List<AddressNetwork> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressNetwork> addresses) {
        this.addresses = addresses;
    }
}
