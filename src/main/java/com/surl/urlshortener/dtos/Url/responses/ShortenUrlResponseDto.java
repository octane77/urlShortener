package com.surl.urlshortener.dtos.Url.responses;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
public class ShortenUrlResponseDto {
//    TODO Write the logic that shortens the url here
    private String shortenedUrl;
}
