package com.surl.urlshortener.dtos.Url.responses;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class ApiResponse {
    private boolean isSuccessful;
    private String message;
}
