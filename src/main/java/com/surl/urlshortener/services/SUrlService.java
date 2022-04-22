package com.surl.urlshortener.services;

import com.surl.urlshortener.dtos.Url.requests.ShortenUrlRequestDto;
import com.surl.urlshortener.dtos.Url.responses.ShortenUrlResponseDto;
import com.surl.urlshortener.repository.SUrlRepository;

public interface SUrlService {
    SUrlRepository fetchRepository();
    ShortenUrlResponseDto shortenedUrlResponse(ShortenUrlRequestDto shortenUrlRequest);
}
