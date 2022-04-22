package com.surl.urlshortener.utils;

import com.surl.urlshortener.dtos.Url.requests.ShortenUrlRequestDto;
import com.surl.urlshortener.dtos.Url.responses.ShortenUrlResponseDto;
import com.surl.urlshortener.models.Url;

public class UrlModelMapper {
    public static Url map(ShortenUrlRequestDto shortenUrlRequest){
        Url url = new Url();
        url.setUrl(shortenUrlRequest.getUrl());
        return url;
    }

    public static ShortenUrlResponseDto map(Url url){
        ShortenUrlResponseDto response = new ShortenUrlResponseDto();
        response.setShortenedUrl(url.getUrl());
        url.setSurl(response.getShortenedUrl());
        return response;
    }
}
