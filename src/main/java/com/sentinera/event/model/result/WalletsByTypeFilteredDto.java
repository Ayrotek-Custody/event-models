package com.sentinera.event.model.result;

import java.util.List;

public record WalletsByTypeFilteredDto(List<String> hotWallet, List<String> warmWallet, List<String> coldWallet) {
}
