package com.sentinera.event.model.result.request;

import java.util.List;

public record TransactionHistoryRequest(List<AddressNetwork> addresses, int limit) {
    public record AddressNetwork(String address, List<String> networks) {
    }
}


