package com.aegisight.apiintegration.model;

public record ApiResponse<T>(
        int status,
        T data,
        String message) {
}
