package com.sentinera.event.model.result.request;

import java.util.List;

public class AddressNetwork {
    private String address;
    private List<String> networks;

    public AddressNetwork(String address) {
        this.address = address;
        this.networks = List.of("eth-mainnet");
    }


    // Getter ve Setter
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getNetworks() {
        return networks;
    }

    public void setNetworks(List<String> networks) {
        this.networks = networks;
    }
}
