package com.sentinera.event.model.result.response;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public record WalletTokenBalancesResponse(Data data) {
    public record Data(List<Token> tokens) {
    }

    public record Token(String address, String network, String tokenAddress, String tokenBalance,
                        TokenMetadata tokenMetadata, List<TokenPrices> tokenPrices) {
    }

    public record TokenMetadata(String symbol, int decimals, String name) {
    }

    public record TokenPrices(String currency, BigDecimal value, Date lastUpdatedAt) {
    }
}