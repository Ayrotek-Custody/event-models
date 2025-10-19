package com.sentinera.event.model.result;

public record ApiResponse<T>(
        int status,
        T data,
        String message) {
}
