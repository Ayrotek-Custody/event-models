package com.aegisight.apiintegration.model.response;

import java.util.List;

public record WalletTransactionResponse(
        String after,
        int totalCount,
        List<Transaction> transactions
) {
    public record Transaction(
            String hash,
            long blockTimestamp,
            long blockNumber,
            String blockHash,
            String nonce,
            int transactionIndex,
            String fromAddress,
            String toAddress,
            String contractAddress,
            String value,
            String gasPrice,
            String gas,
            String network,
            List<Log> logs) {
    }

    public record Log(
            String transactionHash,
            String contractAddress,
            int logIndex,
            boolean removed,
            List<String> topics,
            String data
    ) {
    }
}
