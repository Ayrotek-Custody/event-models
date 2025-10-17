package com.aegisight.apiintegration.model;

import java.util.List;

public record WalletsByTypeFilteredDto(List<String> hotWallet, List<String> warmWallet, List<String> coldWallet) {
}
