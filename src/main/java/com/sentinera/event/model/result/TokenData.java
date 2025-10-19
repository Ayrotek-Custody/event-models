package com.sentinera.event.model.result;

public record TokenData(String tokenName, String tokenAddress, String hexValue,
                        double tokenPrice, int decimals,String symbol) {
}
