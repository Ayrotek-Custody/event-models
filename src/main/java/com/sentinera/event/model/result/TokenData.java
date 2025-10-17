package com.aegisight.apiintegration.model;

public record TokenData(String tokenName, String tokenAddress, String hexValue,
                        double tokenPrice, int decimals) {
}
